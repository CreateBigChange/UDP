import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
public static void main(String []  args) throws IOException{
	//1���������
	DatagramSocket server = new DatagramSocket(10006);
	//2׼���������� �ֽ����� ��װDatagramPacket
	byte [] flush = new byte[1024];
	DatagramPacket dpc = new DatagramPacket(flush,flush.length);
	//�� ��������
	server.receive(dpc);
	//4).����
	int len = dpc.getLength();
	byte [] data = dpc.getData();
	System.out.println(new String(data,0,len,"gbk"));
	//5).�ͷ���Դ
	server.close();
}
}
