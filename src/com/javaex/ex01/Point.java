package com.javaex.ex01;

public class Point {
	private int x;
	private int y;
	
	
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public Point() {
		
	}


	
	//메소드g/s

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}


	
	
	//메소드
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
