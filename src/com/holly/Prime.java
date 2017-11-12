package com.holly;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line); 
		if (n==1) {
			System.out.println(n +" not prime");
		}else {
		boolean prime = true;
		for (int i = 2; i < n; i++){ 
			if (n % i == 0){
				prime = false;
				//not prime
				break;//跳出迴圈
				//System.out.println("not prime");
			}
			
		} if (prime){
			System.out.println(n +" is prime");
		}else {
			System.out.println(n +" not prime");
		}
	}
					
		
	
	}
}
