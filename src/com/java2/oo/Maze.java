package com.java2.oo;


public class Maze {
	
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
