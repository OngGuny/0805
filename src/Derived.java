
public class Derived extends Base {
	String name = "박지민"; // overshadow  variable
			void print() { //override method
		System.out.println("나는 자식의 메소드 ");
	}
			void display() {
//				System.out.println("나의 이름은 "+this.name);
//				System.out.println("부모님의 이름은 "+super.name);
				this.print();// 내 주소의 멤버 메소드  프린트. 내주소는 derived 
				super.print();//부모 주소의 멤버메소드 프린트 
			} // constructor 의 맨처음이지 메소드에선 상관없다 
}
