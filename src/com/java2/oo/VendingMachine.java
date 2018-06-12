package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	List<Drink> drinks = new ArrayList<>();
	
	public void start() {
		
		for(int i=0;i<drinks.size();i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getId()+"\t"+drink.getName()+"\t"+drink.getPrice());
		}
		System.out.println("請投幣(a=5元,b=10元,c=50元)或選擇飲料(1,2,3),或輸入0結束:");
		Scanner scanner = new Scanner(System.in);
		int d = 1;
		int m=0;
		while(d > 0) {
		String data= scanner.nextLine();
		 switch (data) {
		 case "a" :
			 m = m +5;
			if(m<0){
				System.out.println("餘額不足");
			}else
			System.out.println("目前餘額:"+m);
			break;
		case "b" :
			 m = m +10;
			 if(m<0){
					System.out.println("餘額不足");
				}else
			System.out.println("目前餘額:"+m);
			break;
		case "c" :
			 m = m +50;
			 if(m<0){
					System.out.println("餘額不足");
				}else
			System.out.println("目前餘額:"+m);
			break;
		case "1" :
			 m = m -25;
			 if(m<0){
					System.out.println("餘額不足");
				}else
			System.out.println("目前餘額:"+m);
			break;
		case "2" :
			 m = m -30;
			 if(m<0){
					System.out.println("餘額不足");
				}else
			System.out.println("目前餘額:"+m);
			break;
		case "3" :
			 m = m -20;
			 if(m<0){
					System.out.println("餘額不足");
				}else
			System.out.println("目前餘額:"+m);
			break;
		case "0":
			d = -1;
			break;

		
		}
		}
	}
		
}
