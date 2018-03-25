package com.java2.object;

import java.util.Random;

public class Poker {
	Random random = new Random();
	int[] cards= new int [52]; 
	String flowers = "SHDC";
	public Poker(){
		for(int i=0; i<cards.length; i++) {
			cards[i] = i;
			System.out.print((i%13) + 1 + " " + (flowers.charAt(i/13)));
		}
	}
	
	public void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int r = random.nextInt(52);
			int tmp = cards[r];
			cards[r] = cards[i];
			cards[i] =  tmp;
		}
	}
	
	public void print() {
		for(int i=0; i<cards.length; i++) {
			int c = cards[i];
			System.out.print((c%13) + 1 + " " + (flowers.charAt(c/13)));
			if(i%13==0) {
				System.out.println();
			}
		}
		
	}

}
