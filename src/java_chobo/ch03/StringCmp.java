package java_chobo.ch03; //1.20

public class StringCmp {
	// 교재 86페이지. 문자열 비교
			//문자열 비교는 반드시 equals()라는 메서드를 사용해야한다.  대소문자 구분하지않기 가능
		/**
String str01 = new String ("abc"); "abc"를 흰 영역에 저장하고, 그 주소값을 01에 저장? (참조형)
String str02 = new String ("abc");
if (str01 == str02)  -->01과 02가 같은가
	sysout("같은");  -->같으면 같음   
	else
	sysout("다른")   --> 아니면 다름
	
	
		int a =10;과는 다르게 
		String은 문자열이 안들어간다. 
		abc가 흰 영역에 저장되고 그걸 가리키는 주소가 str01에 저장된다. 즉 참조주소값이 저장되는것.
		str01과 str02의 주소값을 비교하는 것이기 때문에  같지 않다.
	    --> 참조형이라고 한다.
	
		주소값이 아닌 글자끼리 비교하고싶다면 ==이 아니라(?)
		if(str01.equals(str02);로 해야한다.
		**/
				
	public static void main(String[] args) {
		
		
		String str01 = new String("abc"); // 
		String str02 = new String("abc"); //
		
		if (str01 == str02) { //한문장만 쓰더라도 중괄호를 사용해야한다
			System.out.println("같음");
		}else {
			System.out.println("다름");
			
		if (str01 == str02)
			System.out.println("같음");  //이거 왜 두번들어가있지??
			else
			System.out.println("다름");
		
	
	
	}
		
		if (str01.equals(str02)) { //내용비교
			System.out.println("같음"); //기본타입: 값이 들어가있는것
									  //참조형: 들어가있는 주소값을 비교함
		}else {
			System.out.println("다름");
		
		}
		
		
		String str03 = "abc"; //String클래스만 예외로 이렇게 가능(주소값 같음이 뜸(?) 
		String str04 = "abc"; //이유: 리터럴일 경우에 동일한 내용이 존재할 경우 참조해버려서 같은 주소값이 생성된다
			//그치만 이건 값끼리 비교한 결과가 나오는거라서 내용비교할때는 사용ㄴㄴ 내용비교 하고싶으면 27번블럭인 위에방법 써야함
		//String "abc" = "abc";			
		if (str03 == str04) {
				System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		
		
		if(str03 == "abc") {  // 01에는 참조주소값이 저장된것.("abc" 문자열과 다름 뜸) 03에는 참조형이어서 주소값이 있지만 쌩 값 "abc"도 저장된것. "abc"와 비교할때는 값끼리 비교하게된다. 같음이 뜸. 그리고 "abc"도 앞에 string이 안붙어있지만 string과 똑같다. new로 생성한거만 주소값끼리 비교하는것
				System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		System.out.println(System.identityHashCode(str03));
	}
	
}


