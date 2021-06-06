package com.java.design.pattern.factory;

public class Circle extends Shape {

	static {
		ShapeFactory.getInstance().register("CIRCLE", new Circle());
	}

	@Override
	public String toString() {

		return "Circle of 10CM Diameter";
	}

	@Override
	public Shape create() {

		return new Circle();
	}
}
