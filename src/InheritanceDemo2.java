
public class InheritanceDemo2 {
public static void main(String[] args) {
	Manager m = new Manager();
	Employee e = new Employee();
	System.out.println(m.salay);
	System.out.println(e.name); 
	System.out.println();  // 설계도 상으로만 데이터가 뜨는거지 접근  ㅅㄹ제로 받는건 브미주소 
	System.out.println(e.salay);// Employee에는 salay 없는데, 값은 나온다.왜? 상속받은 메소드라. 부모메소드에 있는 정보에 접근가능  
}
}
class Manager {
	int salay=100000;
	
}



class Employee extends Manager { //부모의 데이터 타입을 따라가야함 
	String name="한지민";
}
// final 로 익스텐스한다고 됬으면 상속못받음 .
// 자바에서 정해놓ㅇ느 몇개 이음 
// 상속할 때 주의할 때 4가지가 있다. 
