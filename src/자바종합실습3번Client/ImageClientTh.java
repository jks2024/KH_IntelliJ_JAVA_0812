package 자바종합실습3번Client;
import java.io.*;
import java.net.Socket;

public class ImageClientTh extends Thread {
    Socket socket;
    String path;
    public ImageClientTh(Socket socket, String path) {
        this.socket = socket;
        this.path = path;
    }

    @Override
    public void run() {
        try {
            InputStream input = socket.getInputStream();
            FileOutputStream fos = new FileOutputStream(path);
            int len;
            byte[] buffer = new byte[1024];
            while((len = input.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("이미지 전송 완료 !!!!!");
            fos.flush();
            fos.close();
        } catch(IOException e) {
            System.out.println(e);
        }

    }
}
