package whileTask;

import java.util.Scanner;

// 사용자에게 무한 입력 상태로 
// 입력 받은 모든 값의 합이 100 이상되면 프로그램이 종료된다.
// 그리고 입력 받은 모든 값은 순서대로 출력한다
// ex)
// 10
// 50
// 30
// -20
// 10
// 20

// 프로그램 종료
// 입력값: 10, 50, 30, -20, 10, 20
public class WhileTask02 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요.");
		int sum = 0;
		String result = "";
		String sumResult = "";
		Scanner sc = new Scanner(System.in);
		while (true) {
            int num = sc.nextInt();  // 정수로 바로 입력받기
            sum += num;

            // 입력값을 문자열에 추가
            result += num + ", ";

            if (sum >= 100) {
                System.out.println("sum= " + sum);
                System.out.println("입력값: " + result.substring(0, result.length() - 2));
                break;
            }
        }
	}
}