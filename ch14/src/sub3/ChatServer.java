package sub3;
/*
 * 날짜 : 2022/09/21
 * 이름 : 김시아
 * 내용 : 채팅 프로그램 실습하기
 */

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) {
		System.out.println("[Server]");
		ServerSocket serversocket = null;
		Socket socket = null;
		
		try {
			
			serversocket = new ServerSocket(9001);
			System.out.println("연결 대기...");
			
			socket = serversocket.accept();
			System.out.println("연결 수립...");
			
			
			Thread t1 = new SenderThread(socket);
			Thread t2 = new ReceiverThread(socket);
			
			t1.start();
			t2.start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
