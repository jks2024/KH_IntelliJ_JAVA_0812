package 파일입출력커피2;
import 파일입출력커피.MenuInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class SerialMenuRead {
    static Map<String, MenuInfo> map = null;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        getMenuList();

    }
    static void getMenuList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/kyungsoojeong/tmp/커피메뉴.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        map = (Map<String, MenuInfo>) ois.readObject();
        for(String e : map.keySet()) {
            System.out.println("메뉴 : " + map.get(e).getName());
            System.out.println("가격 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getGroup());
            System.out.println("설명 : " + map.get(e).getDesc());
        }
    }
}
