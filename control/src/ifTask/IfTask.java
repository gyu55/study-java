package ifTask;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
//      거스름돈 계산하기
//      1번 상품: 코카콜라 - 2000원
//      2번 상품: 팹시 - 1500원
//      3번 상품: 맥콜 - 1000원

//      가진돈은 10000
//      사용자가 하나의 상품을 선택하고 구매개수를 입력해서
//      거스름돈을 계산하는 로직을 완성하시오
//      출력 예시)
//      구매상품: 콜라 2개
//      판매가격: 4000원
//      거스름돈: 6000원
		String product = "", count = "";
		int money = 10000;
		int pay = 0;
		int change = 0;
		String msg = "구매하실 상품과 수량을 선택해주세요.\n1번 상품: 코카콜라 - 2000원\n2번 상품: 팹시 - 1500원\n3번 상품: 맥콜 - 1000원\nex) 팹시 4";
		System.out.println(msg);
		String coca = "코카콜라", pepsi = "팹시", maccol = "맥콜";
		String buyProduct = "";
		String result = "구매상품: %s %s개\n판매가격: %d원\n거스름돈: %d원";
		Scanner sc = new Scanner(System.in);
		
		product = sc.next();
		count = sc.next();
		
		if(product.equals(coca)) {
			buyProduct = product;
			pay = Integer.parseInt(count) * 2000;
			change = money - pay;
		}else if(product.equals(pepsi)) {
			buyProduct = product;
			pay = Integer.parseInt(count) * 1500;
			change = money - pay;
		}else if(product.equals(maccol)) {
			buyProduct = product;
			pay = Integer.parseInt(count) * 1000;
			change = money - pay;
		}else {
			System.out.println("다시 입력해주세요.");
		}
		
		System.out.printf(result, product, count, pay, change);
		
		
	}
}
