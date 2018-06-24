package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*有一遊戲場地，長寬由執行當時決定，場地中亂數產生陷阱，陷阱樹也由當時才決定
 * 
 * 有一個玩家在這場地中，初始hp值為100，走一步消耗1hp，撞到邊界扣5hp，掉到陷阱扣20hp
 * 
 * 有個檔案(maze.txt)資訊如下:
 * 6,4
 * 5
 * 6,8,2,4,2,2,6,6,8,4,2,2,6*/
public class MazeMain {

	public static void main(String[] args) {
		try
		{
			FileReader fr = new FileReader("maze.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] tokens = line.split(",");
			int col = Integer.parseInt(tokens[0]);
			int row = Integer.parseInt(tokens[1]);
			line = in.readLine();
			int trapCount = Integer.parseInt(tokens[1]);
			Maze m = new Maze(col, row, trapCount);
			 System.out.println(col+","+row+","+ trapCount);
			
			
			int n = -1;
			while(m.hp > 0){
				System.out.println("請輸入方向:");
			Scanner scanner = new Scanner(System.in);
			String line1 = scanner.nextLine();
			 n = Integer.parseInt(line1);
			
				switch(n){
				case 2:
					if(m.pos/col < row - 1){
						m.pos = m.pos + col;
						m.hp = m.hp -1;
					}else{
						m.hp =m.hp -5;
					}
					System.out.println("hp"+":"+m.hp);
					System.out.println("pos"+":"+m.pos);
					break;
				case 4:
					if(m.pos % col != 0){
						m.pos = m.pos - 1;
						m.hp = m.hp -1;
					}else{
						m.hp = m.hp -5;
					}
					System.out.println("hp"+":"+m.hp);
					System.out.println("pos"+":"+m.pos);
					break;
				case 6:
					if(m.pos % col != col -1){
						m.pos = m.pos +1;
						m.hp = m.hp -1; 
					}else{
						m.hp =m.hp -5;
					}
					System.out.println("hp"+":"+m.hp);
					System.out.println("pos"+":"+m.pos);
					break;
				case 8:
					if (m.pos/col > 0){
						m.pos = m.pos - col;
						m.hp = m.hp -1;
					}else{
						m.hp =m.hp -5;
					}
					System.out.println("hp"+":"+m.hp);
					System.out.println("pos"+":"+m.pos);
					break;
				
				
			}
			
			
	}

		}catch(
		FileNotFoundException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(
		IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
