package arrayTask;

public class ArrayTask05 {
	public static void main(String[] args) {
//  마스터
//  1. 배열이 다음과 같이 있을 때
//  배열을 오름차순 정렬 후 출력하시오.
		// 선택정렬
		int[] arrData1 = { 4, 2, 9, 1, 5 };

		for (int i = 0; i < arrData1.length - 1; i++) {
			int min = i; // 배열의 맨 왼쪽 인덱스 값 저장

			for (int j = i + 1; j < arrData1.length; j++) {
				if (arrData1[j] < arrData1[min]) { // 만약 배열의 맨 왼쪽 인덱스 값보다 작을 경우
					min = j; // 맨왼쪽 인덱스 값을 j로 바꿔줌 -> 반복문이 끝나면 제일 작은 요소 인덱스값이 저장
				}
			}
			// 현재 i번째에 있는 값과 제일 작은 요소의 값을 교환
			int temp = arrData1[min];
			arrData1[min] = arrData1[i];
			arrData1[i] = temp;
		}
//  최종 배열 안의 값: {1, 2, 4, 5, 9}
//  출력 결과: 9 5 4 2 1
		// 거꾸로 출력
		for (int i = 0; i < arrData1.length; i++) {
			System.out.println(arrData1[arrData1.length - i - 1]);
		}

//  2. 4행 4열의 2차원 배열이 존재할 때
		int n = 4;
		int[][] arrData2 = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arrData2[i][j] = (i + j) % 2;
			}
		}

//	       출력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arrData2[i][j] + " ");
			}
			System.out.println();
		}
//  아래와 같이 배열의 값을 넣고, 출력하시오
//  출력 예시)
//  0 1 0 1
//  1 0 1 0
//  0 1 0 1
//  1 0 1 0

//  힌트)
//  2차원 배열은 행부터 접근이 가능하다
//  예를 들면 arrData[2][1]의 의미는 2행 1열의 데이터를 의미한다.
	}
}

//
//
//
//
//package arrayTask;
//
//public class ArrayTask06 {
//   public static void main(String[] args) {
////      마스터
////      1. 배열이 다음과 같이 있을 때
////      배열을 오름차순 정렬 후 출력하시오.
//      int[] arrData1 = {4, 2, 9, 1, 5};
//      
////      버블 정렬 알고리즘
////      최종 배열 안의 값: {1, 2, 4, 5, 9}
////      출력 결과: 9 5 4 2 1
////      for(int i = 0; i < arrData1.length; i++) {
////         for(int j = 0; j < arrData1.length - 1 - i; j++) {
////            if(arrData1[j] > arrData1[j + 1]) {
////               int temp = arrData1[j];
////               arrData1[j] = arrData1[j + 1];
////               arrData1[j + 1] = temp;
////            }
////         }
////      }
//      
////      빠른 for문
////      for(int num : arrData1) {
////         System.out.print(num + " ");
////      }
//      
////      2. 4행 4열의 2차원 배열이 존재할 때
//      int n = 4;
//      int[][] arrData2 = new int[n][n];
//      
////      아래와 같이 배열의 값을 넣고, 출력하시오
////      출력 예시)
////      0 1 0 1
////      1 0 1 0
////      0 1 0 1
////      1 0 1 0
//      
////      힌트)
////      2차원 배열은 행부터 접근이 가능하다
////      예를 들면 arrData[2][1]의 의미는 2행 1열의 데이터를 의미한다.
//      
//      for(int i = 0; i < n; i++) {
//         for(int j = 0; j < n; j++) {
//            arrData2[i][j] = (i + j) % 2;
//         }
//      }
//      
////      출력
//      for(int i = 0; i < n; i++) {
//         for(int j = 0; j < n; j++) {
//            System.out.print(arrData2[i][j] + " ");
//         }
//         System.out.println();
//      }
//      
//      
//   }
//}
