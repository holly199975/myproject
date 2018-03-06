package com.java2.object;

public class Member {
	int amount;
	float discount = 0.05f;
	public Member(int amount){
		this.amount = amount;
	}
	public void print(){
		 int total = (int)(amount*discount);
		System.out.println("當月消費金額:"+amount +"\t" +"折價券" +total);
	}
	
	public Member(){
		
	}

}
