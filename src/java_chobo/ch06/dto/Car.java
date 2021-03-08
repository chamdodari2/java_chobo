package java_chobo.ch06.dto;

public class Car {
		String color;   //멤버변수
		String gearType;
		int door;
		
		
		public Car() {    //알쉬S  --> 수퍼. 이거보다는 밑에방법
			
//			color = "white";
//			gearType = "auto";
//			door = 4;
									//초기화
			this("white","auto",4); //이렇게 해주면 밑에꺼처럼 순서대로 들어감. 이렇게 작성하려면 반드시 첫줄!!!에만 작성해야함. super도 원래 첫줄에 적어야하나 생략가능함
			System.out.println();
		}

		public Car(Car car) {  // 2.외부에 생성한 객체를 받는다(car 참조변수가 정하는)
			//this(car.color, car.gearType,car.door); 세줄대신 이렇게 적어도된다.
			this.color = car.color;				//밑에꺼 대신 이렇게적어도 된다.
			this.gearType = car.gearType;
			this.door = car.door;
			
		}
		
		public Car(String color, String gearType, int door) {  //1.  알쉬S  -->필드.  괄호안의 변수 : 지역변수. 외부에서 받은 걸로 초기화해주겠다.
			this.color = color;
			this.gearType = gearType;
			this.door = door;
		}

		@Override
		public String toString() {  //출력쓰
			return String.format(color, gearType, door);
		}

}
