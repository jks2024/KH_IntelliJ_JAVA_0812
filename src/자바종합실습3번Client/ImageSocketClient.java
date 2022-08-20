package 자바종합실습3번Client;

import java.net.Socket;
import java.util.Scanner;

public class ImageSocketClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Socket socket = new Socket("localhost", 8999);
            System.out.println("서버 접속 성공");
            System.out.print("저장할 위치를 지정하세요.(경로/파일명) : ");
            String path = sc.nextLine();
            Thread nameClientTh = new ImageClientTh(socket, path);
            nameClientTh.start();

        } catch (Exception e) {}
    }
}
