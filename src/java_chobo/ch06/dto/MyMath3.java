package java_chobo.ch06.dto;

public class MyMath3 {
public int add(int a, int b) {
	System.out.println("int add(int a, int b) -" );
	return a+b;
	
}
	public long add(int a, long b) {
		System.out.print("long add(long a,long b) - ");
		return a+b;
	}
	
	public long add(long a, int b) {
		System.out.print("long add (long a, int b) - ");
		return a+b;
	}
	public long add(long a, long b) {
		System.out.print("long add (long a, long b) - ");
		return a+b;
}	public int add(int[] a) {
	System.out.print("int add(int[] a) -");
	int resurt = 0; 
	for(int i = 0; i<a.length; i++) {
		resurt += a[i];
	
	}
	return resurt;
}
	
	}
