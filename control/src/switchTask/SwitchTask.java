package switchTask;

import java.util.Scanner;

public class SwitchTask {
   public static void main(String[] args) {
//      계절 맞추기
//      12 1 2 겨울
//      3 4 5 봄
//      6 7 8 여름
//      9 10 11 가을 
//      사용자가 입력한 값의 계절을 맞추는 코드 작성
//      사용자 입력: 9
//      출력 예시: 가을
	   Scanner sc = new Scanner(System.in);
	   System.out.println("달을 입력하세요.");
	   int month = sc.nextInt();
	   String season = "";
	   switch(month) {
	   case 12, 1, 2:
		   season = "겨울";
	   	   break;
	   case 3, 4, 5:
		   season = "봄";
   	   	   break;
	   case 6, 7, 8:
		   season = "여름";
   	   	   break;
	   case 9, 10, 11:
		   season = "가을";
   	   	   break;
   	   default:
   		   System.out.println("다시 입력하세요.");
   		   break;
	   }
	   System.out.println(season);
   }
}
