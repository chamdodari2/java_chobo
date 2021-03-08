package java_chobo.ch07;

public class VCR {
	
	boolean power;
	int counter;
	
	
	
	public void power() {
		this.power = !this.power;   //전원 계속 반전
		
	}
	
	
	public void play(){
		
		System.out.println("VCR play");
		
	}
	
	public void stop(){
		System.out.println("VCR stop");
		
	}
	public void rew(){
		System.out.println("VCR rew");
	
}
	public void ff(){
		System.out.println("VCR ff");
	
}
	
}
