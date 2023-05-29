package com.wiley.springcore.stereotype;

import org.springframework.stereotype.Component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
@Component("sob")
public class Student {
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	@Value("Venkat")
private String studentName;
	@Value("Bangalore")
private String city;
@Value("#{mycities}")
private List<String>cities;

public List<String> getCities() {
	return cities;
}
public void setCities(List<String> cities) {
	this.cities = cities;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
