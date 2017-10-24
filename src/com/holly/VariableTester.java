package com.holly;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
    int  age = 0;
    //age,weight,c,c2,i,pass,s,r,n1,n2,n3,n4是變數
    float weight = 69.5f; 
    char c = 65;
    char c2 = 'Z';
   //
    int i = c2;
    System.out.println(i);
    //System.out.println((int)c2);
    boolean pass = false; 
    System.out.println(!pass);
    System.out.println(pass);
    
    Random r = new Random();
    // s r 是reference data type(參照資料型態)
     int n1 = r.nextInt(6)+1;
     int n2 = r.nextInt(6)+1;
     int n3 = r.nextInt(6)+1;
     int n4 = r.nextInt(6)+1;
    
    System.out.println(r.nextInt(6)+1);
    
    String s= new String("Hello");
    String s2 = "HAHAHAHA";//只有String(字串)能這樣省略 new
    int len =s.length();
    System.out.println("len:"+ len);
    System.out.println(s.charAt(0));// --字串中第一個字
    //char 是字元的意思
    
    int x = 5;
    int y = 3;
    int z = x%y;
    System.out.println(z);
    
    System.out.println(x>>1);//因為5二進位表示法是0101 往右推1就是010 =2
    x++;
    x--;
    System.out.println(x);
    x = x + 2;
    x += 2;// = (x = x + 2;
    System.out.println(x);
    
	}

}
