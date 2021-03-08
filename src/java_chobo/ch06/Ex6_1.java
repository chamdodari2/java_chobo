package java_chobo.ch06; //165쪽

import java_chobo.ch06.dto.Tv;

public class Ex6_1 {

	public static void main(String[] args) {
		Tv t1;   //Tv 타입으로  변수 t1 선언  타입만 선언해놔서  t1이 가리키는 곳으로 가면  그 안에는 tv타입이다. 널값이되어있음.
		t1 = new Tv(); //중요!! Tv인스턴스화. 생성된 객체의 주소를 참조변수에 저장. (    Tv()는 생성자라고 부름. 생성자는 클래스명과 이름이 동일하며, 반환타입이 없다. Tv클래스 내에 생성자가 존재하지 않으면, java컴파일러가 생성해서 넣어줌.(이를 디폴트생성자라고 함)
		
		System.out.printf("%s %b %d%n",t1.color,t1.isPower, t1.channel);
		System.out.println(t1); // t1이 참조값이면 t1.tostring()이 자동으로 호출된다. 부모클래스를 찾아감.
		t1.color = "red";
		t1.isPower = true;
		t1.channel = 11;
		
		t1.setPower();
		t1.chanelUp();
		t1.chanelUp();
		t1.chanelDown();
		System.out.printf("%s %b %d%n",t1.color,t1.isPower, t1.channel);
		System.out.println(t1);  //t1.tostring()호출.
		
		Object o1 = new Tv();
		System.out.println(o1);  
	}

}
