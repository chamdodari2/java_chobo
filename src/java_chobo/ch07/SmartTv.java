package java_chobo.ch07;

public class SmartTv extends Tv {  //smartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;  // 캡션상태(on/off)
	void displayCaption(String text) {
		if(caption) {		//캡션상태가 on 일때만 text를 보여준다.
			System.out.println(text); 
			
		}
	}

}
