package network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7778);
			System.out.println(getTime() + " 서버가 준비되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				System.out.println(getTime() + "연결 요청을 기다립니다.");
				
				serverSocket.setSoTimeout(5*1000);
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + " 로부터 연결 요청이 들어왔습니다.");
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("[알림] 서버로부터의 테스트 메시지 입니다.");
				System.out.println(getTime() + " 데이터를 전송했습니다.");
				
				dos.close();
				socket.close();
			} catch (SocketTimeoutException e) {
				System.out.println("지정된 시간동안 접속 요청이 없어서 서버를 종료합니다.");
				System.exit(0);
			} catch (IOException e ) {
				e.printStackTrace();
			}
		}// end of while
	} // end of main
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
