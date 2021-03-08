package java_chobo.ch06.test; //208쪽

public class Student {
	// 멤버변수 + 멤버메소드

	String name; // 학생명
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 엉어점수
	int math; // 수학점수

	public Student() { // 알쉬s 수퍼클래스를 이용한 생성 이거까지 해줘야함.
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) { // 알쉬s 필드를 통한 생성자 누르면 자동으로 뜸 (메소드생성)

		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public String info() {

		return String.format("%s,%d,%d,%d,%d,%d,%d,%.1f", name, ban, no, kor, eng, math, kor + eng + math,
				(kor + eng + math) / 3F);

	}

	public int getTotal() {
		
		return kor+eng+math;
	}

	public float getAverage() {
		String res = String.format("%.1f",getTotal()/3.0F);
		
		//return Float.parseFloat(res);  //이건 잠시 거쳐가는것
		return Float.parseFloat(String.format("%.1f",getTotal()/3.0F)); //이렇게 해도된다.
	}

}
