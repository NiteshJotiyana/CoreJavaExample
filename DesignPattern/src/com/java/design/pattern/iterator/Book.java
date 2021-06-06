package com.java.design.pattern.iterator;

public class Book {

	private String name;
	private long id;
	private String author;

	public Book(String name, long id, String author) {
		super();
		this.name = name;
		this.id = id;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
