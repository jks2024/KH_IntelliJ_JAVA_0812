package 자바종합실습2번;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class NameServerTh extends Thread {
    static ArrayList<Socket> sockets = new ArrayList<>();
    Socket socket;
    public NameServerTh(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }
    @Override
    public void run() {
        try {
            for(int i = 0; i < sockets.size(); i++) {
                OutputStream out = sockets.get(i).getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(out);
                oos.writeObject(NameCardServer.writeNameCard());
                oos.flush();
                oos.close();
                System.out.println(sockets.get(i).getRemoteSocketAddress().toString() + "에게 전송 완료.");
                out.close();
            }
        } catch(IOException e) { }

    }
}
