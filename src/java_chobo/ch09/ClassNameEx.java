package java_chobo.ch09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import sun.awt.ConstrainableGraphics;  //이거아인거같은디

public class ClassNameEx {

	public static void main(String[] args) {
		Point p = new Point(4, 5);

		Class<?> obj = p.getClass();
		Constructor<?>[] cons = obj.getConstructors(); // 생성자가 여러개 있으면 정보를 이 배열에 담아준다는뜻
		for (Constructor<?> c : cons) { // 소스코드로 받은게 아닌 바이트코드로 받았다면 이걸로 분석할수있다.
			System.out.println(c);
		}

		for (Method m : obj.getDeclaredMethods()) {
			System.out.println(m);
		}
		
		String a ="aaaaa";
		int idx1=a .indexOf('a');
	}

}
