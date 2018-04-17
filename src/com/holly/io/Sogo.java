package com.holly.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Sogo {
	
	Scanner scanner = new Scanner(System.in);
	
	public Sogo(){
		
	}
	public void start(){
		int function = 0;
		while(function != 3){
			showFunctions();
		 function = scanner.nextInt();
		
		switch(function){
		case 1 :
			inputSales();
			break;
		case 3 :
			return;
		}
		}
	}
	
	public void inputSales(){
		try {
			FileOutputStream fos = new FileOutputStream("sales",true);
			PrintStream out = new PrintStream(fos);
			System.out.println("請輸入會員級別:");
			int type = scanner.nextInt();
			System.out.println("請輸入會員資料:");
			int amout = scanner.nextInt();
			out.println(type+"\t"+amout);// \t 代表Tab
			out.flush();// 讓資料不要待在緩衝區
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//讓資料可以儲存不會每次重輸入就被洗掉
		
	}
	
	
	public void showFunctions(){
		System.out.println("請輸入功能(1~3):");
		System.out.println("1)輸入銷售紀錄");
		System.out.println("2)印出銷售報表");
		System.out.println("3)結束程式");
	}
	
	public static void main(String[] args) {
		Sogo sogo = new Sogo();
		sogo.start();
	}
}
