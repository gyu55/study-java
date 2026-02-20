package inheritanceTask;

// Phone
// 이름, 브랜드, 가격
// 문자발신 sms()
// 전화 call()
class Phone {

//	1. private를 붙이자
	private String name;
	private String brand;
	private int price;

//	2. 기본 생성자
	public Phone() {
		;
	}

//	3. 초기화 생성자
	public Phone(String name, String brand, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

//	4. getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void sms() {
		System.out.println("문자 발신");
	}

	public void call() {
		System.out.println("전화 띠리링");
	}
}

// Phone2G
// 인터넷

class Phone2G extends Phone {
	public Phone2G() {
		;
	}

	public Phone2G(String name, String brand, int price) {
		super(name, brand, price);
	}

	public void internet() {
		System.out.println("인터넷 가능");
	}
}

// Phone3G
// 인터넷, 영상통화

class Phone3G extends Phone2G {
	
	public Phone3G() {;}
	public Phone3G(String name, String brand, int price) {
		super(name, brand, price);
	}
	
	public void faceTime() {
		System.out.println("영상통화 가능");
	}
}

// Phone2G, Phone3G 객체화
// Phone2G: 인터넷 메서드를 호출
// Phone3G: 영상통화 메서드 호출

public class InheritanceTask3 {
	public static void main(String[] args) {
		Phone p = new Phone();
		Phone2G p2g = new Phone2G();
		Phone3G p3g = new Phone3G();
		
		p.call();
		p2g.call();
		p2g.internet();
		p3g.call();
		p3g.faceTime();
		
	}
}