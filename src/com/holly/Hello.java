package com.holly;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("請輸入您的名字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("Hello,"+ line);
		
		System.out.println("你幾歲?");
		line = scanner.nextLine();
		int age = Integer.parseInt(line);//代表轉換   parse是解析
		System.out.println(age);
		System.out.println(age>25);
		
	}

}
