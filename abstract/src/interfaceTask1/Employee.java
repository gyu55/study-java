package interfaceTask1;

public class Employee extends PersonActionAdapter{
	
	private String name;
	private int age;
	
	public Employee() {;}
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void eat() {
		System.out.println("직장인이 밥을 먹습니다.");
	}
	
	@Override
	public void work() {
		System.out.println("직장인이 출근을 합니다.");
	}
}
