import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class client {
/* 
 * 	1).�����ͻ��� DatagramSocket ��+���Ͷ˿�
	2).׼������ �ֽ�����
	3).��� DatagramPacket+��������ַ���˿�
	4).����
	5).�ͷ���Դ
 */
	public static void  main(String [] arg) throws IOException{
		//�����ͻ��� DatagramSocket ��+���Ͷ˿�
		DatagramSocket client = new DatagramSocket(7778);
		//׼������ �ֽ�����
		byte [] data = "����һ������".getBytes();
		//��� DatagramPacket+��������ַ���˿�
		DatagramPacket dpc = new DatagramPacket(data,data.length,new InetSocketAddress("127.0.0.1",10006));
		//����
		client.send(dpc);
		//�ͷ���Դ
		client.close();
	}
}
