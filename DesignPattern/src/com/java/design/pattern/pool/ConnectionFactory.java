package com.java.design.pattern.pool;

import java.util.HashMap;
import java.util.Map;

/*
 * Factory Pattern and Singleton
 */
public class ConnectionFactory {

	Map<String, Connection> map = new HashMap<String, Connection>();

	private static ConnectionFactory instance;

	private ConnectionFactory() {

	}

	public static ConnectionFactory getConnectionFactoryInstance() {

		if (instance == null)
			instance = new ConnectionFactory();

		return instance;
	}

	public Connection create(String type) {
		return map.get(type).create();
	}

	public void register(String type, Connection connection) {
		map.put(type, connection);
	}

}
