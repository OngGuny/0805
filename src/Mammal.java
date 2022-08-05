
public class Mammal extends Object{ // ex ob는 모든 클래스의 자식이라 생략함. 기본. 
private String name;
//public Mammal() {};// 자식클래스는 항상 부모의 기본 생성자를 호출한다. 이게 없으면 상속 했을 때(extends) 오류. 
//이방법은 다른 사람이 클래스 만들었을때 껄끄러워진다. 
//그럼 다르게 초기화 하면 되지. 이게 Super. 자식이 부모의 기본 생성자가아닌 다른 생성자를 호출할때 사용. 
// 위의 기본생성자 대신에 super. 자식 클래스에 
public Mammal(String name) {
	this.name = name;
} 
public String getName() {
	return name;
}
}
