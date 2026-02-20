package classTest;

// Person, Bank
class Bank {
	String bankName;
	int bankMoney;
	
	public Bank() {;}
	
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
//	사용자의 돈을 입금
//	수수료 1000원
	
	void deposit(int money, Person person) {
		this.bankMoney += money + 1000;
		person.personMoney -= (money + 1000);
	}
	
	void withdraw(int money, Person person) {
		this.bankMoney -= money - 5000;
		person.personMoney += money - 5000;
	}
	
}

class Person {
	String personName;
	int personMoney;
	
	public Person() {;}
	public Person(String personName, int personMoney) {
		this.personName = personName;
		this.personMoney = personMoney;
	}
	
}

public class ClassTest2 {
	public static void main(String[] args) {
		Bank kb = new Bank("국민은행");
		Person gyuho = new Person();
		kb.deposit(10000, gyuho);
		System.out.println("gyuho 돈: " + gyuho.personMoney);
		System.out.println("은행의 돈: " + kb.bankMoney);

		kb.withdraw(5000, gyuho);
		System.out.println("gyuho 돈: " + gyuho.personMoney);
		System.out.println("은행의 돈: " + kb.bankMoney);
	}
}
