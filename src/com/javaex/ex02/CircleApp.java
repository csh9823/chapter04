package com.javaex.ex02;

public class CircleApp {

	public static void main(String[] args) {
		
		Circle c01 = new Circle(1);
		Circle c02 = new Circle(2);
		Circle c03 = new Circle(3);
		
		CircleList cList = new CircleList();
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		System.out.println(cList.get(1).toString());
		
		System.out.println(cList.size());
	}

}
