package fileTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//	상대경로
//	./ -> 현재폴더
// 	../ -> 상위폴더
//	/ -> 현재 작업하고 있는 폴더에서의 최상위 폴더

public class FileTest {
	public static void main(String[] args) throws IOException{
//		파일 쓰기
//		BufferedWriter bufferedWriter = null;
////		new FileWriter(경로(+파일), 이어쓰기 여부)
//		try {
////			작성할 땐 BufferWriter
//			bufferedWriter = new BufferedWriter(new FileWriter("./test.txt", true));
//			bufferedWriter.write("오늘 점심 메뉴리스트");
//			bufferedWriter.write("");
//			bufferedWriter.write("밥");
//			bufferedWriter.write("치킨");
//			bufferedWriter.write("피자");
//			bufferedWriter.flush();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bufferedWriter.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
//		파일 읽기
//		new FileReader(경로)
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader("./test.txt"));
			String line = null;
			
//		텍스트 글자 읽어오기 (제일 많이 사용하는 방법)
//		while((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
			
			bufferedReader.lines().forEach(System.out::println);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} finally {
			try {
				if(bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
