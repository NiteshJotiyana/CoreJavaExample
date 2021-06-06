package com.java.design.pattern.iterator;

import java.util.Iterator;

public class BookContainer implements Container<Book> {

	private Book list[];
	private int index;
	private int size;

	public BookContainer(int size) {
		this.size = size;
		list = new Book[size];
	}

	@Override
	public void add(Book e) {
		if (index >= size)
			System.out.println("Max Limit reached");
		else {
			list[index] = e;
			index++;
		}
	}

	@Override
	public Iterator<Book> createIterator() {

		return new BookIterator(list,index);
	}

}
