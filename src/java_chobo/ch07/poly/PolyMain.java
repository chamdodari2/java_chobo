package java_chobo.ch07.poly;


public class PolyMain {

	public static void main(String[] args) {

		
		// up casting (자손 -> 조상)
		Car c = new Ambulance("red", 2);
		Car c2 = new FireEngine();
		c2.setColor("White");
		c2.setDoor(4);

		System.out.println(c);
		System.out.println(c2);

		// down casting. ( 조상 -> 자손)

		FireEngine c4 = (FireEngine) c2;

		// 문법적으로는 맞지만 실행때 에러가 뜬다. 이 에러를 미연에 방지할려면? if (obj instanceof Ambulance){} 해주기
		//Ambulance c3 = (Ambulance) new Car();

		//c3.setColor("blue");
		//System.out.println(c3);

		
		Parent p = new Child();
		Child c1 = new Child();
		
		System.out.println("p.x = "+ p.x);
		p.method();
		
		System.out.println("c1.x = "+ c1.x);
		c1.method();
	

	}
	

}
