package java_chobo.ch07.test;

import java.util.Arrays;

public class Buyer extends Product {
	public static int price;
	int money = 1000; // 돈
	int money2 = money;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열 (저장소)
	int i = 0; // product배열 cart에 사용될 index

	
	Buyer() {
		super(price);
	}

	void buy(Product p) { //매개변수 p(구입할 물건) : 외부에서 작성한 값을 던져준다
		/*
		 * 1. 가진 돈(money) 과 물건의 가격(price)을 비교해서 가진 돈이 적으면 메서드를 종료 
		 * 1.2 가진 돈이 충분하면 제품의 가격 (price)을 가진 돈에서 빼고 
		 * 1.3
		 * 장바구니(cart)에 구입한 물건을 담는다(add메서드 호출)
		 */
		
		if (money < p.price) {
			System.out.println("돈이 모자라서 더이상 살 수 없어요!");
		 return;
		} 
		if (money >= p.price) {
			money -= p.price;
			System.out.print(p );
			System.out.println(" 구매성공!");
			System.out.printf(" 잔액은===> " + money+"원%n");
			System.out.println();
			add(p);
		}
		
	}

	void add(Product p) { //p는 구입할 물건
		
		/*1.1 i의 값이 장바구니의 크기보다 같거나 크면
		 * 1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다
		 * 1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
		 * 1.1.3 새로운 장바구니왁 ㅣ존의 장바구니를 바꾼다
		 * 1.2 물건을 장바구니(cart)에 저장한다. 그리고 i 의 값을 1 증가시킨다
		 * 
		 * 
		 * */

		if (i >= cart.length) {
			Product[] newcart = new Product[cart.length*2];
		for(int i = 0; i < cart.length ; i++ ) {
			newcart[i] = cart[i];  
			
		} cart = newcart;
			
			
		} cart[i++] = p;
		
				
	}  //add (Product p )
void summary() {
	/*
	 * 1.1장바구니에 담긴 물건들의 목록을 만들어 출력한다.
	 * 1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
	 * 1.3 물건을 사고 남은 금액(money)을 출력한다.
	 * */
	System.out.println();
	System.out.println(" < 장바구니 >");
	System.out.println(Arrays.toString(cart));
	
	System.out.println("사용한 금액은  "+ (money2-money)+ "원 입니다");
	System.out.println("남은 금액은 " + money+ "원 입니다.");
	
	
}
}
