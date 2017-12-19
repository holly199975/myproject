package com.ibm;
/*每一次擲出四顆骰子，類別執行後共擲10次，並印出結果，例如： (10分)
1 2 1 2
3 1 1 1
4 1 2 3
4 3 1 1
4 4 2 1
3 4 1 3
3 4 3 3
2 3 4 1
3 1 3 4
2 4 4 2

請在每次擲時，若四個點數都不一樣，印出星號，如下： (20分)
1 2 1 2
3 1 1 1
4 1 2 3 *
4 3 1 1
4 4 2 1
3 4 1 3
3 4 3 3
2 3 4 1 *
3 1 3 4
2 4 4 2       */
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		for(int n=1;n<=10;n++){
			Random r = new Random();
			int n1 = r.nextInt(6)+1;
		     int n2 = r.nextInt(6)+1;
		     int n3 = r.nextInt(6)+1;
		     int n4 = r.nextInt(6)+1;
		    //System.out.println(n1 + "\t" + n2 + "\t" + n3 + "\t" + n4 +"\t");
     	if(n1 != n2 && n1 != n3 && n1!=n4 &&n2 != n3 && n2 != n4 && n3 != n4){
		     		System.out.println(n1 + "\t" + n2 + "\t" + n3 + "\t" + n4 +"\t"+"*");
		     	}else{
		     		System.out.println(n1 + "\t" + n2 + "\t" + n3 + "\t" + n4 +"\t");
		     	}
		}
	}

}
