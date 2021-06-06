package com.java.design.pattern.factory;

public class Square extends Shape {

	static {
		ShapeFactory.getInstance().register("SQUARE", new Square());
	}

	@Override
	public String toString() {

		return "Square of 10CM Side";
	}

	@Override
	public Shape create() {

		return new Square();
	}
}
