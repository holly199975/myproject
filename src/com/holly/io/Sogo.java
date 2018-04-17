package com.holly.io;

import java.util.Scanner;

public class Sogo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入功能(1~3):");
		int function = scanner.nextInt();
		switch(function){
		case 3 :
			return;
		}
	}
	
	public void showFunctions(){
		System.out.println("1)輸入銷售紀錄");
		System.out.println("2)印出銷售紀錄");
		System.out.println("3)結束程式");
	}
}
