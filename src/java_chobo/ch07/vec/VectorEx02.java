package java_chobo.ch07.vec;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

//컨+쉬+O

public class VectorEx02 {

	public static void main(String[] args) {
		Student std01 = new Student(1, "이종윤", 90, 80, 70);
		Student std02 = new Student(2, "김상건", 91, 81, 70);
		Student std03 = new Student(3, "임준엽", 92, 82, 70);

		Vector<Student> vecStr = new Vector<>();
		vecStr.add(std02);
		vecStr.add(std01);
		vecStr.add(std03);

		System.out.println(vecStr);
		System.out.println(vecStr.contains(new Student(2))); // 학번으로 검색하기.
		System.out.println(vecStr.contains(new Student(2, "김상건", 91, 81, 70))); // 학번으로 검색하기. :
		 System.out.println(vecStr.indexOf(new Student(2)));

		 int stdIdx = vecStr.indexOf(new Student(3));
		 System.out.println(vecStr.get(stdIdx));

		Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.stdNo - o2.stdNo;
			}

		};

		Comparator<Student> cKor = new Comparator<Student>() { // comparator : 비교하는것. 뭘가지고 비교할래 라는것  --> sort 메소드사용하기

			@Override
			public int compare(Student o1, Student o2) {

				return o1.kor - o2.kor;
			}

		};

		vecStr.sort(c); // 정렬쓰 된당
		System.out.println("sorted" + vecStr);

		vecStr.sort(cKor);
		System.out.println("Kor sorted" + vecStr);
		
		

		Vector<String> vec1 = new Vector<String>();
		vec1.add("abc");
		vec1.add("def");
		vec1.add("ghi");

		boolean isContain = vec1.contains("def"); // 해당문자열 있는곳. 트루면 출력하기
		int idx = vec1.indexOf("ghi");
		System.out.println(isContain + " : " + idx); // ghi가 있으면 몇번째에 있는지 출력
	}

}
