package com.holly;

public class DateOfYear {

	public static void main(String[] args) {
		int n = 100;
		int y[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int a = 0;a<y.length;a++ ){
			if( n < y[a]){
				System.out.println( (a+1)+"/"+ n);
				break;
			}else{
				n = n - y[a];
			}
		}
	}

}
