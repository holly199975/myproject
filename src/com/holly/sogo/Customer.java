package com.holly.sogo;



public class Customer implements Destroyable{
	int amount;
	float discount = 0.05f;
	public Customer(int amount){
		this.amount = amount;
	}
	
	public void print(){
		 int total = (int)(amount*(1-discount));
		System.out.println("消費金額:"+amount +"\t" +"折扣後總額:" +total);
	}
	
	public Customer(){
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
