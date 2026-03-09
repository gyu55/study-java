package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientPrac {
	public static void main(String[] args) {
		String serverIp = "192.168.161.231";
		int port = 1100;
		String serverMessage = null, clientMessage = null;
		
		try(
			Socket socket = new Socket(serverIp, port);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			Scanner sc = new Scanner(System.in);
		){
			System.out.println("서버에 연결됨");
			
			while(true) {
				System.out.println("서버에 보낼 내용 > ");
				clientMessage = sc.nextLine();
				bufferedWriter.write(clientMessage + "\n");
				bufferedWriter.flush();
				System.out.println("[클라이언트]: " + clientMessage);
				
				serverMessage = bufferedReader.readLine();
				System.out.println("[서버]: " + serverMessage);
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
