package cx;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Date;
import java.util.UUID;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss =new ServerSocket();
		Date data = new Date();
		System.out.println(data);
		
		System.out.println(UUID.randomUUID().toString());
		int length = UUID.randomUUID().toString().length();
		System.out.println(length);
		
	}
}
