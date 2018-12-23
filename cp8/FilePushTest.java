package cp8;

import java.io.*;
import java.net.Socket;

public class FilePushTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		
		String serverIP = "www.baidu.com";
        int port = 80;
        String data = "test";

        try {
                 socket = new Socket(serverIP,port);
                 os = socket.getOutputStream();
                 os.write(data.getBytes());
                 is = socket.getInputStream();
                 byte[] b = new byte[1024];
                 int n = is.read(b);

                 System.out.println("·þÎñÆ÷·´À¡£º" + new String(b,0,n));

        } catch (Exception e) {
                 e.printStackTrace(); 

        }finally{

                 try {
                          is.close();
                          os.close();
                          socket.close();

                 } catch (Exception e2) {}

        }

}

}