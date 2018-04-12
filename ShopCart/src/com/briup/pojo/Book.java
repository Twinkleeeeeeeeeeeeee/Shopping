package com.briup.pojo;

public class Book {
	private int id;
	private String name;
	private Double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Book(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
