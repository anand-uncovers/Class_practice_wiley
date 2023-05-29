package com.wiley.springcore.ci;

public class Cert {
  private String name;
private int id;
  private Cert cert1;
  
public Cert(String name,int id,Cert cert1) {
	super();
	this.name = name;
	this.id=id;
	this.cert1=cert1;
}

@Override
public String toString() {
	return this.name+": "+this.id+"{"+this.cert1.name+"}";
			
}
  
}
