package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;

public class VendingMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		FileReader fr = new FileReader("Vending.txt");
		BufferedReader in = new BufferedReader(fr);
		String line = in.readLine();
		String[] tokens = line.split(",");
		int count = Integer.parseInt(tokens[0]);
		
		
		vm.drinks.add(new Drink(id, name, price));
	}

}
