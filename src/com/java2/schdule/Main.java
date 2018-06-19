package com.java2.schdule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		System.out.println("請輸入星期(1-7):");
		int weekDay = scanner.nextInt();
		System.out.println("請輸入時(0-24):");
		int hour = scanner.nextInt();
		
	}
	
	public void readCourses(){
		try {
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] tokens = line.split(",");
			String id = tokens[0];
			String name = tokens[1];
			int weekDay = Integer.parseInt(tokens[2]);
			int hour = Integer.parseInt(tokens[3]);
			int duration = Integer.parseInt(tokens[4]);
			courses.add(new Course(id, name, weekDay, hour, duration));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Main();
	}

}
