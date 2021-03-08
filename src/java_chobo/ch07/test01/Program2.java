package java_chobo.ch07.test01;

public class Program2 {

	public static void main(String[] args) {
		Employee r =new Regular("이순신",35,"서울","인사부");
		Employee t = new Temporary("장보고",25,"인천","경리부");
		
		r.setSalary(5000000);
		r.printlnfo();
		t.setWorkHours(120);
		t.printlnfo();
		System.out.println("짜잔");
	}

}
