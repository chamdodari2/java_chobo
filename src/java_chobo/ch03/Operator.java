package java_chobo.ch03;

public class Operator {

	public static void main(String[] args) {
		// 연산자 (단항연산자, 이항연산자, 삼항연산자)
		boolean isMale = false;
		System.out.println(!isMale);
		
		int sum = 10 + 4;
		System.out.println(" sum = "+ sum);
		
		int a = 5;
		int b = 3;
		int c = a > b ? 1 : 0;
		
		boolean isGreat = a > b ? true : false;	
		
		int max = a > b ? a : b; //a가 크면 a값이 max에 들어가고 b가 크면 b값이 들어감

	}

}
