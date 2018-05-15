package com.holly.java2.threading;

public class HorseRunnable implements Runnable{

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
