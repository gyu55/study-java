package castingTask;

public class CastingTask03 {
   public static void main(String[] args) {
//      'a', 'j', 'k'를 연산하여 'A', 'J', 'K' 출력하기
	   char upperA = 'a' - 32;
	   char upperJ = 'j' - 32;
	   char upperK = 'k' - 32;
	   String resultFormat = "%c %c %c";
	   
	   System.out.printf(resultFormat, upperA, upperJ, upperK);
   }
}
