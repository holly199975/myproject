package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {
	Random random = new Random();
	List<Integer> cards = new ArrayList<>();
	String flowers = "SHDC";
	public Poker2(){
		for(int i=0; i<cards.size(); i++) {
			cards.add(i);
			System.out.print((i%13) + 1 +" "+ (flowers.charAt(i/13)));
		}
	}
	public void shuffle() {
		for(int i=0; i<cards.size(); i++) {
			int r = random.nextInt(52);
			cards.set(i, r);
		}
	}
}
