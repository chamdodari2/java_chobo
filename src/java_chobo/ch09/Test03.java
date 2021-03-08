package java_chobo.ch09;
public class Test03 {
public static void main(String[] args)  {
		BankAccount2 ba = new BankAccount2(-100000);
		ba.deposit(100000);
		try {
			ba.withdraw(100000);
		} catch (InvalidWithdraw e) {		
			e.printStackTrace();
		}
		try {
			ba.withdraw(200000);
		} catch (InvalidWithdraw e) {			
			e.printStackTrace();
		}
	}
}
class BankAccount2 {
	int jango; // 최저 잔금
	int money; // 현재 잔고
	public BankAccount2(int jango) {
		this.jango = jango;
	}
	void deposit(int money) { // 입금메소드	
		this.money += money;
		System.out.printf("정상 입금처리 : 입금요청금액 : %d",money);
		System.out.printf("  잔금 : %d%n",this.money);
	}
	void withdraw(int money) throws InvalidWithdraw { // 출금메소드	
		if ((money < 0) || this.money - money <= this.jango) { // 조건 : 인출할 돈이 음수이거나, (현재잔고(0원) - 인출할돈(50만원)이 최저잔고(-10만원)보다 작으면 예외발생시킴														
			throw new InvalidWithdraw("초과출금 요구 예외");
			
			
		} else {
			this.money = this.money - money;
			System.out.printf("정상 출금처리 : 출금요청금액 : %d",money);
			System.out.printf("  잔금 :  %d%n",this.money);
			System.out.println();			
		}
	}
}
class InvalidWithdraw2 extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw2(String msg) {
		super(msg);
	}

}
