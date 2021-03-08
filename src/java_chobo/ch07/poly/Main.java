package java_chobo.ch07.poly; //다형성  :   동일한 명령어인데 다른 결과를 출력할 수 있다







abstract class Animal { 
	abstract void cry(); 
}
 /////////////////////////////////////////////////
 class Lion extends Animal{

	@Override
	void cry() {
		System.out.println("어흥");
		
		
	}

	public void eat() {
		System.out.println("잡아먹다");
		
	}

	
}


/////////////////////////////////////////////////
class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("월월");
	}

}
/////////////////////////////////////////////////

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}

}

/////////////////////////////////////////////////
class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("꼬꼬댁");
	}

}

////////////////////////////////////////////////////
public class Main {
	public static void main(String[] args) {

		Animal[] anis = new Animal[4];
		anis[0] = new Dog();
		anis[1] = new Cat();
		anis[2] = new Bird();
		anis[3] = new Lion();
		
		
		for(Animal ani : anis ) {
			ani.cry();
			if(ani instanceof Lion) {    //라이언일 경우에만 수행하는거   (instanceof 연산자는 나중에  다시 수업)
				((Lion)ani).eat();
			}
		}

	}

}
