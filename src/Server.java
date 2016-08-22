import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
public static void main(String []  args) throws IOException{
	//1创建服务端
	DatagramSocket server = new DatagramSocket(10006);
	//2准备接受容器 字节数组 封装DatagramPacket
	byte [] flush = new byte[1024];
	DatagramPacket dpc = new DatagramPacket(flush,flush.length);
	//包 接受数据
	server.receive(dpc);
	//4).分析
	int len = dpc.getLength();
	byte [] data = dpc.getData();
	System.out.println(new String(data,0,len,"gbk"));
	//5).释放资源
	server.close();
}
}
