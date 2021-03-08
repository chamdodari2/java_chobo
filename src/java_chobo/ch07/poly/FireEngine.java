package java_chobo.ch07.poly;

public class FireEngine extends Car {

	public void water() {
		System.out.println("water~~!");
	}

	@Override
	public String toString() {
		return String.format("FireEngine [getColor()=%s, getDoor()=%s]", getColor(), getDoor());
	}
	
	
}
