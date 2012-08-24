package tcp;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPserver {

	/*
	 * 	メイン処理（呼び出し元）
	 */
	public static void main(String[] args) 
	{
		try
		{
			//　サーバーを生成
			ServerSocket serverSocket = new ServerSocket(5656);
			System.out.println("Wait at TCP 5656");
			while(true)
			{			
				// ソケットを生成
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
