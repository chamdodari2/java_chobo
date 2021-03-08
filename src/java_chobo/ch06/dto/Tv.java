package java_chobo.ch06.dto; //

public class Tv { // extends Object 생략된것. 명시하지 않으면 오브젝트 클래스를 그대로 상속받고있는것
	//속성 선언(멤버변수)
		public String color; 		 //색상
		public boolean isPower;  	 //전원상태
		public int channel;  		//채널
		
		
		public Tv() {  //이렇게 적어주면 생성자가 명시되는것. 안적어주면 컴파일러가 생성해줌(?)
				super(); // 부모클래스(오브젝트클래스)의 생성자를 호출해주는것. 없어도 있다고 봐야한다 생략되어있는것임.
		}
		
		//기능선언(멤버메서드)
		public void setPower() {
			this.isPower = !isPower;  // this는 나 자신을 의미
		}
		public void chanelUp() {
			this.channel++;
		
		}
		public void chanelDown() {
			this.channel--;   // 알 +쉬+s ,,  제너레이 투스트링 이용했다 (스타일?타입? 포맷으로 바꾸기)
		}
		
		@Override  //오브젝트 클래스의 tostring을 재정의(오버라이딩)하겠다는 뜻임. 호출해준다. override라고 적혀있으면 내용수정하면 안된다. 부모클래스꺼에서 수정(재정의)한것 의미. 부모타입에서의 자료타입과 같아야한다.
		public String toString() {
			return String.format("Tv [color=%s, isPower=%s, channel=%s]", color, isPower, channel);
		}
}

