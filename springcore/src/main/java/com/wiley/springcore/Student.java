package com.wiley.springcore;

import java.util.*;

import com.wiley.springcore.reftype.WileyB;

import java.io.*;
public class Student {

	private int countstud;
	private Address ob;
	
	public int getCountstud() {
		return countstud;
	}

	public void setCountstud(int countstud) {
		this.countstud = countstud;
	}

	public Address getOb() {
		return ob;
	}

	public void setOb(Address ob) {
		this.ob = ob;
	}

	private int studentId;
	private String studentName;
	private String studentAddress;
	private Properties props=new Properties();
	List<Integer>stulist = new ArrayList<Integer>();
	public Student(int studentId, String studentName, String studentAddress, List<Integer> stulist, Set<Integer> stuset,
			Map<String, String> stumap) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.stulist = stulist;
		this.stuset = stuset;
		this.stumap = stumap;
	}

	public List<Integer> getStulist() {
		return stulist;
	}

	public void setStulist(List<Integer> stulist) {
		this.stulist = stulist;
	}

	public Set<Integer> getStuset() {
		return stuset;
	}

	public void setStuset(Set<Integer> stuset) {
		this.stuset = stuset;
	}

	public Map<String, String> getStumap() {
		return stumap;
	}

	public void setStumap(Map<String, String> stumap) {
		this.stumap = stumap;
	}

	Set<Integer>stuset= new LinkedHashSet<Integer>();
	Map<String,String>stumap= new HashMap<String,String>();
	
	
	
	
	@Override
	public String toString() {
		return "Student [countstud=" + countstud + ", ob=" + ob + ", studentId=" + studentId + ", studentName="
				+ studentName + ", studentAddress=" + studentAddress + ", props=" + props + ", stulist=" + stulist
				+ ", stuset=" + stuset + ", stumap=" + stumap + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public Student(int studentId, String studentName, String studentAddress, Properties props, List<Integer> stulist,
			Set<Integer> stuset, Map<String, String> stumap) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.props = props;
		this.stulist = stulist;
		this.stuset = stuset;
		this.stumap = stumap;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
