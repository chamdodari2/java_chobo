package java_chobo.ch07.access.sub;

import java_chobo.ch07.access.AccessParent;

public class AccessChild extends AccessParent {
	//AccessParent ap;  //이게 없으면 퍼블릭도 못쓴다
	
	
	
	public void prn() {
	this.c = 4;
		
	
	}
	
	
	
	public static void main(String[] args) {  //예외클래스여서 이 클래스에 소속된게 아님. 따로 만든것과 같아서 안나온느것임
		AccessParent ap = new AccessParent();
		//ap.
	}
}
