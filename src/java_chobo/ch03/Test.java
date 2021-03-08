package java_chobo.ch03;

public class Test {

	public static void main(String[] args) {

		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		
		
		
		String str03 = "abc";
		String abc = "abc";
		if(str03 == "abc") {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		System.out.println(System.identityHashCode(a)); //주소값 출력하기
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		
		
	}

}
