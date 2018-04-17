package com.holly.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTester {

	public static void main(String[] args) throws FileNotFoundException {//throws 出錯但不處理
		PrintStream out = new PrintStream("data.txt");
		out.println("Holly\t1\t10000");// \t 代表Tab
		out.flush();// 讓資料不要待在緩衝區
		out.close();
		
	}

}
