package com.ibm;

import java.util.Scanner;

public class VendorMachine {

	public static void main(String[] args) {
		int i = 1;
		int m = 0;
		while(i>0) {
		System.out.println("請投幣或選擇飲料(a或b或c),或輸入0結束:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		switch(line) {
		case "1" :
			 m = m +1;
			System.out.println("目前餘額:"+m);
			break;
		case "5" :
			 m = m +5;
			System.out.println("目前餘額:"+m);
			break;
		case "10" :
			 m = m +10;
			System.out.println("目前餘額:"+m);
			break;
		case "a" :
			m = m -15;
			/* if( (m -15)>=0) {
			System.out.println("DON!");	 
			System.out.println("目前餘額:"+(m-15));
			 }else
				 if(m <= 0) {
					 m = 0;
					 System.out.println("BEEP!"+"目前餘額:"+ m);
				 }else
				 System.out.println("BEEP!"+"目前餘額:"+m);*/
			if( (m -15)<=0) {
				System.out.println("BEEP!"+"目前餘額:"+m);
				 }else
					 System.out.println("DON!");	 
					System.out.println("目前餘額:"+(m-15));
					/*if(m <= 0) {
						 m = 0;
						 System.out.println("BEEP!"+"目前餘額:"+ m);
					}*/
			 break;
		case "b" :
			m = m -20;
			if( (m -20)>=0) {
				System.out.println("DON!");	 
				System.out.println("目前餘額:"+(m-20));
				 }else
					 if(m <= 0) {
						 m = 0;
						 System.out.println("BEEP!"+"目前餘額:"+ 0);
					 }else
					 System.out.println("BEEP!"+"目前餘額:"+m);
				 break;
		case "c" :
			m = m -30;
			if( (m -30)>=0) {
				System.out.println("DON!");	 
				System.out.println("目前餘額:"+(m-30));
				 }else
					 if(m <= 0) {
						 m = 0;
						 System.out.println("BEEP!"+"目前餘額:"+ 0);
					 }else
					 System.out.println("BEEP!"+"目前餘額:"+m);
				 break;
		case "0" :
			System.out.println("Bye!");
			i = -1;
			break;
		}
		}
	 
		
	}

}
