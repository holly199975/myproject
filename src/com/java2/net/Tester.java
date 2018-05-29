package com.java2.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket("ptt.cc", 23); //連到ptt 後面是port 
			//要開cmd
			//ptt 的通訊協定是Telnet 要先連到Telnet才能執行
			//連線Telnet: 控制台->所有控制項目->程式與功能->點開啟或關閉Windows功能->Telnet客戶端打勾
			InputStream is =socket.getInputStream();
			int data =0;
			for(int i=0; i<500; i++){
			data = is.read();
			System.out.println((char)data);
			}
			is.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
