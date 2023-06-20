package network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer4 implements Runnable {
	ServerSocket serverSocket;
	Thread[] threadArr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TcpIpServer4 server = new TcpIpServer4(5);
		server.start();
	}
		public TcpIpServer4(int num) {
			try {
				serverSocket = new ServerSocket(7778);
				System.out.println(getTime() + " 서버가 준비되었습니다.");
				
				threadArr = new Thread[num];
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
		
		public void start() {
			for(int i = 0; i < threadArr.length; i++) {
				threadArr[i] = new Thread(this);
				threadArr[i].start();
			}
		}
		
	public void run() {		
		while(true) {
			try {
				System.out.println(getTime() + "연결 요청울 기다립니다.");
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + " 로부터 연결 요청이 들어왔습니다.");
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("[알림] 서버로부터의 테스트 메시지 입니다.");
				System.out.println(getTime() + " 데이터를 전송했습니다.");
				
				dos.close();
				socket.close();
			} catch (IOException e ) {
				e.printStackTrace();
			}
		}// end of while
	} // end of run
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
