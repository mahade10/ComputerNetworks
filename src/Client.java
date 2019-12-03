import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost",6666);
		DataOutputStream ds =new DataOutputStream(s.getOutputStream());
		ds.writeUTF("Hello server");
		ds.flush();
		ds.close();
		s.close();
	}

}
