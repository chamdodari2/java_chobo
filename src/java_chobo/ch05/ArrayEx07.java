package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx07 {

	public static void main(String[] args) {
		
		// 배열의 문제점 . (배열 대신 클래스를 쓰게되는 이유)
		//--> 장점은 접근이 쉽다. 배열의 인덱스(번지)로 바로 접근할수있다.read 속도가 빠르다. 단점은 길이를  추가,삭제가 번거롭다.
		//배열을 쓰려면 read가 많고 수정이 적을경우에 쓰는게 낫다.
		//list --->  ("문자열"을 가리키는 주소 들어가있음.) 장점은 추가/삭제가 용이하다. 단점은, 접근하려면 처음부터 순회해야한다. 속도가 오래걸린다.
		// 한번에 접근하느냐, n번에 접근하느냐의 차이이다.
		//장점 추가 삭제방법: list는 중간에 노드 추가시켜서 앞의 노드가 가리키는 장소를 변경, 배열은 중간에 넣고싶으면 모든 자료를 뒤로 쭉 밀어야한다.
		
		String[] strArr = {"a","b"};
		String[] str = null;
		
		System.out.println(Arrays.toString(str));  //null이 출력
		str = strArr;
		System.out.println(Arrays.toString(str)); //"a","b"가출력된다.
		
		prnStr(strArr);
	}

	private static void prnStr(String[] strArr) {
		String str = "abcdef";
		String str1 = str.substring(3);
		String str2 = str.substring(3,4);
		System.out.println(str1);
		System.out.println(str2); 
		
		
		char[] chArr = str.toCharArray();
		for(char ch: chArr) {
			System.out.println(ch);  //한글자씩 다 출력
		}
	}

}
