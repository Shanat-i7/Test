package com.spring;

public class Main2 {
	
	
public static void main(String[] args) {
	
	SpringClass2  class1 = new SpringClass2(12);
	class1.printid();
	
	
	Cust  cust = new Cust();
	cust.setId(898787);
	
	
	SpringClass2  class2 = new SpringClass2(cust);
	
	class2.printidCust();
}
}
