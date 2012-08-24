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
	 * 処理部分
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
			//受信する
			//--------------------
			InputStream	is1	
				=socket.getInputStream();
			InputStreamReader	ir1
				= new InputStreamReader(is1);
			BufferedReader		br1	= new BufferedReader(ir1);

			//	よみこめるまでまってる
			while(is1.available()	==	0);
		
			
			//	１行読み込む
			String msg =	br1.readLine();
			System.out.println(msg);
			
			//	クローズ
			br1.close();
			ir1.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}