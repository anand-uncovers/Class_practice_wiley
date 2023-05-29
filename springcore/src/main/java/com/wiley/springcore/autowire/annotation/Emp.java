package com.wiley.springcore.autowire.annotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	//@Qualifier("emp1")
//Autowired

List<Integer>phones = new ArrayList<Integer>();
	Set<String>addresses= new LinkedHashSet<String>();
	Map<String,String>courses= new HashMap<String,String>();

public Emp(List<Integer> phones, Set<String> addresses, Map<String, String> courses, Address address) {
		super();
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.address = address;
	}
public List<Integer> getPhones() {
		return phones;
	}
	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

private Address address;

public Address getAddress() {
	return address;
}
//@Autowired
public void setAddress(Address address) {
	this.address = address;
}

public Emp(Address address) {
	super();
	this.address = address;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Emp [phones=" + phones + ", addresses=" + addresses + ", courses=" + courses + ", address=" + address + "]";
}



}
