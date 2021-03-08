package java_chobo.ch06;

import java_chobo.ch06.dto.Student;

public class Exam6_3 {

	public static void main(String[] args) {
		Student std1 = new Student();   //기본생성자. --> 매개변수가 없는 생성자.  생성자의 역할은 필드를 초기화해주는것. 
		Student std2 = new Student(1,"이민정",99,98,97);  //매개변수를 넣으면 해당값으로 초기화
		System.out.println(std1);
		System.out.println(std2);
	}
	

}
