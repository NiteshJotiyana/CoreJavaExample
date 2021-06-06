package com.java.design.pattern.pool;

public class JDBCConnection implements Connection {

	static {
		ConnectionFactory.getConnectionFactoryInstance().register("JDBC", new JDBCConnection());
	}

	@Override
	public boolean execute() {

		System.out.println("JDBC Connection Executing Query");
		return true;
	}

	@Override
	public Connection create() {

		return new JDBCConnection();
	}

}
