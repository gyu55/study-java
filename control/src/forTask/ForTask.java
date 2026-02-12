//package forTask;
//
//import java.util.Scanner;
//
//public class ForTask {
//   public static void main(String[] args) {
////      1. 1~10까지 반복 후 5~8을 제외하고 출력
//      for(int i = 0; i < 6; i++) {
//         int value = i + 1;
//         System.out.println(value > 4 ? value + 4 : value);
//      }
//      
////      2. 1~100까지 출력
//      for(int i = 0; i < 100; i++) {
//         System.out.println(i + 1);
//      }
//      
////      3. 100~1까지 출력
//      for(int i = 0; i < 100; i++) {
//         System.out.println(100 - i);
//      }
//      
////      4. 1~10까지 누적합을 출력
//      String result = "누적합 결과: %d";
//      int total = 0;
//      for(int i = 0; i < 10; i++) {
//         total += i + 1;
//      }
//      System.out.printf(result, total);
//      
//      
////      5. 1~n까지 누적합 출력
//      Scanner sc = new Scanner(System.in);
//      int count = 0, total = 0;
//      String message = "누적합할 정수를 입력하세요.\nex)12", result = "까지 총합: %d";
//      
//      System.out.println(message);
//      count = sc.nextInt();
//
//      for(int i = 0; i < count; i++) {
//         total += i + 1;
//      }
//      
//      System.out.printf(count + result, total);
//      
//      
////      6. A~F까지 출력
//      for(int i = 0; i < 6; i++) {
//         System.out.print((char)('A' + i));
//      }
//      
////      7. A~F까지 중 C를 제외하고 출력
//      for(int i = 0; i < 5; i++) {
//         System.out.print((char)('A' + (i > 1 ? i + 1 : i)));
//      }
//      
////      8. aBcDeFg...Z 출력
//      for(int i = 0; i < 26; i++) {
//         System.out.print((char)((i % 2 == 0 ? 97 : 65) + i));
//      }
//      
////      9. 별찍기 
////        *
////       ***
////      *****
//      for(int i = 0; i < 10; i+=2) {
//         if(i == 0) { continue; }
//         for(int j = 10; j > i; j-=2) {
//            System.out.print(" ");
//         }
//         for(int k = 1; k < i; k++) {
//            System.out.print("*");
//         }
//         System.out.println();
//      }
////      
////      10. 해당 문자와 반복할 횟수를 입력하면 문자를 만들어주는 프로그램 
////      단 반복할 횟수는 1~9까지만 입력할 수 있다.
////      입력 예시) a1b3c2
////      출력 예시) abbbcc
//      Scanner sc = new Scanner(System.in);
//      String message = "문자와 반복할 횟수를 붙여서 입력하세요.\nex)a1b2c5",
//            input = null, result = "";
//      
//      System.out.println(message);
//      input = sc.next();
//      
//      for(int i = 0; i < input.length(); i++) {
//         if(i % 2 == 0) {
//            char c = input.charAt(i);
//            int count = input.charAt(i + 1) - 48;
//            for(int j = 0; j < count; j++) {
//               result += c;
//            }
//         }
//      }
//      
//      System.out.println(result);
//      
//      
////      11. 사용자가 입력한 횟수가 얼마인지 모르고,
////      입력한 횟수 만큼 문자를 만들어주는 프로그램
////      입력 예시) a1b22c357
////      출력 예시) abbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc...
//      Scanner sc = new Scanner(System.in);
//      String message = "문자 + 숫자 형식의 문자열을 입력하세요.\nex)a1b22c347",
//            input = null, result = "";
//      
//      System.out.println(message);
//      input = sc.next();
//      
//      for(int i = 0; i < input.length(); i++) {
//         char c = input.charAt(i); // 문자
//         
//         String numberStr = "";
//         i++;
////         다음 문자부터 숫자 읽기 시작
//         while(i < input.length() && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
//            numberStr += input.charAt(i);
//            i++;
//         }
//         
//         int count = Integer.parseInt(numberStr);
//         
//         for(int j = 0; j < count; j++) {
//            result += c;
//         }
//         i--;
//      }
//      
//      System.out.println(result);
//   }
//}















