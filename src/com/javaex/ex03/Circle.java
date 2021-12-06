package com.javaex.ex03;

public class Circle {
	// 핃드
	private int radius;

	//생성자
	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	
	// gs메소드
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
	//메소드
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
	
}
