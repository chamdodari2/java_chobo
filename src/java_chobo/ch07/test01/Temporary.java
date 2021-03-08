package java_chobo.ch07.test01;

class Temporary extends Employee {
	int workHours;
	int timeSalary = 10000;

	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
		this.salary = workHours*timeSalary; 
	}
	public Temporary(String name, int age, String juso, String dept) {
		super(name, age, juso, dept);


	} // 비정규직
//	public void setSalary(int salary) {
//		this.salary = workHours*timeSalary; 
//	}

	void printlnfo() {
		System.out.printf("비정규직"+","+workHours+","+ salary);
	}

}