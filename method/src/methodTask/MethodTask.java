package methodTask;

public class MethodTask {
//		1. 1~10까지 출력하는 메서드
	void printNum(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + " ");
		}
	};
//		2. 1~n까지의 합을 반환해주는 메서드
	int sumNum(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += i+1;
		}
		return sum;
	};
	
	
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		
		System.out.println("printNum method test");
		mt.printNum(10);
		
		System.out.println("\nsumNum method test");
		int result = mt.sumNum(10);
		System.out.println("합계: " + result);
		
	}
}
