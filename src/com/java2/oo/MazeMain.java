package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
	class Maze{
		int col,row,trapCount;
		int[] trap;
		Player player;
		
		public Maze(int col,int row,int trapCount){
			this.col = col;
			this.row = row;
			this.trapCount = trapCount;
		}
		public void setCol(int col) {
			this.col = col;
		}
		public int getCol() {
			return col;
		}
		public void setRow() {
			this.row = row;
		}
		public int getRow() {
			return row;
		}
		public void setTrapCount(int trapCount) {
			this.trapCount = trapCount;
		}
		public int getTrapCount() {
			return trapCount; 
		}
		public void setTrap(int[] trap) {
			this.trap = trap;
		}
		public void setPlayer(Player player) {
			this.player = player;
		}
		public Player getPlayer() {
			return player;
		}
		class Player{
			int hp=100;
			int pos = 0;
			
			
		}
	}
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("maze.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] tokens = line.split(",");
			int col = Integer.parseInt(tokens[0]);
			int row = Integer.parseInt(tokens[1]);
			line = in.readLine();
			int trapCount = Integer.parseInt(tokens[0]);
			Maze m = new Maze(col, row, trapCount);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

}
}
