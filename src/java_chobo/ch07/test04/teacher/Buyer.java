package java_chobo.ch07.test04.teacher;

import java.util.Vector;

public class Buyer {
	int money = 1000;
//	Product[] cart = new Product[3]; 	// 구입한 제품을 저장하기 위한 배열

	Vector<Product> cart = new Vector<Product>();

	void buy(Product p) {

		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
			return;
		}
		money = money - p.price;
		cart.add(p);
//		System.out.printf("%s (%d)%n", p, p.price);
	}

	void add(Product p) {
	} // add(Product p)

	void summary() {

		StringBuilder itemList = new StringBuilder(); // 문자열 수정할때는 스트링 말고 Builder로 해야한다!
		int sum = 0;
		for (Product item : cart) {
			itemList.append(String.format("%s(%d), ", item.toString(), item.price));  //stringbuilder 하면 append 사용가능(?)
			sum += item.price;
		}
		if (itemList.length() == 0) { //
			System.out.println("구매상품 없음");

		} else {
			itemList.replace(itemList.length() - 2, itemList.length() - 1, ""); // 새로추가한거 (비어있으면 쉼표제거하기) : 하위 문자열에 있는 문자를 지정된 문자열의 문자로 바꾼다. 하위 문자열은 지정된 시작에서 시작하여 인덱스 끝-1문자로 확장되거나 해당 문자가 없는 경우 이러한 쿼리의 끝까지 확장된다??
		}

		System.out.println("구입한 물건:" + itemList);
		System.out.println("사용한 금액:" + sum);
		System.out.println("남은 금액:" + money);
		System.out.println();
	} // summary()

}
