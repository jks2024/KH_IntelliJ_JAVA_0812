package 자바종합실습3번;

import 자바종합실습2번.NameServerTh;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ImageSocketServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        int port = 8999;
        Scanner sc = new Scanner(System.in);
        System.out.print("전송할 파일을 선택하세요.(경로/파일명) : ");
        String path = sc.nextLine();
        System.out.println("파일명 : " + path);
        try {
            serverSocket = new ServerSocket(port);
            while(true) {
                Socket socket = serverSocket.accept();
                System.out.print("[클라이언트 : " + socket.getRemoteSocketAddress() + "연결 되었습니다.");
                Thread server = new ImageServerTh(socket, path);
                server.start();

            }
        } catch (ConnectException e) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
