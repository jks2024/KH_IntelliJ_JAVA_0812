package 자바종합실습2번;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class NameCardServer {
    static List<NameCardInfo> list = new ArrayList<>();
    public static void main(String[] args) {
        int port = 8990;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while(true) {
                Socket socket = serverSocket.accept();
                System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress() + "연결");
                Thread server = new NameServerTh(socket);
                server.start();
            }
        } catch (ConnectException e) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static List<NameCardInfo> writeNameCard() {
        list.add(new NameCardInfo("안유진", "010-1234-5678", "지구오락실", "anyj@gmail.com"));
        list.add(new NameCardInfo("이영지", "010-1234-5678", "지구오락실", "lej@gmail.com"));
        list.add(new NameCardInfo("이은지", "010-1234-5678", "지구오락실", "lyjj@gmail.com"));
        list.add(new NameCardInfo("우영우", "010-1234-5678", "이상한변호사", "yyy@gmail.com"));
        list.add(new NameCardInfo("정명석", "010-1234-5678", "이상한변호사", "jms@gmail.com"));
        list.add(new NameCardInfo("이준호", "010-1234-5678", "이상한변호사", "ljh@gmail.com"));
        list.add(new NameCardInfo("권민우", "010-1234-5678", "이상한변호사", "kmw@gmail.com"));
        list.add(new NameCardInfo("나영석", "010-1234-5678", "지구오락실", "nys@gmail.com"));
        list.add(new NameCardInfo("미미", "010-1234-5678", "지구오락실", "mimi@gmail.com"));
        list.add(new NameCardInfo("임윤아", "010-1234-5678", "빅마우스", "yuna@gmail.com"));
        return list;
    }
}
