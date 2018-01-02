package com.holly.sogo;

public class AgCustomer extends Customer {
	public AgCustomer(int amount){
		super(amount);
		super.discount = 0.1f;
	}
	
	public AgCustomer(){
		
	}
	
}
