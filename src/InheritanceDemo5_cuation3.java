/*
 * 상속 시 주의할 점 
 * 3. static 에 주의하자  상속과 관련이 없다. 
 */
public class InheritanceDemo5_cuation3 {
public static void main(String[] args) {
	Sub sub = new Sub();
	System.out.println("국어 점수는 "+sub.kor);
	System.out.println("영어 점수는 "+sub.eng); 
	System.out.println("영어 점수는 "+Super.eng); // 스태틱은 클래스이름으로 접근, 자식 주소가 필요하지 않다.  즉, 스태틱은 상속과 상관없다. 공유변라서 
}
}
