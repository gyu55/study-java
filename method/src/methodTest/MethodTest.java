package methodTest;

public class MethodTest {
//	이름을 받으면 이름을 출력하는 메서드
	void printName(String name) {
		System.out.println(name);
	};
	
//	두 수를 더해서 결과를 반환하는 메서드
	double add(double num1, int num2) {
		return num1 + num2;
	};
	
	public static void main(String[] args) {
		// MethodTest 클래스를 객체화 -> Java는 메모리에 할당하지 않은 메서드를 사용할 수 없음
		
		// 방법 1.
		MethodTest mt = new MethodTest();
		mt.printName("홍길동");
		
		// 방법 2.
		new MethodTest().printName("이순신");
	}
}
