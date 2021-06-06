package com.java.design.pattern.pool;

import java.util.HashSet;

/*
 * Singleton 
 */
public abstract class ConnectionPool {

	HashSet<Connection> pool;
	int MAX_LIMIT = 5;
	long TIME_OUT = 20000;

	public ConnectionPool() {
	}

	public abstract Connection getConnection();

	public abstract void releaseConnection(Connection connection);
}
