package com.javaex.ex03;

import java.util.Arrays;

//T ----> 
public class MyList<T> {
	
	//필드
	
	private T[] oArray;
	private int crtPos;
	//생성자
	
	
	public MyList() {
		this.oArray = (T[])new Object[3]; // 배열문법상  T안됨 강제 현변환 사용
		this.crtPos = 0;
	}
	



	//메소드 gs
	
	//메소드 일반
	
	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public T get(int index) {
		T result = oArray[index];
		return result;
	}
	
	public int size() {
		return crtPos;
	}
		
	
	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}

	
	
}
