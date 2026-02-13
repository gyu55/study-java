package methodTask;

import java.util.Scanner;

public class MethodTask5 {
	public static void main(String[] args) {
		MethodTask5 mt = new MethodTask5();
//     1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
//		double[] result = mt.twoIntegerArr(3, 5);
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
		
//      2. 사용자가 입력하는 값중 정수 분리하기
//      입력 예시)
//      안1녕2하3세4요
//      출력 예시)
//      1234
//		String result = mt.divideInteger("안녕12하세5151요");
//		System.out.println(result);
		
//      3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
//      입력 예시) apple
//      찾을 글자 p
//      반환 2
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력 단어: \nex)apple");
//		String str = sc.next();
//		System.out.println("찾을 글자: \nex)p");
//		String c = sc.next();
//		int result = mt.findChar(str, c);
//		System.out.print("반환 ");
//		System.out.println(result);
		
//      4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드

//      5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력

//      6. 연속된 중복 문자 제거하기
//      입력 예시1)
//      abbbbacda
//      출력 예시1)
//      aacda

//      입력 예시2)
//      aabbccccd
//      출력 예시2)
//      abcd

	}

//      1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
//		정수 전달인데 왜 실수를 전달함!!! 완전 실수했음ㅋ
	double[] twoIntegerArr(double num1, double num2) {
		double[] result = new double[2];
		result[0] = num1 / num2;
		result[1] = num1 % num2;

		return result;
	}
// 2. 사용자가 입력하는 값중 정수 분리하기
// 입력 예시)
// 안1녕2하3세4요
// 출력 예시)
// 1234
	String divideInteger(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				result += ch;
			}
		}
		return result;
	}
	
//  3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
//  입력 예시) apple
//  찾을 글자 p
//  반환 2
	int findChar(String str, String c) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c.charAt(0)) {
				count++;
			};
		}
		return count;
	}
//      4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드
	
	
	
	
	
	
	
	
	
}
