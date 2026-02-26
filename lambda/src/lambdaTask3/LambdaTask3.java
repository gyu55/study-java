package lambdaTask3;

public class LambdaTask3 {
	public static void main(String[] args) {
//   1. 전달한 글자가 등장하는 거리 구하기
//   입력예시
//   "abcdababefda", "a"
//   출력예시
//   "3 -> 1 -> 4"
//   만약 중복된 글자가 없어 거리를 찾지 못하면
//   "-1"

		Task1 task1 = (String str1, String str2) -> {
			String result1 = "";
			int count = 0;
			int sum = 0;
			int temp = 0;
			for (int i = 0; i < str1.length(); i++) {
//				찾았을 때 그 인덱스를 저장(거리계산 위해)
				if (str1.indexOf(str2, count) > -1) {
					if (str1.indexOf(str2, count) != str1.indexOf(str2, count - 1)) {
						temp = str1.indexOf(str2, count);
						sum = (str1.indexOf(str2, count) - str1.indexOf(str2, count - 1) - 1);
						result1 += (" " + sum + " -> ");
					}
					count++;
				}
			}
			return result1.substring(0, result1.length() - 4);
		};
		System.out.println(task1.distance("abcdababefda", "a"));
//   2. 스파이가 남긴 암호를 해독하시오.
//   주어진 소문자(a~z) 범위라 가정한다.
//   주어진 암호를 원래 문자열을 복원하시오.
//		
//		우선 이게 3자리로 나눌지 2자리로 나눌지를 판단해야 함 
//		-> 어떻게? 
//		ㄴ 3자리로 끊었을 때, 알파벳 마지막 z가 넘어가면 2자리수로 판단
//		
		String str2 = "1051081111181011069711897";

		Task2 task2 = (String str) -> {
			int num = 0;
			String result = "";
			for (int i = 0; i < str.length();) {
				if (i + 3 <= str.length() && Integer.parseInt(str.substring(i, i + 3)) <= 'z') {
					num = Integer.parseInt(str.substring(i, i + 3));
					i += 3;
				} else {
					num = Integer.parseInt(str.substring(i, i + 2));
					i += 2;
				}
				result += (char) (num);
			}
			return result;
		};
		System.out.println(task2.task2(str2));
//	System.out.println(str.substring(0,3));
	}
}