package com.java.design.pattern.iterator;

import java.util.Iterator;

public interface Container<E> {

	public void add(E e);

	public Iterator<E> createIterator();
}
