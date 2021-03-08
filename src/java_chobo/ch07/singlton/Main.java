package java_chobo.ch07.singlton;

public class Main {
	
	public static void main(String[] args) {
		//Singleton st = new Singleton();
		
		UnSingleton us1 = new UnSingleton();
		UnSingleton us2 = new UnSingleton();
		
		System.out.println(us1); //주소다름. 여러개 생성할수있다.
		System.out.println(us2);
		
		
		///////////////싱글턴패턴 : DB연동할때 사용한다
		Singleton si1 = Singleton.getInteance();
		Singleton si2 = Singleton.getInteance();
		System.out.println(si1);  //주소동일. 하나만 생성된다.(싱글턴패턴) 한개 생성한거 가지고 계속 쓰는것
		System.out.println(si2);
	}

}
