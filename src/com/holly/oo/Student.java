package com.holly.oo;

public class Student {
	int english; //類別裡的第一層叫屬性
	int math;    //可稱為property或field
	int chinese;
	String name;
	
	public Student(String name ,int english,int math, int chinese){
		this.name =name;
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	public Student(String n){
		this.name = n; //this 是用來強調本類別裡的東西為了讓區域變數跟屬性做區別
	}
	
	public void print(){ //方法   void只會執行不會回傳
		System.out.println(english+"\t"+
				math+"\t"+chinese+"\t");
	}
	
	public int getAverage(){
		return (english+math+chinese)/3;
	}
}
