package java_chobo.ch07.inter;

public class Ex7_17 {
	Object iv = new Object() {
		void method() {

		}
	}; // 익명클래스
	static Object cv = new Object() {
		void method() {

		}
	}; // 익명클래스

	void myMethod() {
		Object lv = new Object() {
			void method() {
			}
		}; // 익명클래스
	}

}  //바이트코드 보기
