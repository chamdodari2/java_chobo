package java_chobo.ch02;

public class Ex2_5 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		extracted(x, y);
		extracted(3, 3);

	}

	private static void extracted(int x, int y) {
		System.out.printf("%d + %d = %d%n", x, y, x + y);
		System.out.printf("%d + %d = %d%n", x, y, x - y);
		System.out.printf("%d + %d = %d%n", x, y, x * y);
		System.out.printf("%d + %d = %d%n", x, y, x / y);
		
	
		System.out.println(100_000);
		String ste = "";//빈문자열 <> null
		char ch = ' ' ; //빈 문자는 허용하지 않음.
		
		System.out.println(7 + "");
		System.out.println(" " + 7);
		System.out.println("7" + 7);
		System.out.println(7 + 10 + "5");
		
	}

}
