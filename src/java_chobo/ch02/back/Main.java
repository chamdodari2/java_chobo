package java_chobo.ch02.back;

import java.util.concurrent.ExecutionException;

class Main {
	public static void main(String[] args) {
		Object obj = new Object();
		try {
			Integer in = (Integer) obj;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(1);
		}catch (ClassCastException e) {
			System.out.println(2);
		}catch (Exception e) {
			System.out.println(3);
		}finally {
			System.out.println(4);
		}
	}

}
