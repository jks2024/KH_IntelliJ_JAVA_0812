package 문자출력스트림;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
// Writer는 문자열 기반 출력 스트림의 최상위 추상 클래스 입니다.
// 모든 문자 기반 출력 스트림 클래스는 이 클래스를 상속 받아 만들어 집니다.
public class ChWriteStMain {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:/파일입출력tmp/문자출력0816_02.txt");
        //char[] data = "곰돌이사육사".toCharArray(); // 문자열을 문자 배열로 변환 시킴
//        for(int i = 0; i < data.length; i++) {
//            writer.write(data[i]); // 해당 인덱스 값을 write
//        }
        String data = "삶을 사는 데는 단 두가지 방법이 있다. " +
                "하나는 기적이 전혀 없다고 여기는 것이고 또 다른 하나는 모든 것이 기적이라고 " +
                "여기는방식이다. – 알베르트 아인슈타인";
        writer.write(data); // 스트링 타입에 대한 오버로딩 메소드가 있으므로..

        //writer.write(data); // write(char[]);
        writer.flush(); // 출력 이후는 버퍼를 비워 줘야 함.
        writer.close(); // 출력 이후 자원 반납하고 열려 있는 스트림을 닫음
    }
}
