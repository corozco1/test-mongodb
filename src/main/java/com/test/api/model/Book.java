package com.test.api.model;

import org.springframework.data.annotation.Id;

/*
 * Clase Book
 */
public class Book {

	@Id
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	
}
