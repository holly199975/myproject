package com.java2.schdule;

import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 有一文字檔儲存了課表資料(schedule.txt)
 * 請讀取資料後，設計程式可檢查是否有空檔?
 * 如:
 * 請輸入星期(1-7):2
 * 請輸入時(0-24):11
 * 【有空檔】
 * 請輸入星期(1-7):4
 * 請輸入時(0-24):14
 * 【有課: C004 English 到 16時 】*/
public class Main {
	List<Course> courses = new ArrayList<>();
	public Main(){
		readCourses();
		
		Scanner scanner = new Scanner(System.in);
		int weekDay = scanner.nextInt();
		System.out.println("請輸入星期(1-7):");
		int hour = scanner.nextInt();
		System.out.println("請輸入時(0-24):");
		
		
	}
	
	public void readCourses(){
		
	}
	public static void main(String[] args) {
		
	}

}
