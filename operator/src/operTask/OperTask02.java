package operTask;

import java.util.Scanner;

public class OperTask02 {
   public static void main(String[] args) {
//      삼항 연산자
//      각각 사용자에게 동물을 입력 받고,
//      해당 동물에 해당되는 메세지를 출력하세요.
//      운명의 동물 찾기
//      사용자가 입력한 값에 따라 다른 결과를 출력하시오.
//      1. 고양이
//      고양이를 좋아하는 당신은 대훈이의 러버입니다.
      
//      2. 소
//      소를 좋아하는 당신은 세종이의 단짝입니다.
      
//      3. 강아지
//      강아지를 좋아하는 당신은 민균이의 짝사랑입니다.
      
//      4. 고라니
//      고라니를 좋아하는 당신은 미쳤습니다.
	   String cat = "고양이", cow = "소", dog = "강아지", gorani = "고라니";
	   String selecCat = "고양이를 좋아하는 당신은 대훈이의 러버입니다.",
			   selecCow = "소를 좋아하는 당신은 세종이의 단짝입니다.",
			   selecDog = "강아지를 좋아하는 당신은 민균이의 짝사랑입니다.",
			   selecGorani = "고라니를 좋아하는 당신은 미쳤습니다.";
	   String userInput = "", result = "";
	   String message = "좋아하는 동물을 골라주세요.\n고양이 / 소 / 강아지 / 고라니";
	   String errorMsg = "다시 입력해주세요.";

	   System.out.println(message);
	   Scanner sc = new Scanner(System.in);
	   userInput = sc.nextLine();
	   
	   result = userInput.equals(cat) ? selecCat 
			   : userInput.equals(cow) ? selecCow 
					   : userInput.equals(dog) ? selecDog 
							   : userInput.equals(gorani) ? selecGorani 
									   : errorMsg;
	   System.out.println(result);
   }
}



