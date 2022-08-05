
public class Lion extends Mammal{ 
private int age;

public Lion(String name, int age) { // 이제부턴 이렇게 말고 이렇게 
	super(name); // 자식 클래스와 부모클래스가 변수도 다름. 그러니 super 로 부모클래스를 초기화 해줌 . new 없이. 또 메소드의 맨위에 있어야함  like this. 메소드
	//this(name); 둘다 맨처음 가야해서 동시에 쓸수는 없다. 
	this.age = age;    //변수를 넣기. 값 넣지말고 
}
@Override
public String toString() { //부모 값이라도 프라이빗이라면 못씀. 어떻게? getter 필요 
	return"이름은"+getName()+", 나이는"+this.age;
}
}


