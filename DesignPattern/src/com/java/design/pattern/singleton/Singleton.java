package com.java.design.pattern.singleton;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

	private static Singleton INSTANCE = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {

			synchronized (Singleton.class) {

				if (INSTANCE == null) {
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return INSTANCE;
	}

	protected Object readResolve() {
		System.out.println("readResolve");
		return INSTANCE;
	}

}
