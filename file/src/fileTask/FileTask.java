package fileTask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException{
//		String[] foods = {"잔치국수", "피자", "한우", "스테이크"};
////		음식 4가지를 메모장으로 만들고 콘솔에 출력
//		BufferedWriter bufferWriter = null;
//		
//		try {
//			bufferWriter = new BufferedWriter(new FileWriter("./foodList.txt", true));
//			for(String food : foods) {
//				bufferWriter.write(food + "\n");
//			}
//			bufferWriter.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bufferWriter.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		BufferedReader bufferReader = null;

		try {
			bufferReader = new BufferedReader(new FileReader("./foodList.txt"));
			String line = null;

			while ((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} finally {
			try {
				if(bufferReader != null) {
					bufferReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}



//package fileTask;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Arrays;
//
//public class FileTask {
//   public static void main(String[] args) throws IOException {
//      String[] foods = {"잔치국수", "피자", "한우", "스테이크"};
////      음식 4가지를 메모장으로 만들고 콘솔에 출력
//      
////      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./food.txt", true));
////      
////      Arrays.asList(foods).stream().forEach(food -> {
//////         bufferedWriter.newLine() 비추 
////         try {
////            bufferedWriter.write(food + "\n");
////         } catch (IOException e) {
////            e.printStackTrace();
////         }
////      });
//      
////      bufferedWriter.close();
////      System.out.println("food.txt 생성 완료.");
//      
//      BufferedReader bufferedReader = new BufferedReader(new FileReader("food.txt"));
//      bufferedReader.lines().forEach(System.out::println);
//      
//      
//   }
//}











