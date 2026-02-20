package inheritanceTest;

class Animal {
	String name;
	
	void eat() {
		System.out.println("먹기");
	}
	void sleep() {
		System.out.println("자기");
	}
	void poop() {
		System.out.println("배변 처리");
	}
	void walk() {
		System.out.println("걷기");
	}
}

class Person extends Animal {}
class Monkey extends Animal {}
class Cat extends Animal {}
class Snake extends Animal {
	
	@Override // -> 생략가능하지만 생략x 개발자간의 소통을 위해
	void walk() {
		System.out.println("기어다니기");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Person person = new Person();
		Monkey monkey = new Monkey();
		Cat cat = new Cat();
		Snake snake = new Snake();
		
		
		
		
		
	}
}
