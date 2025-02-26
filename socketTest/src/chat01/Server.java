package chat01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		String inMessage = null;
		String outMessage = null;
		
		try {
			
			serverSocket = new ServerSocket(2222);
			System.out.println("클라이언트 연결중..");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트 접속");
			
			while (true) {
				
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				inMessage = in.readLine();
				System.out.println("클라이언트가 보낸 메세지 : " + inMessage);
				outMessage = sc.next();
				out.write(outMessage + "\n");
				System.out.println("서버 : " + outMessage);
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
