package network_term_project;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DataTransfer {
	private final static int BUFFER_SIZE = 1024;
	DataTransfer(){}
	
	public void Transfer(String data) throws IOException {
		int status = 0;
		try(Socket client = new Socket()){
			InetSocketAddress ipep = new InetSocketAddress("127.0.0.1", 9999);
			// 접속
			client.connect(ipep);
			
			// OutputStream과 InputStream을 받는다
			try(OutputStream send = client.getOutputStream();
					InputStream recv = client.getInputStream();){
				// 콘솔 출력
				System.out.println("Client connected IP address = " + 
				client.getRemoteSocketAddress().toString());
				
				ExecutorService receiver = Executors.newSingleThreadExecutor();
				receiver.execute(() -> {
					try {
						// 메시지 무한 대기
						while(true) {
							// 버퍼 생성
							byte[] b = new byte[BUFFER_SIZE];
							// 메시지를 받음
							recv.read(b,0,b.length);
							//콘솔 출력
							System.out.println(new String(b));
							
						}
					}catch (Throwable e) {
						e.printStackTrace();
					}
				});
				 //콘솔로 메시지 받기
				try(Scanner sc = new Scanner(System.in)){
					while (true) {
						// 메시지 받음
						String msg = sc.next() + "\r\n";
						String test = "test";
						// 바이트 return
						byte[] b = msg.getBytes();
						byte[] data1 = test.getBytes();
						// 서버로 메시지 전송
						send.write(b);
						// TODO 인자로 받은 데이터 이곳으로 전송
						// exit일 경우 접속 종료
						if("exit\r\n".equals(msg)) {
							break;
						}
					}
				}
			}
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
	public void sendData(String data) {
		
		
	}
}
