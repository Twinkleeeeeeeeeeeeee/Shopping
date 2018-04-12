package com.briup.pojo;

public class OrderLine {
	private int id ;//����id
	private int num;//��������
	private OrderForm orderform;//������Ŀ
	private Book book;//�����鼮
	
	public OrderLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderLine(int id, int num, OrderForm orderform, Book book) {
		super();
		this.id = id;
		this.num = num;
		this.orderform = orderform;
		this.book = book;
	}

	public OrderLine(int id, int num, Book book) {
		super();
		this.id = id;
		this.num = num;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public OrderForm getOrderform() {
		return orderform;
	}

	public void setOrderform(OrderForm orderform) {
		this.orderform = orderform;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "OrderLine [id=" + id + ", num=" + num + ", orderform=" + orderform + ", book=" + book + "]";
	}
	
	
	
	
}
