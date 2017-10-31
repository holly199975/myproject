package com.holly;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字");
		Scanner scanner = new Scanner(System.in);
		//Scanner 為讀取資料  
		//System.in 代表從系統中抓出剛剛輸入的字命名為scanner
		String line = scanner.nextLine();
	int n = Integer.parseInt(line);//定義 n為line
      if (n % 2 == 1){
    	  System.out.println("是奇數");
      }else{
    	  System.out.println("是偶數");
      }
	}

}
