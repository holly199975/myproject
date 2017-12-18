package com.holly;

import java.util.Scanner;

public class BubbleSort {
	//排序 51,23,6,65,15
	public static void main(String[] args) {
		/*System.out.print("請輸入5個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		n= Integer.parseInt(line);*/
	int n[] = {51,23,6,65,15};
	for(int i=0; i<n.length - 1; i++){
		for(int j=(i+1); j<n.length; j++){ 
			if(n[i] > n[j]){
				int tmp = n[i]; //tmp代表暫存
				n[i] = n[j];
				n[j] = tmp;
			}
		}
		}
		for(int num: n){ //num是標號的意思
			System.out.print(num + " ");
		}
	}
	}


