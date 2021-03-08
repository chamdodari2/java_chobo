package java_chobo.ch06;

import java.util.Arrays;

import java_chobo.ch06.dto.Tv;

public class Ex6_3 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];

		System.out.println(Arrays.toString(tvArr));

		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		System.out.println();
		System.out.println();
		prnArrTv(tvArr); // 한줄씩 띄워서 보기

		tvArr[0].color = "red";
		tvArr[0].isPower = true;
		tvArr[0].channel = 10;
		System.out.println();
		prnArrTv(tvArr);
		System.out.println();
		for (Tv t : tvArr) { // 채널업 호출
			t.chanelUp();

		}
		prnArrTv(tvArr);

	}

	private static void prnArrTv(Tv[] tvArr) {
		for (Tv t : tvArr) {
			System.out.println(t);
		}

	}

}
