package programmers;

public class Solution {
	public static void main(String[] args) {
//		System.out.println(solution("안하요", "녕세오"));
		System.out.println(solution(">", "=", 2, 3));
	}
	public static String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0; i < str1.length(); i++){
            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
        }
        return answer;
    }
	public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if (ineq.equals("<")) {
            answer = eq.equals("=") ? (n <= m ? 1 : 0) : (n < m ? 1 : 0);
        } else {
            answer = eq.equals("=") ? (n >= m ? 1 : 0) : (n > m ? 1 : 0);
        }
        
        return answer;
    }
}
