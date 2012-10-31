// copied from http://blog.goo.ne.jp/xmldtp/e/d0685e7bf50ddb61f946b1345434e350

package tcp;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPserver {
	public static void main(String[] args) 
	{
		try
		{
			ServerSocket serverSocket = new ServerSocket(5656);
			System.out.println("Wait at TCP 5656");
			while(true)
			{			
				Socket socket = serverSocket.accept();
				TCPserverThread tr1 = new TCPserverThread();
				tr1.setSocket(socket);
				tr1.start();
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}
