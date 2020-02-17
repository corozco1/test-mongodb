package com.test.api.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;

/*
 * Clase Book
 */
public class Book {

	@Id
	private BigInteger id; 
	private String name;
	
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
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
