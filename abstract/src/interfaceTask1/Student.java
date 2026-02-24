package interfaceTask1;

public class Student extends PersonActionAdapter{
	
	
	public Student() {;}
	
	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("학생" + this.getName() + "이(가) 밥을 먹습니다.");
	}
	
	@Override
	public void school() {
		System.out.println("학생" + this.getName() + "이(가) 등교합니다.");
	}
}
