package inputTask;

// Ctrl + Shift + O -> 필요한 import를 일괄적으로 진행해주는 단축키
import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
		// Scanner를 사용하여, 두 정수를 입력 받고,
	      // 덧셈 결과를 출력하시오.
	      // 단 next()만 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요.\nex)10 20");
		String strNum1 = "", strNum2 = "",
				result = ""; 
		int num1 = 0, num2 = 0, sum = 0;
		
		strNum1 = sc.next();
		strNum2 = sc.next();
		
		num1 = Integer.parseInt(strNum1);
		num2 = Integer.parseInt(strNum2);
		
		sum = num1 + num2;
		result = "두 수의 합계: %d + %d = %d";
		System.out.printf(result, num1, num2, sum);
	}
}
