
public class ConstructorDemo {
public static void main(String[] args) {
	Car car= new Car("Sonata", 30_000_000,"Hyundai Motors"); //생성자 만들어 놔서 기본형은 오류뜸 파라미터 입력해줘야함
	System.out.println(car); // 이러면 오늘의 날짜를 표시 근데 기본값으로 car (toString) 으로 설정되있음.  
	// 자동차와 관련이 없는 애인데도 오늘의 날짜가 떴다.  빈칸의 {}은 생성자보다 먼저 호출되고 행동한 후에 나머지가 실행 . 이게 이니셜라이제이션 블록, 2번 못부른다. 
	//상수 초기화도 가능 


}
}