package com.holly.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
		try { 
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(65);
			out.flush(); //沖掉
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not FOUND!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
