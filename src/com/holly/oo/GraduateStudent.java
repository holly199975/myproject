package com.holly.oo;

public class GraduateStudent extends Student {
//如果沒有特別 extends一律繼承java.lang.Object
//extends表示繼承   extends後面只能繼承一個類別
// why GraduateStudent出錯?
	//因為繼承的 Student類別裡沒有空的建構子
int thesis;


 public GraduateStudent(){
	 super();//super()是個建構子只能放在第一行
	 System.out.println("haha");
	 
	 
 }
 @Override //防止複寫出錯    @是標記
 public void print(){ 
	 super.print();//super.是用來取得方法跟屬性
		System.out.println(english+"\t"+
				math+"\t"+chinese+"\t"+thesis);
	}
 @Override
 public int getAverage(){ //只能擴大範圍不能縮小
		return (english+math+chinese)/3;
	}
}