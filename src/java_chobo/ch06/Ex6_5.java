package java_chobo.ch06;

class Variable{
	int iv;			//인스턴스 변수. 따로 
	static int CV; // static이 붙었기 때문에 클래스변수. 여기에 저장되는 값은 공통적으로 공유된다.
	
	void method() {
		int lv = 0;  // 메소드 {블럭}안에 선언되어 있는 변수는 - > 지역변수가 된다.
		
	}
	
}

public class Ex6_5 {

	public static void main(String[] args) {
		Variable.CV = 10;  //클래스변수는 삐딱하게나온다.
		System.out.println(Variable.CV);  // ---> 10 출력된당 

		
		Variable v1 = new Variable();  //인스턴스화 (Variable 타입)
		v1.iv =5;
		System.out.println("iv" + v1.iv);
		System.out.println("CV" +Variable.CV);  //ㄴ왠만하면 위의 방법으로 출력할것 .헷갈리니까
		
		
		Variable v2 = new Variable();
		v2.iv = 7;
		System.out.println("iv" + v2.iv);
		System.out.println("CV" +v2.CV);  
		
		Variable.CV = 20;
		System.out.println("CV" + v1.CV);
		System.out.println("CV" +v2.CV);  
		
		
	}

}
