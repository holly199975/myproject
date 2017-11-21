package com.holly;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		int n = -1;//n不管=多少都沒差
		while(n != 0){
			System.out.println("請輸入方向:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		 n = Integer.parseInt(line);
		
			switch(n){
			case 2:
				System.out.println("向下");
				break;
			case 4:
				System.out.println("向左");
				break;
			case 6:
				System.out.println("向右");
				break;
			case 8:
				System.out.println("向上");
				break;
			case 0:
				System.out.println("bye");
				break;
			
			}
		}
		
		
}
}	
