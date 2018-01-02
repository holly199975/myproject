package com.holly.oo;

public class Student {
	int english; //類別裡的第一層叫屬性
	//public 表示都能用
	//private 表示只能在此類別用
	//沒有寫      表示只能在此package用
	//protected 表示只能給子類別和同package用
	protected int math;    //可稱為property或field
	int chinese;
	String name;//english,math,chinese,name是instance variable
	static int pass = 60;//加了 static就變成class變數
	
	
	public Student(){ 
		//有了空的建構子後GraduateStudent類別就不會出錯
		
	}
	
	
	public Student(String name ,int english,int math, int chinese){
		this.name =name;//括號裡的都是local variable
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
	
	 int getAverage(){
		return (english+math+chinese)/3;
	}
}
