package classTask;

import java.util.Scanner;

// 슈퍼카(SuperCar) 클래스 생성
// 브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴, 엔진을 끔
class SuperCar {
	String brand;
	String color;
	int price;
	boolean engine = false;
	String password;
	int pwErrorCount;

	public SuperCar() {
		;
	}

	public SuperCar(String brand, String color, int price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.engine = engine;
		this.password = password;
		this.pwErrorCount = pwErrorCount;
	}
	
	void isPassword(String pw) {
		if (pw.equals(this.password)) {
			this.engine = true;
			System.out.println(this.brand + " 엔진 시동");
		} else {
			this.pwErrorCount++;
			System.out.println("비밀번호 " + this.pwErrorCount + "회 오류\n[주의] 3회 오류 시, 경찰이 출동할 수 있습니다.");
		}
	}
	
	void callPolice() {
		System.out.println("비밀번호 3회 오류로 인해 경찰이 출동합니다.");
	}
	
	void turnOnEngine() {
		System.out.println(this.brand + " 엔진 시동 킴");
	}
	void turnOffEngine() {
		System.out.println(this.brand + " 엔진 시동 꺼짐");
	}
	
	
}

public class ClassTask2 {

	public static void main(String[] args) {
//   1. 슈퍼차 객체화
		SuperCar car1 = new SuperCar("McLaren", "red", 290_000_000, "asd");
//   2. 비밀번호를 입력, 비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)\
		String message = "비밀번호를 입력하세요.";
		System.out.println(car1.brand + message);
		Scanner sc = new Scanner(System.in);
		while(car1.pwErrorCount < 3) {
			String pw = sc.nextLine();
			car1.isPassword(pw);
			if(car1.pwErrorCount == 3) {
				car1.callPolice();
				break;
			}
		}
//   3. 비밀번호 3회 오류시 경찰 출동
	}

}