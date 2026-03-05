package jsonTest;

import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;

public class JsonTask {
	
	public static String addRoot(String url) {
		return "/app" + url;
	} 
	
	public static void main(String[] args) {
//		"/news", "/game", "/brand", "/rank"
//		위 4개 경로를 모두 ArrayList에 추가하고,
//		경로 앞에 "/app"을 붙인 뒤 출력
		ArrayList<String> urls = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		JSONArray urlsJSON = new JSONArray();
			
		
		
	}
}
