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
			// ����
			client.connect(ipep);
			
			// OutputStream�� InputStream�� �޴´�
			try(OutputStream send = client.getOutputStream();
					InputStream recv = client.getInputStream();){
				// �ܼ� ���
				System.out.println("Client connected IP address = " + 
				client.getRemoteSocketAddress().toString());
				
				ExecutorService receiver = Executors.newSingleThreadExecutor();
				receiver.execute(() -> {
					try {
						// �޽��� ���� ���
						while(true) {
							// ���� ����
							byte[] b = new byte[BUFFER_SIZE];
							// �޽����� ����
							recv.read(b,0,b.length);
							//�ܼ� ���
							System.out.println(new String(b));
							
						}
					}catch (Throwable e) {
						e.printStackTrace();
					}
				});
				 //�ַܼ� �޽��� �ޱ�
				try(Scanner sc = new Scanner(System.in)){
					while (true) {
						// �޽��� ����
						String msg = sc.next() + "\r\n";
						String test = "test";
						// ����Ʈ return
						byte[] b = msg.getBytes();
						byte[] data1 = test.getBytes();
						// ������ �޽��� ����
						send.write(b);
						// TODO ���ڷ� ���� ������ �̰����� ����
						// exit�� ��� ���� ����
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
