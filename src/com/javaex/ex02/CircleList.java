package com.javaex.ex02;

import java.util.Arrays;

public class CircleList {

	//필드
	private Circle[] cArray;
	private int crtPos;
	
	
	//생성자
	
	public CircleList() {
		this.cArray = new Circle[3];
		this.crtPos = 0;
	}
	
	//메소드 gs
	
	//메소드
	
	public void add(Circle p) {
		cArray[crtPos] = p;
		crtPos++;
		
	}
	
	public Circle get(int index) {
		Circle result = cArray[index];
		return result;
	}
	
	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
