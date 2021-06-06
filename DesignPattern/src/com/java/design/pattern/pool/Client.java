package com.java.design.pattern.pool;

public class Client {

	public static void main(String[] args) {
		// create JDBC Connection
		JDBCConnectionPool pool = JDBCConnectionPool.getInstance();

		System.out.println("JDBCConnectionPool Created.");

		Connection connection = pool.getConnection();
		System.out.println("Connection Created.");

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			connection.execute();
		}

		pool.releaseConnection(connection);
	}
}
