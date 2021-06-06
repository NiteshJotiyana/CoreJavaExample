package com.java.design.pattern.pool;

public class HbaseConnection implements Connection {

	static {
		ConnectionFactory.getConnectionFactoryInstance().register("HBASE", new HbaseConnection());
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection create() {

		return new HbaseConnection();
	}

}
