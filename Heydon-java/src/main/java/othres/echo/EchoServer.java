package othres.echo;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author 海东
 * @Date: 2022/1/17 11:24 下午
 * @Description:
 */
public class EchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(7896); // 设置服务器端监听端口
        System.out.println("等待客户端链接.......");
        Socket client = server.accept(); // 游客户端链接
        // 1. 首先接收客户端发来的信息，而后信息处理之后发送回客户端
        Scanner scanner = new Scanner(client.getInputStream()); // 客户端输入流
        scanner.useDelimiter("\n"); // 设置分隔符
        PrintStream out = new PrintStream(client.getOutputStream()); // 客户端输出流
        boolean flag = true;
        while (flag) {
            if (scanner.hasNext()) { // 现在有数据发送
                String val = scanner.next().trim(); // 接收发送的数据
                if ("byebye".equalsIgnoreCase(val)) {
                    out.println("byebye,this is no chance...");
                    flag = false;
                } else {
                    out.println("[ECHO]: " + val);
                }
            }
        }
        scanner.close();
        out.close();
        client.close();
        server.close();

    }
}
