package java_chobo.ch09;
public class Test02 {
	public static void main(String[] args) throws InvalidWithdraw2 {
		BankAccount ba = new BankAccount(-100000);
		ba.withdraw(50000);
		System.out.println();
//		ba.withdraw(500000);
	}
}

class BankAccount {
	int jango; // 최저 잔금
	int money; // 현재 잔고
	public BankAccount(int jango) {
		this.jango = jango;
	}
	void deposit(int money) { // 입금메소드
		System.out.println("입금결과 잔고 : ");
		this.money += money;
	}
	void withdraw(int money) throws InvalidWithdraw2 { // 출금메소드
//			this.money = this.money - money; 이렇게하고 if문으로 출금실패 발생하는 문장 넣어도 된당!!
		if ((money < 0) || this.money - money <= this.jango) { // 조건 : 인출할 돈이 음수이거나, (현재잔고(0원) - 인출할돈(50만원)이 최저잔고(-10만원)보다 작으면 예외발생시킴														
			throw new InvalidWithdraw2("출금실패");
		} else {
			this.money = this.money - money;
			System.out.println("통장 잔액은");
			System.out.println(this.money);
		}
	}
}

class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}

}
