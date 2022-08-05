/*상속시 주의할점 
 * 4. 같은 이름을 가진 resource는 상속되지 않는다. 
 * - 같은 이름의 변수는 overshadow변수. 
 * - 같은 이름의 메소드는 override method  
 * -  접근을 자식에서부터 하니까 부모까지 안올라가고 자식꺼 쓴다. 
 * 
 */
public class InheritanceDemo6_cuation4 {
public static void main(String[] args) {
	Derived d = new Derived();
//	System.out.println(d.name); // 구지 부모까지 가지말고 자기껄로 쓴다.= 상속되지않는다. 
//	d.print();
	// 구지 부모의 이름 가져오려면  자식 클래스에서 super 쓴다. 
	d.display();
}
}
