package java_chobo.ch09;

import java_chobo.ch09.Test02.BankAccount;

public class Ex03  {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(-100000);

		ba.withdraw(500000);
		System.out.println(ba.jango);
	}
}