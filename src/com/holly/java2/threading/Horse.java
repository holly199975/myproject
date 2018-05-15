package com.holly.java2.threading;

public class Horse extends Thread { //Thread是執行緒
	@Override
	public void run(){ //Thread裡面的方法
		for(int i=0; i<=100; i++){
			System.out.println(getName() + ":" +i);
			try {
				sleep(50); //單位是毫秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
