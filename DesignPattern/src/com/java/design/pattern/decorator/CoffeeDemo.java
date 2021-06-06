package com.java.design.pattern.decorator;

public class CoffeeDemo {

	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee);
		
		coffee = new MilkCoffeeDecorator(coffee);
		System.out.println(coffee);
		
		coffee = new SprinkleCoffeeDecorator(coffee);
		System.out.println(coffee);
	}
}
