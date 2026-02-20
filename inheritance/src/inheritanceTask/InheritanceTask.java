package inheritanceTask;

//   상속 및 분리 실습
//   
//   PersonTask
//   이름, 나이, 주소, 핸드폰
//   각 메서드 출력
//   work 일을 한다
//   sleep 잠을 잔다
//   eat 세 끼를 먹는다
class PersonTask {
	String name;
	int age;
	String address;
	String phoneNum;
	public PersonTask() {;}
	
	public PersonTask(String name, int age, String address, String phoneNum) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	void work() {
		System.out.println("일을 한다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	void eat() {
		System.out.println("세 끼를 먹는다.");
	}
	
}

//   StudentTask
//   인스타아이디
//   각 메서드 출력
//   work 아르바이트를 한다
//   sleep 수업 시간에 잠을 잔다
//   eat 아침을 거른다
class StudentTask extends PersonTask{
	String instaId;
	public StudentTask() {;}
	public StudentTask(String name, int age, String address, String phoneNum, String instaId) {
		super(name, age, address, phoneNum);
		this.instaId = instaId;
	}
	@Override
	void work() {
		System.out.println("아르바이트를 한다.");
	}
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다.");
	}
	@Override
	void eat() {
		System.out.println("아침을 거른다.");
	}
 	
}
//   
//   EmployeeTask
//   비상금
//   각 메서드 출력
//   work 하루 종일 일을 한다
//   sleep 잠을 설친다
//   eat 야식을 먹는다
class EmployeeTask extends PersonTask {
	int nestEgg;
	public EmployeeTask() {;}
	public EmployeeTask(String name, int age, String address, String phoneNum, int nestEgg) {
		super(name, age, address, phoneNum);
		this.nestEgg = nestEgg;
	}
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다.");
	}
	@Override
	void sleep() {
		System.out.println("잠을 설친다.");
	}
	@Override
	void eat() {
		System.out.println("야식을 먹는다.");
	}
	
}
//   InhertanceTask에서
//   사람, 학생, 직장인 객체화 후 각 메서드 출력하기

public class InheritanceTask {
   public static void main(String[] args) {
	   PersonTask person = new PersonTask("홍길동", 20, "서울시 강남구", "010-1234-1234");
	   person.work();
	   person.sleep();
	   person.eat();
	   
	   System.out.println("=========================");
	   StudentTask student = new StudentTask("장보고", 15, "경기도 남양주시", "010-1234-1111", "jang_vely");
	   System.out.println("인스타 아이디 = " + student.instaId);
	   student.work();
	   student.sleep();
	   student.eat();
	   
	   System.out.println("=========================");
	   EmployeeTask employee = new EmployeeTask("나사원", 32, "서울시 노원구", "010-5677-1234", 500_000);
	   System.out.println("비상금 = " + employee.nestEgg);
	   employee.work();
	   employee.sleep();
	   employee.eat();
			   
   }
}
