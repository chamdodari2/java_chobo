package java_chobo.ch07.access;  //교재 245쪽  캡슐화와 접근제어자

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	
	
	
	 public Time() {   //기본생성자로 -1로 세팅
		this.hour= -1;
		this.minute = -1;
		this.second = -1;
		
		
	}
	 
	 
	 
	public Time(int hour, int minute, int second) {  
		setHour(hour);   //이렇게 해주면  나중에 시간기준이 바뀌더라도 밑에 if(hour< 0|| hour >23)부분만 수정하면된다.
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}



	//이건 의미없다? 다 들어간당??
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour< 0|| hour >23) return;
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	
		
	
	@Override
	public String toString() {
		return String.format("Time [hour=%s, minute=%s, second=%s]", hour, minute, second);
	}
	
	
	
	
	public static void main(String[] args) {
		Time t = new Time();
		System.out.println(t);
		t.setHour(23);
		System.out.println(t);
		
	}

}
