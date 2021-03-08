package java_chobo.ch07.test04.teacher;

public class Test03 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.summary();
		
		b.buy(new Tv());
		b.summary();
		
		b.buy(new Computer());
		b.summary();
		
		b.buy(new Tv());
		b.summary();
		
		b.buy(new Audio());
		b.summary();
		
		b.buy(new Computer());
		b.summary();
		
		b.buy(new Computer());
		b.summary();
		
		b.buy(new Computer());
		b.summary();
	}

}
