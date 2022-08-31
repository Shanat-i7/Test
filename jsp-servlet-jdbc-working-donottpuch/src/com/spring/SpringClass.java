package com.spring;

public class SpringClass {

	private int id;
	Cust cust;

	public Cust getCust() {
		return cust;
	}

	public void setCust(Cust cust) {
		this.cust = cust;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public void printid() {
		 
		 //System.out.println("cust id ---?"+cust.getId());
		System.out.println("id is =>"+this.id);
	}
	
	public void printidCust() {
		 
		System.out.println("cust id ---?"+cust.getId());
	 
	}
}
