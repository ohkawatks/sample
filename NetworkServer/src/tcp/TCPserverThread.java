package tcp;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPserverThread extends Thread {
	Socket socket = null;

 	
  	public void setSocket(Socket socket)
  	{
  		this.socket	=	socket;
  	}
  	
	/*
	 * ��������
	 */
	public void run()
	{
		if ( socket	==	null )
		{
			return;
		}

		try
		{
			//--------------------
			//��M����
			//--------------------
			InputStream	is1	
				=socket.getInputStream();
			InputStreamReader	ir1
				= new InputStreamReader(is1);
			BufferedReader		br1	= new BufferedReader(ir1);

			//	��݂��߂�܂ł܂��Ă�
			while(is1.available()	==	0);
		
			
			//	�P�s�ǂݍ���
			String msg =	br1.readLine();
			System.out.println(msg);
			
			//	�N���[�Y
			br1.close();
			ir1.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}