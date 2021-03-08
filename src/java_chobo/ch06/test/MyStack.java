package java_chobo.ch06.test;

import java.util.Arrays;

public class MyStack {
	//멤버변수
	
	char[] chArr;
	int top;
	int size = 5;
	
	
	//멤버 메소드 (속성)
	public MyStack() {
		this.top = -1;   //top = -1;
		this.chArr = new char[size];   // chArr = 5;
	}
	public void push(char item) {  
		
		if(top ==size -1) {
			System.out.println("stack is overflow"); //top(-1) == size(4)이면  오버플로우 출력
			return;
			
		}
		chArr[++top] = item;  // chArr[++top](chArr [0]) 에 item 값을 넣기
	}
	
	
	public char pop() {
		if(top ==-1) {
			System.out.println("stack is underflow");
			return ' ';
		}
		return chArr[top--];			
	}
	public void prnStack() {
		if(top ==-1) {
			System.out.println("stack is empty");
		return ;
		}
	for(int i = 0 ; i<top+1;i++) {
		System.out.printf("[%c]",chArr[i]);
	}
		System.out.println();
		}
	@Override
	public String toString() {
		return String.format("MyStack [top=%s, chArr=%s, size=%s]", top, Arrays.toString(chArr), size);
	}
	
	//ㅊ기화
	
}
