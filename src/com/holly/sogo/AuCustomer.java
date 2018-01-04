package com.holly.sogo;

public class AuCustomer extends Customer {
	public AuCustomer(int amount){
		super(amount);
		super.discount = 0.1f; 
		
	}
	int bonus =(int) (amount*0.1);
	public void print(){
		System.out.println(amount +"\t" +(int)(amount*(1-discount))+ "\t" + bonus);
	}
	/*public int bonus =(int) (amount*0.1);
	public void AuCustomer() {
		//public int bonus =(int) (amount*0.1);
		System.out.println(bonus);
	}*/
}
