package com.wiley.springcore;

public class Address {

	private int count;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int count) {
		super();
		this.count = count;
	}
	@Override
	public String toString() {
		return "Address [count=" + count + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
