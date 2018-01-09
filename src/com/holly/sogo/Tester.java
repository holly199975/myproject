package com.holly.sogo;

import java.util.ArrayList;

public class Tester {

	
	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();
		
		customers.add(new Customer(10000));
		customers.add(new AgCustomer(10000));
		customers.add(new AuCustomer(10000));
		for(int i=0;i<customers.size();i++){
			Customer c = customers.get(i);
			c.print();
		}
		
		
		
		
		
		
		ArrayList list = new ArrayList();//ArrayList是集合,可以放異質資料
		list.add(94);
		list.add("aaa");
		list.add(55);
		list.add(4.8);
		int n = (int)list.get(2);//因為有異質資料所以他無法確定,必須要轉型
		String s = (String)list.get(1);
		
		System.out.println(list.get(0));//印出資料
		System.out.println(list.size());//問有幾個,就等於length的用途
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();//ArrayList是集合,可以放異質資料
		//< >是泛型用來標示特定類別,ArrayList<Integer>就變成專門放整數的集合
		list2.add(94);
		list2.add(66);
		list2.add(55);
		list2.add(4);
		int n2 = list2.get(2);//確定類別後就不用轉型了
		
		
		System.out.println(list2.get(0));
		System.out.println(list2.size());
		list2.remove(2);//摘除
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		
		
		
	}

}
