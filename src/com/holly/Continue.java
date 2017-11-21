package com.holly;

public class Continue {
	/*Please enter a number 13
	 * 1 2 3 4 5 6 7 8 9 10 11 12 13
	 * 3的倍數不要印
	 */
	public static void main(String[] args) {
		for(int i=1;i<=13;i++){
			if(i%3 == 0){
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
			int n = 1;
			while(n <= 13){
				if(n%3 == 0){
					n++;
					continue;
					}
			System.out.print(n + " ");
			n++;
			
	
		}
	}

}
