package java_chobo.ch07.access.sub;

import java_chobo.ch07.access.AccessParent;

public class Main {
	
	public static void main(String[] args) {  //예외클래스여서 이 클래스에 소속된게 아님. 따로 만든것과 같아서 안나온느것임
		AccessParent ap = new AccessParent();
		
		AccessChild ac = new AccessChild();
		ac.prn();
	
	
	}
}
