package 파일입출력커피;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class SerialMenuMain {
    public static void main(String[] args) throws IOException {
        menuWrite();
    }

    static void menuWrite() throws IOException {
        Map<String, MenuInfo> map = new HashMap<>();
        map.put("Americano", new MenuInfo("Americano", 2000, "Coffee", "기본커피"));
        map.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "진한커피"));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유 포함"));
        FileOutputStream fos = new FileOutputStream("C:/파일입출력tmp/커피메뉴.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(map); // 객체 출력 스트림을 이용해서 list 출력
        oos.flush();
        oos.close();
    }
}
