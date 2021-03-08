package java_chobo.ch08;

public class ExceptionEx11 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int[] arr2 = null;

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(arr2[0]); //
			System.out.println(arr[arr.length]); // 이렇게 하면 안된당. 초보들이 많이하는 실수쓰
			System.out.println(0 / 0); // 1.얘만 묶어도 되는데

			System.out.println(4); // 2?위에 에러가 발생해서 catch로 넘어가버려서 애는 수행이 안된당
		} catch (ArithmeticException e) { // 혹시 ArithmeticException라는 예외가 발생하면 내가 잡아서 처리해줄껭
			e.printStackTrace(); // 3?이거를 해주면 몇번째줄에 에러가 뜨는지 띄워준당?? 이거안해주면 어디서 에러가 뜨는지 모른당 근데 다른애가 예외처리하고있어서 출력순서는
									// 순차적이지 않을수 있다. 얘는뒤에 출력된다
			System.out.println(e.getMessage());
			System.err.println("ArithmeticException 처리");
			System.out.println(4);// 다른거 써도되는데 호가인하려고 sout 쓴거임
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스범위를 초과");
			System.out.println(4);
			}
		
		catch (Exception e) {
			e.printStackTrace();  //몇번쨰줄에 에러가 뜨는지 알려주는거
			System.out.println(4);
			// if (e instanceof ArrayIndexOutOfBoundsException) { //위에 자식들이 못잡아준거는 조상이 if문을
			// 사용해서 해당되는 에러 처리해주어야한다.
			// System.out.println("배열의 인덱스범위를 초과");
			// }
			// System.out.println(e.getMessage());
			 }finally {
				 //resource 자원 써야하는데 에러가 발생했다: 에러 잡고 종료해준다??
				 // resourde는 물이라고 보면 된다. 잠궈줘야하는데 안잠그고 가서 finally가 잠그는것
				 System.out.println("finally");  //finally는 반드시 수행하도록 한것.
			 }
		System.out.println(7);
		}
		
	}
	

