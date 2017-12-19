package com.ibm;
//印出”省略九九乘法表”的程式，類別為 com.ibm.NineLazy類別執行後印出以下結果： (10分)請注意，”…”一定要印出來
public class NineLazy {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++){
			
			for(int n = 2; n <= 9; n++){
				if(i>3 && i<9){
					System.out.print( "   "+ ". . ." + "\t ");
				}else
				System.out.print(n +" * "+ i + " = " + (n*i) + " \t  ");
				//  \t代表Tab鍵  意思是重新定位點
				}
				System.out.println();
			}	
	}

}
