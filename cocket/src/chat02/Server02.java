package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Server02 {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
				
		try {
//			서버 소켓 생성
			serverSocket = new ServerSocket(7777);
			System.out.println("연결 대기중..");
			
			socket = serverSocket.accept();
			System.out.println("연결 되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inMessage = in.readLine();
				System.out.println("클라이언트 > " + inMessage);
				
				String outMessage = sc.nextLine();
				System.out.println("서버에서 클라이언트로 보내기 >> ");
				out.write(outMessage + "\n");
//				버퍼를 지워주는 플러쉬
				out.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
			if (out != null) {
				out.close();
			}
			if (in != null) {
				in.close();
			}
			if (socket != null) {
				socket.close();
			}
			if (serverSocket != null) {
				socket.close();
			}
		}
		
	
	}
}
