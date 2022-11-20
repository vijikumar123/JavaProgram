package com;

public class DemoStatic {
	final int age=10;
	
	static enum weekdays{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
	}
	
	static void display () {
		System.out.println("My week is starting on "+weekdays.MONDAY);
	}
	
	public static void main(String[] args) {
		display();
	}
	
}
