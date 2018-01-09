package com.holly.train;

public class ReturnTicket extends Ticket {
	float discount = 0.15f;
	String rt;
	int rp;
	
	public ReturnTicket (String date,String time,String start,String end,String rt,int rp){
		
		super(date,time,start,end,rp);
		this.rt = rt;
		this.rp = rp;
	}
	
	@Override
	public void print(){
		int rp = (int)(price*2*(1-discount));
		System.out.print( date+"\t" + time+"\t" + start+"\t" + end+"\t"+rt+"\t" + rp);
	}

}
