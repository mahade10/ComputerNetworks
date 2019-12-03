package test;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSite {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost",1980);
		DataOutputStream ds = new DataOutputStream(s.getOutputStream());
		FileInputStream fs = new FileInputStream("F:\\JAVA\\FilePass\\src\\test\\f.txt");
		byte[] buffer = new byte[4096];
		while(fs.read(buffer)>0) {
			ds.write(buffer);
		}
		ds.close();
		fs.close();
		s.close();
	}

}
