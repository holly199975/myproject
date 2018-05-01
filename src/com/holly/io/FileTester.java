package com.holly.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
		
			try {
				writeTest();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	public static void writeTest() throws IOException{ //FileNotFoundExeption是IOException的子類別
		FileOutputStream out = new FileOutputStream("data.txt");
		out.write(65);
		out.flush(); //沖掉
		out.close();
	}
	//如果是小錯誤可以在writeTest自己解決，大錯誤再呼叫main
}
