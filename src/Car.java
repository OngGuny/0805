import java.util.Date;

public class Car {
	private String name;
	private int price;
	private String maker; 
	private Date today; // 자동차 만들때 안넣음. 멤버 외 초기화할때 넣어보자
	// 이까지만 입력하고 툴 사용한다. Constructor 만들기 using field 
	private final double Pi ;//얘는 언제초기화? 생성자가 
	public Car(String name, int price, String maker) {
		//super(); 나중에 사용 
		this.name = name;
		this.price = price;
		this.maker = maker; 
		
		System.out.println("방금 객체가 생성되었습니다.");
	}
	//생성자와 비슷한녀석이 있음. 
	// 그냥 ㄱ중활호만 열음. 이름이없다. 
	{
		 System.out.println("Hello, Neo");
		 this.today= new Date(); // 멤버변수 이지만 구지 초기화 할 필요가 없어서 밖으로 뺌. 근데 프라이빗이니까 게터세터 해줘야함 
		 this.Pi=3.141596;
	}// 암것도 없는디 먼저 실행됨 
	// 생성자를 통해 멤버변수 초기화가 가능한데 
	// 생성자는 파라미터 있어야함. 근데 얘는 괄호가 없음. 
	// 파라미터도 못받음. 이름도 없음. 2번쨰 콜도 못함. 
	// 객체를 메모리에 로딩할 때 단 한번만 실행되는아이. 
	// 멤버변수 초기화 외의 나머지 초기화를 담당함 
	// 멤버변수와 관련없는애를 초기화. db열기. file 열기
	// Initialization Block. 

	
	//tosting 써보자
	@Override // 투스트링은 부모님꺼를 재정의한거다 라고 알려주는것. 
	public String toString() {
		return "오늘은" + this.today + "입니다."; // 스트링은 문자열과 '+' 해버리면 전부 스트링으로 바꿔줌 
	}
	
	//생성자의 역할은 멤버변수 또는 멤버상수의 초기화
	//생성자를 통해서 또는 이니셜라이제이션블록을 통해서 초기화
	
}
