package com.holly;

public class Prime {

	public static void main(String[] args) {
		
		int n = 1000;
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
