package java_chobo.ch07.test01;

class Regular extends Employee {
	
	public Regular(String name, int age, String juso, String dept) {
		super(name, age, juso, dept);

	}
	public void setSalary(int salay) {
		this.salary = salay; 
	}
	void printlnfo() {	
		System.out.printf("정규직"+salary);
	}
}