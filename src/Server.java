import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(6666);
		Socket s = ss.accept();
		DataInputStream di = new DataInputStream(s.getInputStream());
		String str = di.readUTF();
		System.out.println("client says "+str);
		ss.close();

	}

}
