package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {
	public static void main(String[] args) {
/*
 *	1. main에서 client, server Message 받을(보낼) 준비
 *	2. ServerSocket port 열어주기 
 *	3. 클라이언트 접속 기다리기 -> 연결되면 socket 객체 생성
 *	4. Client Message InputStream
 *		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
 *	5. Client Message OutputStream
 *		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
 *	6. 보낼 메세지 키보드 입력받기 (Scanner)
 *	7. while문으로 메시지 계속 보낼 수 있도록 
 *	8. 
 */
//		1. main에서 client, server Message 받을(보낼) 준비
		String clientMessage = null, serverMessage = null;
		System.out.println("서버가 시작되었습니다. 클라이언트를 기다리는 중...");
		try(
//		2. ServerSocket port (1100번 포트) 열어주기 
			ServerSocket serverSocket = new ServerSocket(1100);
			Socket socket = serverSocket.accept();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			Scanner sc = new Scanner(System.in);
		){
			
			System.out.println("클라이언트가 연결되었습니다.");
			
			while(true) {
				
				System.out.println("클라이언트로 메세지 보내기 >> ");
				serverMessage = sc.nextLine();
//				nextLine()이 줄바꿈을 기준으로 읽어오기 때문에 serverMessage 받고 + "\n" 처리
				bufferedWriter.write(serverMessage + "\n");
//				flush() 버퍼에 있는 데이터를 즉시 전송 
				bufferedWriter.flush();
				System.out.println("[서버]: " + serverMessage);

//				Client 메시지를 받아옴
				clientMessage = bufferedReader.readLine();
				System.out.println("[클라이언트]: " + clientMessage);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
