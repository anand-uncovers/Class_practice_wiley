package com.wiley.springcore.reftype;

public class WileyB {
private int count;

@Override
public String toString() {
	return "WileyB [count=" + count + "]";
}

public WileyB() {
	super();
	// TODO Auto-generated constructor stub
}

public WileyB(int count) {
	super();
	this.count = count;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}
}
