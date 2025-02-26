package chat01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		String inMessage = null;
		String outMessage = null;
		
		try {
			
			socket = new Socket("localhost", 2222);
			System.out.println("서버에 연결되었습니다");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				
				outMessage = sc.nextLine();
				out.write(outMessage + "\n");
				out.flush();
				
				inMessage = in.readLine();
				System.out.println("서버가 보낸 메세지 : " + inMessage);
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
