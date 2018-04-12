package com.briup.pojo;

import java.util.Date;

public class OrderForm {
	private int id;
	private double cost;//消费总额
	private Date orderDate;//下单日期
	private int customerId;//顾客id
	
	public OrderForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderForm(int id, double cost, Date orderDate, int customerId) {
		super();
		this.id = id;
		this.cost = cost;
		this.orderDate = orderDate;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "OrderForm [id=" + id + ", cost=" + cost + ", orderDate=" + orderDate + ", customerId=" + customerId
				+ "]";
	}
	
}
