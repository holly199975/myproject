package com.java2.object;

import com.holly.sogo.Customer;

public class AuMember extends Member {
	public AuMember(int amount){
		super(amount);
		super.discount = 0.1f; 
		
	}
	private int bonus;
	

	public void print(){
		int bonus = 1000;
		 int total = (int)(amount*discount);
		System.out.println("當月消費金額:"+amount +"\t" +"折價券" +total + bonus);
	}

}
