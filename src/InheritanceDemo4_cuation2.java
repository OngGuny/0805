/*상속시 주의할점 
 * 2. private 는 상속되지 않는다.  그저 연결된 것일 뿐 엄연히 다른 클래스 .private 는 자기 클래스 안에서만 사용가능하고 밖의 클래스에선 접근 불가능 
 * 
 */
public class InheritanceDemo4_cuation2 {
	public static void main(String[] args) {
		Sparrow sp = new Sparrow(10);
		System.out.println(sp.getAge()); // sp. 해도 private 걸린 부모 으 변수라 접근 불가능 = private 는 상속되지 안흔ㄴ다. 
	} // 애초에 나이도 락걸리면 getter/setter 아니고서야 못본다. 
	
 }
