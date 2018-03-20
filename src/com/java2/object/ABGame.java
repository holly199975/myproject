package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		String secret = "9873";
		//String nums = "1356";
		int A = 0;
		int B = 0;
		Scanner scanner = new Scanner(System.in);
		while (A != 4) {
			A=0;
			B=0;
			System.out.print("Please enter a number:");
			String nums = scanner.nextLine();
			int length = secret.length();
			for (int i = 0; i < nums.length(); i++) {
				char c = nums.charAt(i); // charAt() 用來分別比較每個數字//
				for (int j = 0; j < length; j++) {
					if (c == secret.charAt(j)) {
						if (i == j) {
							A++;
						} else {

							B++;

						}
						break;
					}
				}

			}
			System.out.println(A + "A" + B + "B");
		}
		

	}
}
