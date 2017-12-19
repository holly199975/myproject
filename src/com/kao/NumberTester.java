package com.kao;

public class NumberTester {
	/*印出1到100之間所有三的倍數，如下：3 6 9 12 15 18 21…99

	承上題，每印出五個數字，請跳行再印，如下：(10分)
	3 6 9 12 15
	18 21 24 27 30
	33…*/
	public static void main(String[] args) {
		for(int n=1; n<=100;n++){
			if(n%3==0){
			System.out.print(n + "\t");
				
			}if(n%15 ==0 ){
				System.out.println();
			}
			
		}
	}

}
