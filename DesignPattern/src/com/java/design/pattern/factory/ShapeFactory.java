package com.java.design.pattern.factory;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	Map<String, Shape> map = new HashMap<String, Shape>();
	static ShapeFactory instance;

	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	public static ShapeFactory getInstance() {
		if (instance == null) {
			instance = new ShapeFactory();
		}
		return instance;

	}

	public Shape createShape(String type) {

		return map.get(type).create();

	}

	public void register(String type, Shape shape) {
		map.put(type, shape);
	}
}
