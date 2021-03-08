package java_chobo.ch04; //1도모르겠다

import java.util.Random;

public class Ex4_7 {

public static void main(String[] args) {  //교재 109쪽
	 // 0.0 <== Math.random() < 1.0
	 // 0.0 * 3 == Math.random() < 1.0 * 3
	// 0.0 <= (int)Math.random() < 3.0
	//(0 <= Math.random() < 3
	// 1 < Math.random() < 4    1부터 3사이의 수? 
	// 1~3 사이의 정수를 생성
	
	System.out.println((int)(Math.random()*3 ) +1); // +1 안붙이면 0~3
	Random rnd = new Random();
   System.out.println(rnd.nextInt(3)+1); // 정수만 나옴.이게 더 편하다 15번보다. 둘중에 선택해서 쓰면된다.
	
   	//임의의 정수 : 0~100
   System.out.println(rnd.nextInt(101));
   
//		enum_switch();
	}


	//public static void enum_switch() {}
	  
		
		//enum_switch();

	


	public static void enum_switch() {
		Title t = Title.CEO;
		
		switch(t) {
		case CEO : //열거타입 (타이틀에 있는 타입)
		 System.out.println("사장");
		 System.out.println(t.ordinal()); //순서를 이야기함
		  break;
		case MANAGER://열거타입 (타이틀에 있는 타입)
		 System.out.println("매니저");
		  break;
		case STAFF ://열거타입 (타이틀에 있는 타입)
			 System.out.println("직원");
			 break;
		case INTERN ://열거타입 (타이틀에 있는 타입)
			 System.out.println("인턴");
			 break;
		 }
	}
}
	
