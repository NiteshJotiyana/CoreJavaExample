package com.java.design.pattern.decorator;

import java.util.ArrayList;
import java.util.Arrays;

public class SprinkleCoffeeDecorator implements CoffeeDecorator {

	Coffee c;

	public SprinkleCoffeeDecorator(Coffee c) {
		this.c = c;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return c.getCost() + 10.0;
	}

	@Override
	public String[] getIngredients() {

		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(c.getIngredients()));
		arrayList.add("Sprinkle");
		return arrayList.toArray(new String[0]);
	}

	@Override
	public String toString() {

		return "Cost : " + getCost() + " ::: Ingredients : " + Arrays.toString(getIngredients());
	}
}
