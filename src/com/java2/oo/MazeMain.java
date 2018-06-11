package com.java2.oo;

public class MazeMain {
	/*有一遊戲場地，長寬由執行當時決定，場地中亂數產生陷阱，陷阱樹也由當時才決定
	 * 
	 * 有一個玩家在這場地中，初始hp值為100，走一步消耗1hp，撞到邊界扣5hp，掉到陷阱扣20hp
	 * 
	 * 有個檔案(maze.txt)資訊如下:
	 * 6,4
	 * 5
	 * 6,8,2,4,2,2,6,6,8,4,2,2,6*/
	public static void main(String[] args) {
		
		
		class Maze{
			int col,row,trapCount;
			int[] trap;
			Player player;
			
			public Maze(int col,int row,int trapCount){
				this.col = col;
				this.row = row;
				this.trapCount = trapCount;
			}
			class Player{
				int hp=100;
				int pos = 0;
			}
		}
		
		
	}

}
