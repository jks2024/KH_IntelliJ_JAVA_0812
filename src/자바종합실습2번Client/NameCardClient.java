package 자바종합실습2번Client;

import java.net.Socket;

public class NameCardClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8990);
            System.out.println("서버 접속 성공");
            Thread nameClientTh = new NameClientTh(socket);
            nameClientTh.start();

        } catch (Exception e) {}
    }
}
