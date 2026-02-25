package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
		// 람다식 -> 중괄호 생략 시, 전체가 리턴값 or 중괄호 사용 시, return 키워드 써주기
		Calc calc = (int num1, int num2) -> {return num1 + num2;};
		Calc2 calc2 =  (num1, num2) -> num1 / (double)num2;
		
		System.out.println(calc2.divide(10, 3));
		
	}
}
