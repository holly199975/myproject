package com.holly;

import java.util.Scanner;

public class Stair {
	/*請使用者輸入一個數字,印出階梯型的星號
	 * 如:  請輸入6
	 * 結果   *
	 *     **
	 *     ***
	 * 	   ****
	 *     *****
	 *     ******
	 */
	public static void main(String[] args) {
		System.out.println("請輸入數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int j = Integer.parseInt(line);
		for(int i=j;i>0;i--) {
			System.out.print(" ");
		for(int n=j;n>=i;n--) {
				System.out.print("*");
				}
				System.out.println();
		 	
		}
			
		}
	}


