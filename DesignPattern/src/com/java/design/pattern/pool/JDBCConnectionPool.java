package com.java.design.pattern.pool;

import java.util.HashSet;
import java.util.Iterator;

public class JDBCConnectionPool extends ConnectionPool {

	static {
		try {
			Class.forName("com.java.design.pattern.pool.JDBCConnection");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static JDBCConnectionPool instance;

	private JDBCConnectionPool() {

		pool = new HashSet<Connection>();
		ConnectionFactory factory = ConnectionFactory.getConnectionFactoryInstance();
		int i = 0;
		while (i < MAX_LIMIT) {
			Connection connection = factory.create("JDBC");
			pool.add(connection);
			i++;
		}

	}

	public static JDBCConnectionPool getInstance() {
		if (instance == null)
			instance = new JDBCConnectionPool();

		return instance;
	}

	@Override
	public Connection getConnection() {
		System.out.println("getConnection called.");
		Iterator<Connection> itr = pool.iterator();

		while (itr.hasNext()) {
			Connection con = itr.next();
			itr.remove();
			return con;
		}
		return null;
	}

	@Override
	public void releaseConnection(Connection connection) {
		if (connection instanceof JDBCConnection) {
			System.out.println("Connection Released");
			pool.add(connection);
			System.out.println("Current Available Connection : " + pool.size());
		}
	}

}
