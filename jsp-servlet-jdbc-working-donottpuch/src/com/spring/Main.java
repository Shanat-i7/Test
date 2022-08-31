package com.spring;

public class Main {
	
	
public static void main(String[] args) {
	
	SpringClass  class1 = new SpringClass();
	class1.setId(23);
	class1.printid();
	
	Cust  cust = new Cust();
	cust.setId(55566);
	
	
	class1.setCust(cust);
	
	class1.printidCust();
}
}
