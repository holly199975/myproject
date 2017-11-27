package com.holly;

import java.util.Scanner;

public class Continue {
	/*Please enter a number 13
	 * 1 2 3 4 5 6 7 8 9 10 11 12 13
	 * 3的倍數不要印
	 */
	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for(int i=1;i<=n;i++){
			if(i%3 == 0){
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
			int a = 1;
			while(a <= n){
				if(a%3 == 0){
					a++;
					continue;
					}
			System.out.print(a + " ");
			a++;
			
	
		}
	}

}
