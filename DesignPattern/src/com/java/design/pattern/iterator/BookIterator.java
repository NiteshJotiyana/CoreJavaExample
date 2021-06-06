package com.java.design.pattern.iterator;

import java.util.Iterator;

public class BookIterator implements Iterator<Book> {

	private Book[] list;
	private int pos = 0;
	private int size = 0;

	public BookIterator(Book[] list, int size) {
		this.list = list;
		this.size = size;
	}

	@Override
	public boolean hasNext() {
		if (pos >= size)
			return false;

		return true;

	}

	@Override
	public Book next() {
		if (pos < size) {
			while (pos < size) {
				Book cur = list[pos];
				if (cur.getId() > 124) {
					pos++;
					return cur;
				}
				pos++;
			}
			return null;

		}
		return null;
	}

}
