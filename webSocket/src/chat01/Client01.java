package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client01 {
	public static void main(String[] args) {
//		ip 192.168.161.231
//		port 1100
		String serverIp = "192.168.5.254";
		int port = 1100;

		try (
				Socket socket = new Socket(serverIp, port);
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
		) {
			System.out.println("서버가 연결되었습니다.");
			
			String message = "안녕? 나는 클라이언트!";
			writer.println(message);

			System.out.println("서버로 [" + message + "]를 전송하였습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
