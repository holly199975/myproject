package com.java2.schdule;

public class Course {
	String id;
	String name;
	int weekDay;
	int hour;
	int duration;
	
	public Course(String id,String name,int weekDay,int hour,int duration){
		this.id = id;
		this.name = name;
		this.weekDay = weekDay;
		this.hour = hour;
		this.duration = duration;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}
	public int getWeekDay() {
		return weekDay;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int hour() {
		return hour;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getDuration() {
		return duration;
	}
}
