package 자바종합실습3번Client;
import java.io.*;
import java.net.Socket;

public class ImageClientTh extends Thread {
    Socket socket;
    public ImageClientTh(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream input = socket.getInputStream();
            String testName = "src/자바종합실습3번Client/bear.jpg";
            FileOutputStream fos = new FileOutputStream(testName);
            int len;
            byte[] buffer = new byte[100];
            while((len = input.read(buffer)) != -1) {
                System.out.println("이미지 읽는 중 : " + len);
                fos.write(buffer, 0, len);
            }
            System.out.println("이미지 전송 완료 !!!!!");
            fos.flush();
            fos.close();
        } catch(IOException e) {}

    }
}
