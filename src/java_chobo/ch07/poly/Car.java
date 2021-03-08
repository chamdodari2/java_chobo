package java_chobo.ch07.poly;  // refactor -> extract super

public class Car {

	private String color;
	private int door;

	
	
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getDoor() {
		return door;
	}



	public void setDoor(int door) {
		this.door = door;
	}



	public Car() {
		
	}



	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}

	

	public void drive() {
		System.out.println("dirve~! ");
	
	}

	public void stop() {
		System.out.println("stop~~!");
	}



	@Override
	public String toString() {
		return String.format("Car [color=%s, door=%s]", color, door);
	}
	
	

}