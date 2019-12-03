package test;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSite {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(1980);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		FileOutputStream fos = new FileOutputStream("test.txt");
		byte[] buffer = new byte[4096];
		int filesize = 100000000;
		int r =0;
		
		while((r = dis.read(buffer,0,Math.min(buffer.length,filesize)))>0) {
			fos.write(buffer, 0, r);
		}
		fos.close();
		dis.close();

	}

}
