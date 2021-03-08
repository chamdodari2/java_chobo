package java_chobo.ch05;

public class ArrayEx13 {
	//가변인수. 가변인수란??
	public static void main(String[] args) {
		

		int kor = 100;
		int eng = 90;
		int math = 80;   // --->배열에 전달해주고싶으면? 어떻게??
		
		int soc = 80;
		sum(kor,eng,math);  // 메소드생성
		
		가변배열(kor,eng,math,soc);
		가변배열(kor,eng);
		가변배열2("신범건",90,90,90);
		가변배열2("신범건",90);
	}

	private static void 가변배열2(String name,int ...i ) { //3개냐 두개냐 정하지 못했을때는 i?
		System.out.println("name"+name);
		System.out.println(i.length);
	}

	private static void 가변배열(int... jumsu) { // --> 90,90,90,을 정수형 배열로 받는것. int[] jumsu={90,90,90,} 값이 복사되는것.//변수명들 대신  ...jumsu로 수정--> new int[인자의 갯수인 4]로 바뀐다.(가변인수라고 한다) 길이가 몇개로 수정되던 알ㅇ서출력?
		System.out.println(jumsu.length); // --> 4출력된다 . 동일한 자료형만 가능한데 , 다른 자료형도 넣고싶으면? 가변배열2 방법
		
	}

	private static void sum(int kor, int eng, int math) {
		System.out.println(kor+eng+math);  //이렇게 출력하면 나온다.  출력하고싶은 변수가 추가되면 추가로 적을게 많아서 번거롭다.
		
	}

}
