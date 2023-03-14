package com.kbstar.dto;

import java.util.Date;

public class Item {
	private String id;
	private String name;
	private int price;
	private double rate;
	private Date date;
	
	public Item() {
	}

	public Item(String id, String name, int price, double rate, Date date) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rate = rate;
		this.date = date;
	}
	

	public Item(String name, int price, double rate) {
		this.name = name;
		this.price = price;
		this.rate = rate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", rate=" + rate + ", date=" + date + "]";
	}
	
	
	
}
