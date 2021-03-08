package java_chobo.ch06;   //실행순서. 교재 206
  
class InitTest{
	static int CV = 1;  //  1번. 스태틱이 먼저. (+명시적)
	int iv = 1;				//3번
	
	static {
		System.out.println("CV " + CV); 
		CV = 2;								//2번.
		System.out.println("CV " + CV); 
	}
	{

		System.out.println("iv " + iv);
		iv = 3;							//4번
		System.out.println("iv " + iv);
	}


	public InitTest() {  //5번	 제일 마지막에 생성자 호출된다
		CV = 5;
		iv = 4;
		System.out.println("iv" + iv);
		System.out.println("iv" +  iv  +  "CV " +  CV);
	}
		
	}

public class Ex6_8_2 {

	public Ex6_8_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new InitTest();

	}

}
