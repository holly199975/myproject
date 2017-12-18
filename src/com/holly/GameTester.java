package com.holly;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		int n = -1;//n不管=多少都沒差
		int pos =0;
		int hp = 100;
		int row =3;
		int col =5;
		while(hp > 0){
			System.out.println("請輸入方向:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		 n = Integer.parseInt(line);
		
			switch(n){
			case 2:
				if(pos/col < row - 1){
					pos = pos + col;
					hp = hp -5;
				}else{
					hp =hp -30;
				}
				System.out.println("hp"+":"+hp);
				System.out.println("pos"+":"+pos);
				break;
			case 4:
				if(pos % col != 0){
					pos = pos - 1;
					hp = hp -5;
				}else{
					hp = hp -30;
				}
				System.out.println("hp"+":"+hp);
				System.out.println("pos"+":"+pos);
				break;
			case 6:
				if(pos % col != col -1){
					pos = pos +1;
					hp = hp -5; 
				}else{
					hp =hp -30;
				}
				System.out.println("hp"+":"+hp);
				System.out.println("pos"+":"+pos);
				break;
			case 8:
				if (pos/col > 0){
					pos = pos - col;
					hp = hp -5;
				}else{
					hp =hp -30;
				}
				System.out.println("hp"+":"+hp);
				System.out.println("pos"+":"+pos);
				break;
			
			
		}
		
		
}
			if(hp<=0) {
				System.out.println("Bye!");
			}
	}
}
