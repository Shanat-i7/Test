package com.spring;

public class SpringClass2 {

	private int id;

	Cust cust;
	 


	public SpringClass2(Cust cust) {
		super();
		this.cust = cust;
	}





	public SpringClass2(int id) {
		super();
		this.id = id;
	}





	public void printid() {
		System.out.println("id is =>"+this.id);
	}
	
	public void printidCust() {
		System.out.println("cust id is =>"+this.cust.getId());

}
}