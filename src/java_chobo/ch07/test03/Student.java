package java_chobo.ch07.test03;

public class Student {
	String schoolName;
	String className;
	String classNumber;
	double sum = 0;
	double avg2 = 0;
	double[] avg = new double[8];
	public Student(String schoolName, String className, String classNumber) {
		this.schoolName = schoolName;
		this.className = className;
		this.classNumber = classNumber;
	}
	 void average(){
		
		for(int i = 0; i<avg.length;i++) {
			sum += avg[i];
		}avg2 = sum/avg.length; 
		return;
	} 
}
