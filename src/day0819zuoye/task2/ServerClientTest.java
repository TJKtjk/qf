package day0819zuoye.task2;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *  * 从客户端发送文件给服务器端，服务器端保存到本地，并返回“发送成功”给客户端。
 *  
 */
public class ServerClientTest {
    /*
     * 客户端
     */
    @Test
    public void clientTest() {
        Socket socket = null;
        OutputStream outputStream = null;
        FileInputStream fis = null;
        InputStream inputStream = null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 2019);
            outputStream = socket.getOutputStream();
            fis = new FileInputStream(new File("./intput/1.txt"));
            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read(b)) != -1) {
                outputStream.write(b, 0, len);
            }
            socket.shutdownOutput();
            inputStream = socket.getInputStream();
            while ((len = inputStream.read(b)) != -1) {
                String str = new String(b, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }
    }

    //服务器端
    @Test
    public void serverTest() {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        OutputStream os = null;
        try {
            ss = new ServerSocket(2019);
            socket = ss.accept();
            is = socket.getInputStream();
            fos = new FileOutputStream(new File("./intput/11.txt"));
            byte[] b = new byte[1024];
            int len;
            while ((len = is.read(b)) != -1) {
                fos.write(b, 0, len);
            }
            os = socket.getOutputStream();
            os.write("发送成功：".getBytes());
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
