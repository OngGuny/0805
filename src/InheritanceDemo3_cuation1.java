/*
 * 상속할 떄 주의할 점 가지
 *
 * 
 * 1. 생성자는 상속되지않는다. Mammal , Lion 참조  
 * 	- 자식 생산자는 항상 부모의 기본생성자만 호출하기 때문이다
 * - 만일 부모의 기본 생성자가 없다면 에러를 발생하고
 * - 에러를 해결하기 위해 1)부모의 기본 생성자를 명시적으로 표현하거나 2)super()를 사용한다.
 * -super 주의할점 
 * - - 생성자 안에서만 사용하고 반드시 생성자 안의 첫줄에 와야한다.(Like this )
 * 2. 
 * 3
 * 4/
 */
public class InheritanceDemo3_cuation1 {
public static void main(String[] args) {
	Lion lion = new Lion("Lion King",26);
	System.out.println(lion);
}
	
}

