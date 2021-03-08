package java_chobo.ch04; //113쪽. 알트+쉬프트+R 변수명 여러개 한번에 바꾸기

public class Ex4_11 {

	public static void main(String[] args) {
	//	exam01();
	//exam02();
		
		int row=0;
		while(row<10) {
			int col=0;
			while(col<10) {
				System.out.print("*");
				col++;
			}// end
			System.out.println();
			row++;
		} //end
	}//end

	
	public static void exam02() {
		for(int row =0; row<10; row++) {
			for(int col=0; col<10; col++) {
			System.out.print("*");
			}
		System.out.println();
		}
	}

	public static void exam01() {
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
	}

}
