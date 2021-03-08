package java_chobo.ch09;//교재 336

public class StringEx {

	public static void main(String[] args) {
		String str = "ab,cd,ef";
		String[] ar = str.split(","); // 리턴타입 배열임
		for (String e : ar) {
			System.out.println(e);
		}
	}

}
