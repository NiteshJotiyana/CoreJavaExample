package com.java.design.pattern.factory;

public class Triangle extends Shape {

	static {
		ShapeFactory.getInstance().register("TRIANGLE", new Triangle());
	}

	@Override
	public String toString() {

		return "Triangle of 20CM2 AREA";
	}

	@Override
	public Shape create() {

		return new Triangle();
	}

}
