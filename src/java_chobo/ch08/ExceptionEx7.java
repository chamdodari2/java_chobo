package java_chobo.ch08;

public class ExceptionEx7 {

	public static void main(String[] args) {
		int a = 10;
		try{
			// System.out.println(a/0);
			throw new RuntimeException();  //얘에 대한 예외처리는 없는상태라서 수행이 안되었다??
			
			//System.out.println(a/0);  //5. 애는 부모가ArithmeticException 이며, 걔는 부모가 런타임인셉션이다. 그래서 묶으라는 강제메세지가 안뜬다
		} catch (ArithmeticException e) {  //4. ArithmeticException에러뜨면 걔만 잡겠다는뜻  (원래는 에러뜨면 비정상종료)
											//6. ArithmeticException e= new RuntimeException(); ?? 자식은 부모를 참조할수 없어서 못잡아준다 그래서 밑에 또하나 잡아주는걸 작성해야한다.
			System.out.println("/ by zero");
		} catch(RuntimeException e) {
			System.out.println("run time Exception 처리");  //7.위의 캣치에서 못잡아준 에러는 catch 추가해서 밑에 애가 잡아줄수있다. 만약 4번과 순서가 바뀌면 부모가 다 잡아주기 때문에 얘는 쓸모없어진다(?) 그래서 에러가 뜬다. 그래서 자식부터 작성해야한다.
		}
		
		try {
		
		throw  new Exception(); // 1.던지겠당 -> 에러뜸. 캣치로 묶장  (new Exception은 반드시 묶어줘야 하는거)
		} catch (Exception e) {  //2.내가 잡아준당 --> 부모니까 잡을수있당 Exception은 최고조상!!
			System.err.println("Exception 발생");  //여기에 예외처리를 해주면된다. 여기서는 보통 out 해도되고, in해도 된다 : system.in : 키보드로부터 입력받기, err은 에러메세지를 출력받겠다
			  //이렇게 해주면 예외가 나왔을때 어떻게 처리할지(띄울지) 입력해둘수있는거(?)
		}
		// throw new RuntimeException(); 3. //try catch로 묶지않아서 런타임 오류(수행시 오류)가 뜨면서 비정상 종료가 된것이다.
	}

}
