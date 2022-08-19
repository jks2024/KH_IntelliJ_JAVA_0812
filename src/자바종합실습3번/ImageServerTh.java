package 자바종합실습3번;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ImageServerTh extends Thread {
    Socket socket;
    String fileName;
    static ArrayList<Socket> sockets = new ArrayList<>();
    public ImageServerTh(Socket socket, String fileName) {
        this.socket = socket;
        this.fileName = fileName;
        sockets.add(socket);
    }

    @Override
    public void run() {
        int len;
        byte[] buffer = new byte[1024];
        try {
            for(int i = 0; i < sockets.size(); i++) {
                FileInputStream fis = new FileInputStream(fileName);
                OutputStream out = sockets.get(i).getOutputStream();
                while((len = fis.read(buffer)) != -1) {
                    out.write(buffer, 0, len);
                }
                out.flush();
                out.close();
                System.out.println(sockets.get(i).getRemoteSocketAddress() + "에게 전송 완료.");
            }
        } catch(IOException e) { }
    }
}
