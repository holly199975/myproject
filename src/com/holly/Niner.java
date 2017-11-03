package com.holly;

public class Niner {
	/*九九乘法表*/
	public static void main(String[] args) {
		for(int n = 2 ; n <= 9 ; n++) {
			for(int i = 1; i <= 9 ; i++){
				if((n*i) < 10){
					System.out.println(n +" x "+ i + " =  " + (n*i));
				}else{
					System.out.println(n +" x "+ i + " = " + (n*i));
				}
			}System.out.println();
		}
		/*
	 	2 x 1 =  2
	 	2 x 2 =  4
	 	2 x 3 =  6
	 	2 x 4 =  8
	 	2 x 5 = 10
	 	2 x 6 = 12
	 	2 x 7 = 14
	 	2 x 8 = 16
	 	2 x 9 = 18
	 */
		/*for(int i = 1; i <= 9 ; i++){
			if((2*i) < 10){
			System.out.println("2 x "+ i + " =  " + (2*i));
		}else{
			System.out.println("2 x "+ i + " = " + (2*i));
		}
	}
	*/
		/*for(int i=1;i<=4;i++){
			System.out.println("2 x "+ i + " =  " + (2*i));
		}
		for(int i=5;i<=9;i++){
			System.out.println("2 x "+ i + " = " + (2*i));
		}
	}*/

}
}
