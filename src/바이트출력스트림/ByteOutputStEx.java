package 바이트출력스트림;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 바이트 단위로 데이터를 전송, 주로 파일(동영상, 이미지 등등) 전송에 사용
// 최상위 추상 클래스는 OutputStream
// FileOutputStream은 OutputStream 추상클래스의 자손이며 파일 출력
public class ByteOutputStEx {
    public static void main(String[] args) throws IOException {
        //OutputStream os = new FileOutputStream("C:/파일입출력tmp/test0816_01.txt");
        OutputStream os = new FileOutputStream("C:/파일입출력tmp/test0816_03.txt");
        byte[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        os.write(array, 1, 3); // 배열 1번 인덱스에서 3개의 값 출력
        os.flush();
        os.close();
    }
}
