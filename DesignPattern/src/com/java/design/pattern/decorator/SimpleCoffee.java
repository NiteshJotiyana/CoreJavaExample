package com.java.design.pattern.decorator;

import java.util.Arrays;

public class SimpleCoffee implements Coffee {

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 10.00;
	}

	@Override
	public String[] getIngredients() {
		String ingredients[] = { "Coffee Bean", "Sugar", "Spices", "Black Papper" };
		return ingredients;
	}

	@Override
	public String toString() {

		return "Cost : " + getCost() + " ::: Ingredients : " + Arrays.toString(getIngredients());
	}

}
