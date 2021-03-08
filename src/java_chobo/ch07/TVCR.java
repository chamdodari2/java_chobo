package java_chobo.ch07;

public class TVCR extends Tv{
	
	VCR vcr;   //이렇게 안적고 명시적으로 여기에 적용해도 된다.(디폴트생성자에서 말고)
	int counter;
	
	
	public TVCR() {  //디폴트생성자
	vcr = new VCR();
	counter = vcr.counter;
	}
	
	/**
	 * adapter pattern, 대행자(proxy) 라고 한다. (위임한것)
	 * 
	 * 
	 * **/
	void play() {
		vcr.play();
		
		
	}
	

	
	
	
}
