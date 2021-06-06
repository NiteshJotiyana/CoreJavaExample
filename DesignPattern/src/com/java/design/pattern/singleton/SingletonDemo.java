package com.java.design.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();

		// serialization
		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream("/Users/nitesh/git/SparkProjects/DesignPattern/Singleton.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(s);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		// deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream("/Users/nitesh/git/SparkProjects/DesignPattern/Singleton.txt");
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			System.out.println("readObject-start");
			Singleton s1 = (Singleton) in.readObject();
			System.out.println("readObject-end");

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("s = " + s.hashCode());
			System.out.println("s1 = " + s1.hashCode());

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}
}
