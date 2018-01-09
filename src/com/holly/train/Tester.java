package com.holly.train;

public class Tester {

	public static void main(String[] args) {
		Ticket t1 = new Ticket("2018-01-08","18:30","松山","八堵",65);
		t1.print();
		ReturnTicket t2 = new ReturnTicket("\t"+"2018-01-08","18:30","松山","八堵","20:30",65);
		t2.print();
	}

}
