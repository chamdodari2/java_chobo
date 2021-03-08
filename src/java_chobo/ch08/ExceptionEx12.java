package java_chobo.ch08;

public class ExceptionEx12 {  //체크익셉션

	public static void main(String[] args) throws Exception { // 4.그럼 여기서 처리해줘야한다.  5/여기서도 안묶어주면 JVM이 처리해서 토해낸다
		//try {
			method1();
		/*} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}*/

	}

	private static void method1() throws Exception { // 3.여기서 묶어주거나, 다른곳으로 한번더 전가하기 가능
//		try {
		method(2);
//		} catch (Exception e) {
//			System.out.println(e.getMessage()); //이렇게 해주면 "예외발생" 문구가 뜬다.
//		}

	}

	private static void method(int i) throws Exception { // 2. throws Exception가 추가되면 위 1로 전가한다
		throw new Exception("예외 발생"); // 1.여기서 try catch로 묶어주거나, 전가하기

	}

}
