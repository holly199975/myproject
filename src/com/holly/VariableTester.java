package com.holly;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
    int  age = 0;
    //age,weight,c,c2,i,pass,s,r,n1,n2,n3,n4�O�ܼ�
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
    // s r �Oreference data type(�ѷӸ�ƫ��A)
     int n1 = r.nextInt(6)+1;
     int n2 = r.nextInt(6)+1;
     int n3 = r.nextInt(6)+1;
     int n4 = r.nextInt(6)+1;
    
    System.out.println(r.nextInt(6)+1);
    
    String s= new String("Hello");
    String s2 = "HAHAHAHA";//�u��String(�r��)��o�ˬٲ� new
    int len =s.length();
    System.out.println("len:"+ len);
    System.out.println(s.charAt(0));// --�r�ꤤ�Ĥ@�Ӧr
    //char �O�r�����N��
    
    
	}

}
