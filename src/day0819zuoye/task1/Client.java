package day0819zuoye.task1;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author tjk
 * @date 2019/8/19 15:50
 */
public class Client {
    public void send() {


        try {
              String IP;
            // 创建socket
            Socket socketClient = new Socket(InetAddress.getByName("127.0.0.1"), 2019);


            // 向服务器发送消息
            PrintWriter printWriter = new PrintWriter(socketClient.getOutputStream());

            printWriter.write("Hello Server");
            printWriter.flush();

            printWriter.close();
            socketClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.send();
    }

}
