package com.holly.oo;

public class GraduateStudent extends Student {
//如果沒有特別 extends一律繼承java.lang.Object
//extends表示繼承   extends後面只能繼承一個類別
// why GraduateStudent出錯?
	//因為繼承的 Student類別裡沒有空的建構子
int thesis;

}
