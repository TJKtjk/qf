package day0819zuoye.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author tjk
 * @date 2019/8/19 15:50
 */
public class Server {
    public void receive() {

        try {
            ServerSocket ss = new ServerSocket(2019);


            Socket socket = ss.accept();

            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String s = bufferedReader.readLine();


            System.out.println(s.toUpperCase());

            inputStreamReader.close();

            // 关闭
            ss.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();

        server.receive();
    }

}
