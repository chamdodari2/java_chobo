package java_chobo.ch07.test01;

import java.util.Set;

public class Employee { // 직원

	String name;
	int age;
	String juso;
	String dept;
	int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJuso() {
		return juso;
	}

	public void setJuso(String juso) {
		this.juso = juso;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String name, int age, String juso, String dept) {
		this.name = name;
		this.age = age;
		this.juso = juso;
		this.dept = dept;
	}
	void printlnfo() {	
		System.out.printf("%d,%d,%d,%d",this.name,this.age,this.juso,this.dept);
	}

	public void setWorkHours(int i) {
		
		
	}


}



