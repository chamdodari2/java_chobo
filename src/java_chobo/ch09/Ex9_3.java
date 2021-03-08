package java_chobo.ch09;

public class Ex9_3 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		Person p1 = new Person(1111111111);
		Person p2 = new Person(1111111111);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
		
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
		
		
	}

}
