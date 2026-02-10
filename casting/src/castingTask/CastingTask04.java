package castingTask;

// 심화
public class CastingTask04 {
   public static void main(String[] args) {
//       (심화)      
//       "0.12346", "0.5130", "78", "9.133";
//      4개 값을 더해서 123456789를 출력하기
	   
	   // 초기값(초기화)
	   double num1 = 0.0, num2 = 0.0, num3 = 0.0, num4 = 0.0;
	   int calcNum1_1234 = 0, calcNum1_6 = 0, calcNum2_5 = 0, calcNum3_78 = 0, calcNum4_9 = 0;
	   String resultFormat = "";
	   
	   num1 = Double.parseDouble("0.12346");
	   num2 = Double.parseDouble("0.5130");
	   num3 = Double.parseDouble("78");
	   num4 = Double.parseDouble("9.133");
	   
	   calcNum1_1234 = (int)(num1 * 10000);
	   calcNum1_6 = (int)(num1 * 100000 % 10);
	   calcNum2_5 = (int)(num2 * 10);
	   calcNum3_78 = (int)num3;
	   calcNum4_9 = (int)num4;
	   
	   resultFormat = "%d%d%d%d%d";
	   System.out.printf(resultFormat, calcNum1_1234, calcNum2_5, calcNum1_6, calcNum3_78, calcNum4_9);
	   
   }
}