package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();//List是父類別,ArrayList是子類別
		cards.add(50);
		cards.add(6);
		cards.add(8);
		cards.set(1, 99);//替換
		System.out.println("removing number:"+cards.remove(0));
		System.out.println(cards.size());
		System.out.println(cards.get(0));
		
	}

}
