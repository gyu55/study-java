package classTest;

//	동물(Animal)
//	이름(name), 나이(age), 종류(species)
class Animal {
	String name;
	int age;
	String species;
	
//	1. 기본 생성자 ( 건들면 안 돼 ) -> 객체가 호출되는 순간에 실행 / 생략해도 JAVA에서 만들어주긴 하지만, 반드시 만들어주는 게 좋음
	public Animal() {;}	

//	2. 초기화 생성자 ( 객체지향언어의 오버로딩 ) -> this 명령어를 통해 heap 메모리에 있는 객체 주소를 접근함
	public Animal(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}	
}

public class ClassTest {
	public static void main(String[] args) {
//		메모리에 할당 ->
		Animal rabbit = new Animal();
//		rabbit.name = "토깽이";
//		rabbit.age = 20;
//		rabbit.species = "토끼";
		
//		System.out.println(rabbit.name);
	}
}
