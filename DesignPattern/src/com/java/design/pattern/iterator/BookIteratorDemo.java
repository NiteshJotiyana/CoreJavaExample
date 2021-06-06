package com.java.design.pattern.iterator;

import java.util.Iterator;

public class BookIteratorDemo {

	public static void main(String[] args) {

		BookContainer container = new BookContainer(10);
		container.add(new Book("Hindi", 121, "Gayatri"));
		container.add(new Book("English", 122, "Nitesh"));
		container.add(new Book("Math", 123, "Nikhil"));
		container.add(new Book("History", 124, "Nikhil"));
		container.add(new Book("Design", 125, "Harish"));
		container.add(new Book("Math", 126, "Nishant"));

		Iterator<Book> itr = container.createIterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b.getName() + " " + b.getId());
		}
	}
}
