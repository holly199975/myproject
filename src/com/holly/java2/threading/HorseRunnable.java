package com.holly.java2.threading;

public class HorseRunnable implements Runnable{ //implements 實作
	/*若我們設計的類別已經繼承了某類別時，因 Java 語言單一繼承的限制性，而無法繼承
	Thread 類別時，則可以利用 java.lang.Runnable 這個介面達到多執行緒
	的目的*/
	@Override
	public void run() {
		for(int i=0; i<=100; i++){
			System.out.println("R:" +i);
			try {
				Thread.sleep(50); //單位是毫秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
