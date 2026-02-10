package inputTask;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
//      사용자가 입력한 정수 또는 실수의 값이
//      정수인지 실수인지 확인 후 출력하는 로직을 구현하세요.
//      출력 예시)
//      10 -> 정수
//      10.5 -> 실수
//      10.0 -> 실수
		Scanner sc = new Scanner(System.in);
		String inputNum = "", 
				numInt = "",
				numDouble = "",
				resultInt = "입력하신 수 %s는 '정수'입니다.", 
				resultDouble = "입력하신 수 %s는 '실수'입니다.";
		System.out.println("정수 또는 실수를 입력해주세요!");
		inputNum = sc.next();
//		if (inputNum.indexOf(".") > 0) // 문자열에 "."이 포함되니 실수 없다면 값이 -1이므로 정수
		if (inputNum.contains(".")) {
			numDouble = inputNum;
			System.out.printf(resultDouble, numDouble);
		}else {
			numInt = inputNum;
			System.out.printf(resultInt, numInt);
		}
		
	}
}
