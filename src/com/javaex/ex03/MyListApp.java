package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		//도형 생성
		Point p01 = new Point(4,7);
		Point p02 = new Point(90,20);
		Circle c01 = new Circle(5);
		//포인트(점) 관리
		MyList<Point> pList = new MyList<Point>(); // 포인트만 관리되게 만들려면?
		pList.add(p01);
		pList.add(p02);
		System.out.println(pList.toString());
		//포인트(점) 관리 포인트만 들어가게 하는법
		
		
		//원 도형 관리
		
		MyList<Circle> cList = new MyList<Circle>();
		
		cList.add(c01);
		//cList.add(p01);//MyList<Circle> 쓰면 중복 값 쓸 수 없음.
		System.out.println(cList.toString());
		Circle c02 = new Circle(19);
		
		
		cList.get(0); //다운 캐스팅
		
		
		/*
		MyList cList = new MyList();
		
		cList.add(c01);
		cList.add(p01);//중복 값을 넣을 수도 있음 주의!!! 안 좋은 점
		System.out.println(cList.toString());
		Circle c02 = new Circle(19);
		*/
		

	}

}
