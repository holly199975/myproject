package com.holly;

import java.util.Scanner;

public class WeekTester {

	public static void main(String[] args) {
		/*System.out.println("please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int i = Integer.parseInt(line);*/
		int n = 0; 
		switch(n){
		case 1:
			System.out.println("星期一");
			 break;
		case 2:
			System.out.println("星期二");
			 break;
		case 3:
			System.out.println("星期三");
			 break;
		case 4:
			System.out.println("星期四");
			 break;
		case 5:
			System.out.println("星期五");
			 break;
		case 6:
			System.out.println("星期六");
			 break;
		case 7:
			System.out.println("星期日");
			 break;
		case 0:
			System.out.println("星期日");
			 break;
		default: //其他的
				 System.out.println("wrong");
		}
	}

}
