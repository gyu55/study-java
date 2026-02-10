package operTask;

import java.util.Scanner;

public class OperTask {
   public static void main(String[] args) {
      // 사용자에게 수학점수, 영어점수, 국어점수를 입력 받고,
      // 총점과 평균을 구한다.
      // 성적이 60점 초과면 합격, 60점 미만이면 불합격, 60점이면 재평가를 출력
      // 단 if문을 사용하지 않는다.
      // 평균은 소수점 2번째 자리까지만 표기한다.
	   
	   Scanner sc = new Scanner(System.in);
	   int mathScore = 0, engScore = 0, korScore = 0, totalScore = 0, cutLine = 60;
	   double avg = 0.0;
	   
	   String resultFormat = "", isPass = "";
	   String pass = "합격", nonPass = "불합격", reTest = "재평가";
	   String massage = "성적을 입력하세요: ";
	   
	   
	   System.out.println(massage);
	   mathScore = sc.nextInt();
	   engScore = sc.nextInt();
	   korScore = sc.nextInt();
	   
	   totalScore = mathScore + engScore + korScore;
	   avg = totalScore / 3.0;
	   isPass = avg > cutLine ? pass : avg < cutLine ? nonPass : reTest;
	   
	   resultFormat = "수학: %d점 / 영어: %d점 / 국어: %d점\n총점: %d점\n평균: %.2f점\n합격여부: %s";
	   System.out.printf(resultFormat, mathScore, engScore, korScore, totalScore, avg, isPass);
      
   }
}