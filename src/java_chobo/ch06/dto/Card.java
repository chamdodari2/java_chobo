package java_chobo.ch06.dto;

public class Card  extends Object{

	// 인스턴스 변수는 소문자, 카멜표기식 (두단어로 조합시 단어의 첫글자 대문자)
	private String kind; // private을 붙여주면 접근지정. 같은 패키지 내에 있더라도 다른 클래스에서는 접근불가. 반대로 public은 다른패키지에서도 사용가능.
	private int number; // private 적혀있으면 메소드를 통해서만 다른패키지에서 사용가능. (알쉬에스 게러쎼러)
							// 메소드를 통하지않고 바로 접근해버리면 결합도 측면에서 안좋다. 뭐가 변경되었는지 모르기때문. 정보은닉과도 관계가 있다. 보호
	
	
	// 클래스 변수는 대문자, (두단어로 조합시 _로 구분)
	public static int WIDTH = 100; // 클래스변수는 주로 public으로 선언한다. 또한주로 상수로 선언한다.
	public static int HEIGHT = 250;
	
	
	//직접치는거 아님 생성자 생성은 알쉬S 수퍼 어쩌구.. 작성 안해도 default constructor 된다.(컴파일러가 자동으로 안보이는곳에 생성)
public Card() {
		super();  //얘는 부모클래스를 참조하고있다. 맨위에 안적혀있어도 오브젝트 클래스를 참조하고 있다고 봐야함.
		// TODO Auto-generated constructor stub
	}

	//직접치는거 아님. 자동으로
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
//직접치는거아님 . 오브젝트에서 tostring 가져와서 출력양식을 수정하는것.  재정의하지않으면 오브젝트양식 그대로 출력. 
	@Override  //다형성도 설명 나중에 다시..
	public String toString() {  // 요 이름은 수정하면안되고, 공개할 범위는 더 커야한다. 예)퍼블릭
		return String.format("Card [%s %s]", kind, number);
	}
	
	

}
