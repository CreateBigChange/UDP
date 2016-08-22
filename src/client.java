import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class client {
/* 
 * 	1).创建客户端 DatagramSocket 类+发送端口
	2).准备数据 字节数组
	3).打包 DatagramPacket+服务器地址及端口
	4).发送
	5).释放资源
 */
	public static void  main(String [] arg) throws IOException{
		//创建客户端 DatagramSocket 类+发送端口
		DatagramSocket client = new DatagramSocket(7778);
		//准备数据 字节数组
		byte [] data = "这是一个测试".getBytes();
		//打包 DatagramPacket+服务器地址及端口
		DatagramPacket dpc = new DatagramPacket(data,data.length,new InetSocketAddress("127.0.0.1",10006));
		//发送
		client.send(dpc);
		//释放资源
		client.close();
	}
}
