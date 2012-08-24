package tcp;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPserver {

	/*
	 * 	���C�������i�Ăяo�����j
	 */
	public static void main(String[] args) 
	{
		try
		{
			//�@�T�[�o�[�𐶐�
			ServerSocket serverSocket = new ServerSocket(5656);
			System.out.println("Wait at TCP 5656");
			while(true)
			{			
				// �\�P�b�g�𐶐�
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
