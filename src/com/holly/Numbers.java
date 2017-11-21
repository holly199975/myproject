package com.holly;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.print("please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
			int i=0;
			while(i<=n){
				i=i+1;
				
				/*if(i%3==0){
					System.out.print("*");
				}*/
				System.out.print(i+" ");
				if(i>10){
					break;
				}
			}
		}
	}

	
	


