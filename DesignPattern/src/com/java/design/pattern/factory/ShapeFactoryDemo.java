package com.java.design.pattern.factory;

public class ShapeFactoryDemo {

	static {
		try {
			Class.forName("com.java.design.pattern.factory.Circle");
			Class.forName("com.java.design.pattern.factory.Triangle");
			Class.forName("com.java.design.pattern.factory.Square");
		} catch (ClassNotFoundException any) {
			any.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ShapeFactory factory = ShapeFactory.getInstance();
		Shape shape1 = factory.createShape("CIRCLE");
		Shape shape2 = factory.createShape("TRIANGLE");
		Shape shape3 = factory.createShape("SQUARE");

		System.out.println(factory.map.keySet().size());
		for (String type : factory.map.keySet()) {
			System.out.println(type);
		}
		System.err.println(shape1);
		System.err.println(shape2);
		System.err.println(shape3);
	}
}
