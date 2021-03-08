package java_chobo.ch06.test;

public class Exercise6_23 {

	public static void main(String[] args) {
		//exam02();
		
		
		Student s = new Student();  //초기화.  기본생성자 정의되어있지 않으면 에러뜬다. (알쉬s 수퍼클래스를 이용한 생성)
		s.name = "이종윤";
		s.ban = 2;
		s.no = 1;
		s.kor = 60;
		s.eng = 70;
		s.math = 81;
		System.out.printf("이름 :%s%n",s.name);
		System.out.printf("총점 :%s%n",s.getTotal());
		System.out.printf("평균 :%.1f%n",s.getAverage());
	

	}

	public static void exam02() {  //이게 더 편하다.
		Student s = new Student("홍길동",1,1,100,60,76);
		
		String str = s.info();
		System.out.println(str);
	}

}
