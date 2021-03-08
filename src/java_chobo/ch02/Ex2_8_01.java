package java_chobo.ch02;

class Cal{
	int k;
	int l;
	
}

public class Ex2_8_01 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.println("x = "+ x + ", y = " + y);
		
		swap(x,y); //함수로 x와 y값을 교환
		System.out.println("x = "+ x + ", y = " + y);
		
		Cal cal = new Cal();
		cal.k = 10;
		cal.l = 5;
		System.out.println(cal.k + ", "+ cal.l);
		
		swap02(cal);
		System.out.println(cal.k + ", "+ cal.l);
	}
	private static void swap02(Cal cal) {
		System.out.println("swap02() Cal x, y="+ cal.k + "," + cal.l);
	int temp = cal.k;
	cal.k = cal.l;
	cal.l = temp;
	System.out.println("swap02() Cal x, y="+ cal.k + "," + cal.l);
			
	}
	
	private static void swap(int x, int y) {
		System.out.println("swap() x = "+ x + ",y = " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("swap() x = "+ x + ",y = " + y);
		
		
	}

}
