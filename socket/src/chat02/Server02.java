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
//			서버 소켓을 생성하고 포트번호 7777번 방으로
			serverSocket = new ServerSocket(7777);
			System.out.println("연결 대기중..");
			
//			서버 소켓에 접속한 클라이언트를 소켓에 담는다.
			socket = serverSocket.accept();
			System.out.println("연결 되었습니다.");
			
//			socket.getInputStream : 클라이언트의 소켓에서 보내는 데이터를 보내는 통로를 얻는다.
//			new InputStreamReader : 읽어들인 데이터를 글자로 변환한다.
//			new BufferedReader : 변환된 글자들을 한번에 모아서 가져온다.
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
//				인 메세지에 클라이언트로 받은 글자를 메서드로 문자열로 반환하여 넣는다.
				String inMessage = in.readLine();
				System.out.println("클라이언트 > " + inMessage);
//				스캐너로 넣는 문자열을 아웃메세지에 넣는다.
				String outMessage = sc.nextLine();
				System.out.println("서버에서 클라이언트로 보내기 >> ");
//				아웃메세지와 줄넘김을 버퍼데이터에 입력
				out.write(outMessage + "\n");
//				버퍼를 지워주는 플러쉬
//				버퍼에 남아있는 데이터를 강제로 출력하게 해준다.
				out.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
//			오류잡고 끝으로 무조건 한번 켜진 작업은 꺼져야한다.
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
