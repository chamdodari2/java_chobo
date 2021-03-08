package java_chobo.ch07.poly;

public class PolyMain2 {

	public static void main(String[] args) {
		// 
		
		Car car1 = new Car();
		prnInstenceOf(car1); 
		prnInstenceOf(new Ambulance("red",4)); 
		prnInstenceOf(new FireEngine()); 
		
		
		
		

	}

	private static void prnInstenceOf(Object obj) {
		if (obj instanceof Object) {
			System.out.println("Object");
		}
		if (obj instanceof Car) {
			System.out.println("Car Instance");
		}
		
		if (obj instanceof Ambulance) {
			System.out.println("Ambuance Instance");
		}
		
		if (obj instanceof FireEngine) {
			System.out.println("FireEngin Instance");
		}
	}

}
