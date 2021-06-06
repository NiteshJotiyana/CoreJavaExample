package com.java.design.pattern.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MilkCoffeeDecorator implements CoffeeDecorator {

	Coffee c;

	public MilkCoffeeDecorator(Coffee c) {
		this.c = c;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return c.getCost() + 5.0;
	}

	@Override
	public String[] getIngredients() {

		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(c.getIngredients()));
		arrayList.add("Milk");
		return arrayList.toArray(new String[0]);
	}

	@Override
	public String toString() {

		return "Cost : " + getCost() + " ::: Ingredients : " + Arrays.toString(getIngredients());
	}

}
