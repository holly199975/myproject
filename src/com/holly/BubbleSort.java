package com.holly;

public class BubbleSort {
	//排序 51,23,6,65,15
	public static void main(String[] args) {
	int n[] = {	51,23,6,65,15};
	for(int i=0; i<=n.length; i++){
		for(int j=(i+1); j<=n.length; j++){ 
			if(n[i] > n[j]){
				int tmp = n[i]; //tmp代表暫存
				n[i] = n[j];
				n[j] = tmp;
				System.out.print(n[i]+" ");
				System.out.print(n[j]+" ");
				continue;
			}else {
				System.out.print(n[i]);
			}
		}
		}
	}
	}

