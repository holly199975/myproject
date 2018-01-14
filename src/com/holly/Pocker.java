package com.holly;

import java.util.Random;

public class Pocker {

	public static void main(String[] args) {
	int n[] = {1,2,3,4,5,6,7,8,9,10};
	
	Random r = new Random();
	for(int a=1;a<10;a++) {
	int i = r.nextInt(10);
	int tmp =  n[a];
	n[a] = n[i];
	n[i] = tmp;
	//System.out.print();
	}
	for(int u : n) {
		System.out.print(u+"\t");
	} 
	}
}
