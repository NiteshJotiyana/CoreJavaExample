package com.java.design.pattern.pool;

public interface Connection {

	public boolean execute();

	public Connection create();
}
