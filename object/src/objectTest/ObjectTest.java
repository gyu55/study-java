package objectTest;

public class ObjectTest {
//	1. private 
	String name;

//	-> 쓰는 이유 : 함부로 직접 접근 x / 화면에서 쓸 것임. 
//	2. 기본 생성자 (컴파일러가 만들어줌)
	public ObjectTest() {
		;
	}

//	3. 초기화 생성자
	public ObjectTest(String name) {
		super();
		this.name = name;
	}

//	4. getter
	public String getName() {
		return name;
	}

//	5. setter
	public void setName(String name) {
		this.name = name;
	}

//	6. toString(): 해당 객체의 필드를 확인하기 위한 용도
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		System.out.println(ot);
		System.out.println(ot.toString());

		User user1 = new User(1L, "홍길동");

	}
}
