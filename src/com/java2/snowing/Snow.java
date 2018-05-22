package com.java2.snowing;
//1.設計Snow類別代表一顆雪
 //x,y,Thread,降落,飄
import java.util.Random;

public class Snow extends Thread{
	Random random = new Random();
	int x;
	int y = 800;
	public Snow() {
		x = random.nextInt(600);//0~599
		
	}
	
	@Override
	public void run() {
		for(int i=800; i>0; i--){
			//System.out.println(getName()+":("+x+","+y+")");
			y = y-1;
			int movement = random.nextInt(3)-1; //0~2再 -1
			x = x-movement;
			System.out.print(new String(new char[x]).replace("\0"," "));
			System.out.println("雪");
		}
	}
	
	
}
