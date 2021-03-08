package java_chobo.ch02;

public class Ex2_9 {

	public static void main(String[] args) {
		varPrint();

	}

	public static void varPrint() {
		int x = 10; //0010
		double y = 10.567; //실수형
		char ch = 'a'; //문자형
		String str = "Hello"; //문자열
		
		System.out.printf("x = %d, y = %f, ch = %c, str = %s %n", x, y, ch, str);
		System.out.printf("x = %d, y = %4.1f, ch = %d, str = %s %n", x, y, (int)ch, str);
		System.out.printf("x = %04d, y = %.2f, ch = %d, str = %-10s %n", x, y, (int)ch, str);
	}

}
