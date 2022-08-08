// 클래스 생성창에서 부모클래스를 지정해줬다. 
public class Sparrow extends Birds {
	private int age;

	public Sparrow(int age) {
		//super();// 제너레이터로 만들면 이게 따라들어옴. 자식 생성자는 반드시 부모의 기본생성자를 호출하기 때문에. 이건기본이라 있어도 그만 없어도 그만  없에도 에러안나는건 버드클래스에 기본생성자 만들어놔서
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
