package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1, 11); // 권상우
		Point p02 = new Point(2, 22); //정우성
		Point p03 = new Point(3, 33); //이효리
		
		pMap.put("권상우", p01);
		pMap.put("정우성", p02);
		pMap.put("이효리", p03);
		 //키값이 같을 경우 마지막 키 값이 실행 ex p01 권상우 p03 권상우일 경우 p03실행 기본적으로 set을 사용 중복값 적용 안해줌
		System.out.println(pMap.toString());
		
		/*
		System.out.println(pMap.get("정우성"));
		System.out.println(pMap.size());
		*/
		
		//키셋 구하기
		Set<String> keySet = pMap.keySet();
		
		for(String key : keySet) {
		System.out.println(pMap.get(key).getX());	
		}
		
		/////////////////////////////////
		Map<String, String> boarMap = new HashMap<String, String>();
		
		boarMap.put("title", "게시판 제목입니다.");
		boarMap.put("regDate", "2021-12-08");
		boarMap.put("content", "게시판 내용입니다.");
		
		System.out.println(boarMap.get("title"));
	}

}
