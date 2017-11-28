package com.holly;

public class DateOfYear {

	public static void main(String[] args) {
		int n = 155;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int a = 0;a<months.length;a++ ){
			if( n < months[a]){
				System.out.println( (a+1)+"/"+ n);
				break;
			}else{
				n = n - months[a];
			}
		}
	}

}
