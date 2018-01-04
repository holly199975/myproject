package com.holly.sogo;

public class AuCustomer extends Customer {
	public AuCustomer(int amount){
		super(amount);
		super.discount = 0.1f; 
		
	}
	@Override
	public void print(){
		int bonus =(int) (amount*0.1);
		int total = (int)(amount*(1-discount));
		System.out.println("消費金額:"+amount +"\t" +"折扣後總額:" +total+ "\t" +"紅利:" +bonus);
	}
	
}
