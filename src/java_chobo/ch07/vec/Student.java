package java_chobo.ch07.vec;

public class Student {

	int stdNo; // 학번
	String name; // 성명
	int kor;
	int eng;
	int math;

	public Student(int stdNo) { // 매개변수가 있는 생성자를 만들경우 이걸 넣어줘야한다.
		this.stdNo = stdNo; // super는 빼도된다.

	}

	public Student(int stdNo, String name, int kor, int eng, int math) {
		this.stdNo = stdNo; // this는 자기자신을 생성자로 하는것
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int total() {
		return kor + eng + math;
	}

	public double avg() {
		return total() / 3D;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + stdNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) { // 외부에서 객체가 넘어오면, 그 객체가 나와 같다면 트루, 널이면 false
		if (obj instanceof Student) { // d원래 이게 fm이다. 그전꺼는 템플릿화???되어있어서 그렇게한거
			Student other = (Student) obj;
			if (stdNo != other.stdNo)
				return true;
			return true;
		}

		return false;

	}

	@Override
	public String toString() {
		return String.format("%3d %5s %3d %3d %3d %3d %.1f", stdNo, name, kor, eng, math, total(), avg());
	}

}
