package com.holly.java2.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tester {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(1);
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>(); //Set不能new
		set.add(4); //set不能重複,HashSet不排序
		set.add(1);
		set.add(3);
		set.add(1);
		System.out.println(set);
		
		Set<String> set2 = new HashSet<>();
		set2.add("Jack");
		set2.add("Tom");
		set2.add("Jack");
		set2.add("Hank");
		System.out.println(set2);
		
		Map<String, String> stocks = new HashMap<>();//K=Key不能重複，V=Value可重複
		stocks.put("2330", "台積電");    //Hash不排序
		stocks.put("2454", "聯發科");
		stocks.put("2317", "鴻海");
		System.out.println(stocks);
		
		Map<String, String> stocks2 = new TreeMap<>();//K=Key不能重複，V=Value可重複
		stocks2.put("2330", "台積電");     //Tree會排序
		stocks2.put("2454", "聯發科");
		stocks2.put("2317", "鴻海");
		System.out.println(stocks2);
	}

}
