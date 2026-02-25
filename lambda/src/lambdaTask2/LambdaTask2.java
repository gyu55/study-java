package lambdaTask2;

public class LambdaTask2 {
	public static void main(String[] args) {
//      1) 문자열과 정수형을 전달하면 정수형마다 글자를 건너뛰고 반환(리턴)하는 메서드
//      입력 예시)
//      "abcdabcd", 4
		Task1 task1 = (String str1, int num1) -> {
			char[] char1 = str1.toCharArray();
			String result1 = "";
			int count = 0;
			for(int i = 0; i < char1.length; i++) {
				if(count != num1 - 1) {
					result1 += char1[i];
					count++;
				}else {
					count = 0;
					continue;
				}
			}
			return result1;
		};
		
		System.out.println(task1.task1("abcdabcd", 4));
//      출력 예시
//      "abcabc"

//      2) 문자열과 문자형을 전달하면 찾은 문자열의 인덱스에 해당하는 글자를 반환(리턴) 메서드
//      없을 시 -1
//      "abcdabcd", 'a'
//      출력 결과
//      "c"
		Task2 task2 = (String str2, char c2) -> {
			String[] strArr2 = str2.split("");
			String result = "";
			int count2 = 0;
			for(int i = 0; i < str2.length(); i++) {
				if(strArr2[i].equals(String.valueOf(c2))) {
					count2++;
				}
			}
			if(count2 == 0) {
				return "-1";
			}
			
			return result;
		};
		
		System.out.println(task2.task2("abcdabcd", 'h'));
//      3) 문자열에서 중복된 값을 모두 없애고 반환(리턴)하는 메서드
//      입력 예시
//      "가나다라마바사가나다라가나다"
//      출력 예시
//      "가나다라마바사"
//		.contains(""); boolean
		Task3 task3 = (String str3) -> {
			String result3 = "";
			for(int i = 0; i < str3.length(); i++) {
				char c = str3.charAt(i);

	            if (result3.indexOf(c) == -1) {
	            	result3 += c;
	            }
			}

			return result3;
		};
		
		System.out.println(task3.task3("가나다라마바사가나다라가나다"));

//      4) 문자열을 전달하면 문자열을 뒤집어서 리턴(반환)해주는 메서드
//      입력 예시
//      "123456789"

//      출력 예시
//      "987654321"
		Task4 task4 = (String str4) -> {
			String result4 = "";
			for(int i = 0; i < str4.length(); i++) {
				result4 += str4.charAt(str4.length()-i-1);
			}
			return result4;
		};
		
		System.out.println(task4.task4("123456789"));
	}
}
