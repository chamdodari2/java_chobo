package java_chobo.ch06;

import java_chobo.ch06.dto.MyMath3;

public class Ex6_10 {

	public static void main(String[] args) {  //스태틱으로 선언되어있으면  생성하지 않고 바로 호출가능.
		//System.out.println(Math.PI);
		//System.out.println(Math.max(5, 10));		
		//System.out.println();
		
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) 결과 : "+ mm.add(3,3));
		System.out.println("mm.add(3L,3) 결과 : "+ mm.add(3L,3));
		System.out.println("mm.add(3,3L) 결과 : "+ mm.add(3,3L));
		System.out.println("mm.add(3L,3L) 결과 : "+ mm.add(3L,3L));
		int[] a = {100,200,300};
		System.out.println("mm.add(a) 결과 :"+ mm.add(a));
	
		
		
		
		
	}

}
