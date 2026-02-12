package arrayTask;

import java.util.Scanner;

public class ArrayTask02 {
	public static void main(String[] args) {

//      골드
//      1. 사용자가 몇 개를 입력할 지 모를 때,
//      입력한 모든 값을 배열에 담은 후 최댓값과 최솟값을 출력
//		System.out.println("정수를 입력해주세요.\n입력을 마치고 싶다면 '/'를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		int[] arr = null;
//		int num = 0;
//		while (true) {
//		    String input = sc.next();
//		    if (input.equals("/")) {
//		        break;
//		    }
//		    int[] temp = new int[num + 1];
//		    for (int i = 0; i < num; i++) {
//		        temp[i] = arr[i];
//		    }
//		    temp[num] = Integer.parseInt(input);
//		    arr = temp;
//		    num++;
//		}
//		System.out.print("입력한 배열: ");
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//      2. 사용자가 몇 개를 입력할 지 모를 때,
//      입력한 모든 값을 배열에 담고, 실수와 정수의 개수를 출력
//      입력예시) "10", "10.7", "2", "3.6"
//      출력예시) 실수 2개, 정수 2개
		System.out.println("정수또는 실수를 입력하세요.\n입력을 마치고 싶다면 '/'를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String[] arr = null;
		
		int num = 0, intCount = 0, floatCount = 0;
		while(true) {
			String input = sc.next();
			if(!(input.equals("/"))) {
				if(input.contains(".")) {
					floatCount++;
				}else {
					intCount++;
				}
			}else {
				break;
			}
			String[] temp = new String[num + 1];
		    for (int i = 0; i < num; i++) {
		        temp[i] = arr[i];
		    }
		    temp[num] = input;
		    arr = temp;
		    num++;
		}
		System.out.print("입력한 배열: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.printf("\n정수 개수: %d개\n실수 개수: %d개", intCount, floatCount);
	}
}
