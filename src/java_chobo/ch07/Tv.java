package java_chobo.ch07;

public class Tv {
	boolean power;	//전원상태(on/off)
	int channel;	//채널
	
	
	void power() {
		power = !power; 
		}
	
	void channelUp() {
		++channel; 
		}
	void channelDown() {
		--channel; 
		}
	
	
}
