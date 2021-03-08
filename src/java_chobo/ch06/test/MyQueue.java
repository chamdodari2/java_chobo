package java_chobo.ch06.test;

import java.util.Arrays;

public class MyQueue {

	char[] queue;
	int rear;
	int front;
	final int SIZE = 5;

	public MyQueue() {  //초기화 해줘야한당
		rear = -1;
		front = -1;
		queue = new char[SIZE];
	}

	public void insertItem(char item) {
		if(rear == SIZE-1) {
			System.out.println("queue is overflow ");
			return;
		}
		queue[++rear] = item;
	} 

	public char deleteItem() {
		if(front ==rear) {
			System.out.println("queue is underflow" );
		return ' ';
		}
		return queue[++front];   //1 증가시킨 프론트를 리턴 
		 
	}  
	
	public void prnQueue() {
		if (rear == front) {
			System.out.println( " queue is empty");
			return;
		}
		for(int i = front+1; i<rear+1;i++) {
			System.out.printf("[%c]",queue[i]);
		}
		System.out.println();
	}
	
	
	
	@Override
	public String toString() {
		return String.format("MyQueue [queue=%s, rear=%s, front=%s, SIZE=%s]", Arrays.toString(queue), rear, front,
				SIZE);
	}

}
