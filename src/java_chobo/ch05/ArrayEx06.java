package java_chobo.ch05; //1.26

import java.util.Arrays;

// @author mskim
// string 배열
public class ArrayEx06 {

	public static void main(String[] args) {
		//exam01();		
		//exam02();
		
		
		String[] strArr = {"전수린", "우정아", "김예진", "이민정"};
		String[] strArr2 = {"김상건", "이나연", "신범건", "정민강"};
		
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(strArr2));
		
		
		
		//strArr = strArr2; // 어떻게될까?? 확인해보장 : 우측의 내용들이 좌측의 배열에 통째로 들어간당.
							// --> 가리키는 주소값(참조값)이 2와 같이 변경되기 때문에 기존 1의 내용은 gc대상이 되어 메모리로 환수된다.
		//System.out.println(Arrays.toString(strArr));
		//System.out.println(Arrays.toString(strArr2));
		
		
		pprnString(strArr);
		
		
		
	}

	private static void pprnString(String[] strArr) { //순회 쉽게하기 (read만 가능. 수정불가능) 확장표현(?)임
		for(String str : strArr) {   //strArr의 첫번째요소가 str을 가리킨다
			System.out.println(str);  //결과 : 문자열 리터럴이 출력된다.
			
			int[] intArr = {5,4,3,2,1};  //간단하게 출력만 모두 하고자 한다. 대신 수정은 못한다. 접근을 못하기때문에
			for (int a : intArr) {
				System.out.println(a);   // a로 intArr이 가리키는 리터럴을 모두 읽어달라
				
			
			}
	
			
		}
		
	}

	
	
	
	
	
	
	public static void exam02() {
		String[] name = {"김경연", "김상건", "김인환"}; //이렇게 값 넣기도 가능
		String[] name2 = new String[] {"김경연","김상건", "김인환"}; //이렇게도 가능
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(name2));
	}

	public static void exam01() {
		String[] name = new String[3]; //널로 초기화된다. 기본형(은 0으로 초기화)과 다르게
		
		System.out.println(Arrays.toString(name));
		
		name[0] = new String ("김경연");  // String[] name은 스트링타입을 여러개 가지고있는곳을 가리킨다.
		name[1] = "김상건";
		name[2] = "김인환";
		
		System.out.println(Arrays.toString(name));
	}
	
	
	
	

}
