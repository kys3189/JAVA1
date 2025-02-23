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
			serverSocket = new ServerSocket(1111);
			System.out.println("클라이언트 기달리는 중..");
			socket = serverSocket.accept();
			System.out.println("클라이언트 접속");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				
				inMessage = in.readLine();
				System.out.println("클라이언트가 보낸 메세지 : " + inMessage);
				
				outMessage = sc.nextLine();
				out.write(outMessage + "\n");
				
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (serverSocket != null) {
				serverSocket.close();
			}
			if (socket != null) {
				socket.close();
			}
			if (sc != null) {
				sc.close();
			}
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
		
		
	}
}
