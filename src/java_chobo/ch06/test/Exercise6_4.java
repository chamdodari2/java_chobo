package java_chobo.ch06.test;

public class Exercise6_4 {

	public static void main(String[] args) {

		// testStack();

		MyQueue queue = new MyQueue();
		System.out.println(queue);
		
		// 6개 데이터 삽입
		char ch = 'a';
		for(int i = 0; i<6;i++) {
			queue.insertItem(ch++);
			queue.prnQueue();
		}
		// 6개 데이터 삭제
		for(int i = 0; i<6;i++) {
			ch = queue.deleteItem();
			System.out.printf("[%c]%n" ,ch);
			queue.prnQueue();
		}
		
		
//		queue.insertItem('t');
//		System.out.println(queue);
//		queue.insertItem('e');
//		System.out.println(queue);
//		queue.insertItem('s');
//		System.out.println(queue);
//		queue.insertItem('t');
//		System.out.println(queue);
//		queue.insertItem('a');
//		System.out.println(queue);
		
	
	
	
			
	}

	public static void testStack() {
		MyStack stack = new MyStack();
		System.out.println(stack); // top -1

		stack.push('t');
		System.out.println(stack); // top 0

		stack.push('e');
		System.out.println(stack); // top 1

		stack.push('s'); // top 2
		System.out.println(stack);

		stack.push('t'); // top3
		System.out.println(stack);

		stack.push('a'); // top 4
		System.out.println(stack);

		stack.push('l'); // "stack is overflow" 입니다. 띄우기
		System.out.println(stack);

		System.out.println(stack.pop()); // a
		stack.prnStack();
		System.out.println(stack.pop()); // t
		stack.prnStack();
		System.out.println(stack.pop()); // s
		stack.prnStack();
		System.out.println(stack.pop()); // e
		stack.prnStack();
		System.out.println(stack.pop()); // t
		stack.prnStack();
		System.out.println(stack.pop()); // underflow
		stack.prnStack();
	}

}
