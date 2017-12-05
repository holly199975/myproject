package com.holly.oo;

public class Student {
	int english; //類別裡的第一層叫屬性
	int math;    //可稱為property或field
	int chinese;
	String name;
	
	public Student(String n ,int e,int m, int c){
		name =n;
		english = e;
		math = m;
		chinese = c;
	}
	public void print(){ //方法   void只會執行不會回傳
		System.out.println(english+"\t"+
				math+"\t"+chinese+"\t");
	}
	public int getAverage(){
		return (english+math+chinese)/3;
	}
}
