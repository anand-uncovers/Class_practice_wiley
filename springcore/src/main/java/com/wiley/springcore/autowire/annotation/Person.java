package com.wiley.springcore.autowire.annotation;

import java.util.List;

public class Person {
private List<String>friends;

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}
   
}
