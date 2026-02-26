package arrayListTask1;

import java.util.ArrayList;

public class ArrayListTask1 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			datas.add((i + 1) * 10);
		}
		System.out.println(datas);
		
//		실습
//		50 뒤에 500을 삽입
		if(datas.contains(50)) {
			datas.add(5, 500);
			System.out.println(datas);
		}
		
//		80 삭제
//		1. 인덱스로 삭제하기
		if(datas.contains(80)) {
//			Wrapper Class
			datas.remove(datas.indexOf(80));
			System.out.println(datas);
		}
//		60 삭제
//		2. 값으로 삭제하기
		try {
			if(datas.contains(60)) {
				datas.remove(Integer.valueOf(60));
			}
			System.out.println(datas);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 초과");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
