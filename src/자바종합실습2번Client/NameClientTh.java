package 자바종합실습2번Client;
import 자바종합실습2번.NameCardInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

public class NameClientTh extends Thread {
    Socket socket;
    public NameClientTh(Socket socket) {
        this.socket = socket;
    }
    void viewNameCards(List<NameCardInfo> nameCards) {
        for(NameCardInfo e : nameCards) {
            System.out.println("====== 명함 정보 출력 ======");
            System.out.println("이름 : " + e.getName());
            System.out.println("회사 : " + e.getCompany());
            System.out.println("전화번호 : " + e.getPhone());
            System.out.println("이메일 : " + e.getEmail());
        }
    }

    @Override
    public void run() {
        InputStream input;
        ObjectInputStream ois;
        List<NameCardInfo> nameCards;
        try {
            while(true) {
                input = socket.getInputStream();
                ois = new ObjectInputStream(input);
                nameCards = (List<NameCardInfo>) ois.readObject();
                viewNameCards(nameCards);
            }
        } catch(IOException e) {} catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
