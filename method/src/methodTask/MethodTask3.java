package methodTask;

public class MethodTask3 {

	public static void main(String[] args) {
//	   반드시 배열을 사용해야 함
		MethodTask3 mt = new MethodTask3();
		String[] str = { "일", "공", "이", "사" };
		for(int i = 0; i < mt.hanguelToInt(str).length; i++) {
			System.out.print(mt.hanguelToInt(str)[i]);
		}
		System.out.println();
		int num = 1024;
		for(int i = 0; i < mt.intToHanguel(num).length; i++) {
			System.out.print(mt.intToHanguel(num)[i]);
		}
	}

//      1. 한글을 정수로 바꿔주는 메서드(일공이사 -> 1024)
	int[] hanguelToInt(String[] str) {
//		str[0] = "1024";
		String[] str1 = { "공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] numResult = new int[str.length];
		int indexNum = 0;
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str1.length; j++) {
				if(str[i].contains(str1[j])) {
					indexNum = j;
				}
			}
			numResult[i] = num[indexNum];
		}
				
		return numResult;
	};
	
	// 2. 정수를 한글로 바꿔주는 메서드(1024 -> 일공이사)
	String[] intToHanguel(int num) {
//		str[0] = "일공이사";
		String[] str1 = { "공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		int[] numList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		String[] strArr = new String[String.valueOf(num).length()];
		strArr = String.valueOf(num).split(""); 
		String[] resultArr = null; 
		int indexNum = 0;
		resultArr = new String[String.valueOf(num).length()];
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < numList.length; j++) {
				if(strArr[i].contains(String.valueOf(numList[j]))) {
					indexNum = j;
				}
			}
			resultArr[i] = str1[indexNum];
		}
		return resultArr;
	}
}





//
//package methodTask;
//
//import java.util.Scanner;
//
//public class MethodTask3 {
//   public static void main(String[] args) {
//
////      번외 로또 추첨하기
////      로또 번호 6개를 배열에 담아서 결과를 반환해주는 메서드
////      int[] lotto = new int[6];
////      for(int i = 0; i < 6; i++) {
////         lotto[i] = (int)Math.floor(Math.random() * 45);
////         System.out.print(lotto[i] + " ");
////      }
//      
////      단 반드시 배열을 사용해야 함
////      1. 한글을 정수로 바꿔주는 메서드(일공이사 -> 1024)
////      Scanner sc = new Scanner(System.in);
////      String message = "정수로 바꿀 글자를 입력하세요.\nex)일공이사",
////            hangles = "공일이삼사오육칠팔구", result = "";
////      String[] hangle = null;
////      
////      System.out.println(message);
////      hangle = sc.nextLine().split("");
////      
////      for(int i = 0; i < hangle.length; i++) {
////         result += hangles.indexOf(hangle[i]);
////      }
////      
////      System.out.println(result);
//      
////      2. 정수를 한글로 바꿔주는 메서드(1024 -> 일공이사)
//      Scanner sc = new Scanner(System.in);
//      String message = "한글로 바꿀 정수를 입력하세요.\nex)1024",
//            hangles = "공일이삼사오육칠팔구", result = "";
//      String[] hangle = null;
//      
//      System.out.println(message);
//      hangle = sc.nextLine().split("");
//      for(String s: hangle) {
//         result += hangles.charAt(Integer.parseInt(s));
//      }
//      
//      System.out.println(result);
//      
//      
//      
//      
//      
//   }
//}

















