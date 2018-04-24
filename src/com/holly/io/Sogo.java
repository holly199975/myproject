package com.holly.io;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.holly.sogo.AgCustomer;
import com.holly.sogo.AuCustomer;
import com.holly.sogo.Customer;

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
		case 2 :
			ArrayList<Sales> list = new ArrayList<>();
			
			FileInputStream fis;
			try {
				fis = new FileInputStream("sales.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader in = new BufferedReader(isr);
				String line = in.readLine();
				while(line != null){
				
				try {	
					String[] token = line.split("\t");//spilt代表分割()裡的是要用甚麼分割
					int type = Integer.parseInt(token[0]);
					int amount = Integer.parseInt(token[1]);
					Sales sales = new Sales(type,amount);
					list.add(sales);
				}catch(NumberFormatException e) {
					System.out.println("資料格式錯誤");
					return;
				}	
					line = in.readLine();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//report
			for(Sales sales:list) {// : for each
				Customer c = null;
				switch(sales.type) {
				case 1 :
					c = new Customer(sales.getAmount());
					break;
				case 2 :
					c = new AgCustomer(sales.getAmount());
					break;
				case 3 :
					c = new AuCustomer(sales.getAmount());
					break;
				}
				c.print();
			}
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
