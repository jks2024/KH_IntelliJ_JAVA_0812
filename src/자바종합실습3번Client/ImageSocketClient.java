package 자바종합실습3번Client;

import java.net.Socket;

public class ImageSocketClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8999);
            System.out.println("서버 접속 성공");
            Thread nameClientTh = new ImageClientTh(socket);
            nameClientTh.start();

        } catch (Exception e) {}
    }
}
