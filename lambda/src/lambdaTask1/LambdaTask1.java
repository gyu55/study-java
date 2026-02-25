package lambdaTask1;

public class LambdaTask1 {
   public static void main(String[] args) {
//      1~10까지 출력해주는 메서드
	   NumberPrint numPrint = () -> {
		   for(int i = 0; i < 10; i++) {
			   System.out.print(i+1 + " ");
		   }
	   };
	   
	   numPrint.print();
//      문자열, 문자형, 인덱스를 전달하면 해당 인덱스에 값을 전달한 문자형으로 바꿔주는 메서드
	   ChangeChar change = (String[] strArr, char c, int index) -> {
		   String result = "";
		   strArr[index] = String.valueOf(c);
		   for(int i = 0; i < strArr.length; i++) {
			   result += strArr[i];
		   }
		   return result;
	   };
	   String[] strArray = {"a", "b", "c"};
	   System.out.println(change.changeChar(strArray, 'g', 1));
   }
}
