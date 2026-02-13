package methodTask;

import java.util.Scanner;

public class MethodTask2 {
//   배열 응용
//      1. 글자 하나를 전달하면 글자가 대문자인지, 소문자인지, 일반문자인지 알려주는 메서드
	void wordType(char word) {
		if (word >= 'a' && word <= 'z') {
			System.out.println("소문자입니다!");
		} else if (word >= 'A' && word <= 'Z') {
			System.out.println("대문자입니다!");
		} else {
			System.out.println("일반문자입니다!");
		}
	};

//      2. 두 정수를 더하면 사칙연산의 결과를 반환해주는 메서드(+, -, /, *)
	int[] integerCalc(int num1, int num2) {
		int[] result = new int[4];
		
		result[0] = num1 + num2;
		result[1] = num1 - num2;
		result[2] = num1 / num2;
		result[3] = num1 * num2;

		return result;
	};

//      3. 5개의 정수를 전달하면 가장 큰 값과 작은 값을 알려주는 메서드
	int[] isMinMax(int[] num) {
		int min = num[0], max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
			if (max < num[i]) {
				max = num[i];
			}
		}
		int[] result = { min, max };
		return result;
	}

	public static void main(String[] args) {
		MethodTask2 mt1 = new MethodTask2();

		mt1.wordType('c');
		mt1.wordType('C');
		mt1.wordType('?');

		MethodTask2 mt2 = new MethodTask2();

		for (int i = 0; i < mt2.integerCalc(3, 5).length; i++) {
			System.out.println(mt2.integerCalc(3, 5)[i]);
		}

		MethodTask2 mt3 = new MethodTask2();
		System.out.println("최소 최대를 구할 배열을 입력해주세요\nex)1 2 3 4 5");
		Scanner sc = new Scanner(System.in);
		int[] userInput = new int[5];
		for (int i = 0; i < 5; i++) {
			userInput[i] = sc.nextInt();
		}
		System.out.println("최솟값: " + mt3.isMinMax(userInput)[0]);
		System.out.println("최댓값: " + mt3.isMinMax(userInput)[1]);
	}
}
