
public class InheritanceDemo {
	public static void main(String[] args) {
		ThreeD td = new ThreeD();
		td.print();
		// extends 쓰기 전에는 twod의 변수 못썼다.
//	Car car= new Car("",22,"");		//내려받는게 아니라 접근하도록 허락하는것. 
	}
}

class TwoD {
	int x = 5, y = 10;

	public TwoD() {
		System.out.println("나는 TwoD");
	}

	void print() {
		System.out.printf("(x,y)=(%d,%d)\n", this.x, this.y);
	}
}

class ThreeD extends TwoD{ // 접근 주소는 자식인데 접근하는 자료는 부모        
	int z = 100; 						// 코드를 복사한게 아니라 접근하는것. 
	public ThreeD() {System.out.println("나는 ThreeD");}
	
}
//부모를 만든 후 자식을 만들어야함 . 
..