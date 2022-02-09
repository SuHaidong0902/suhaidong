package othres.echo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author 海东
 * @Date: 2022/1/17 11:37 下午
 * @Description:
 */
public class EchoClient {
    private final static BufferedReader KEYBOARD_INPUT = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost",7896); // 定义服务端连接信息
        // 现在客户端需要输入与输出的操作支持，所以依然要准备Scanner与PrintWriter
        Scanner scanner = new Scanner(client.getInputStream()); // 接收服务器端输入内容
        scanner.useDelimiter("\n");
        PrintWriter out = new PrintWriter(client.getOutputStream()); // 向服务器端发送内容
        boolean flag = true;
        while(flag){
            String input = getString("请输入内容：").trim();
            out.println(input);
            if (scanner.hasNext()){ // 服务器有回应了
                System.out.print(scanner.next());
            }
            if ("byebye".equalsIgnoreCase(input)){
                flag = false;
            }
        }
        scanner.close();
        out.close();
        client.close();
    }

    public static String getString(String prompt) throws Exception{
        System.out.print(prompt);
        String str = KEYBOARD_INPUT.readLine();
        return str;
    }

}
