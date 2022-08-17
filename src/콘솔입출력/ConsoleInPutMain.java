package 콘솔입출력;
import java.io.IOException;
import java.io.OutputStream;
// 키보드 입력을 받고 화면에 출력하는 것
// System.in, System.out, System.err
// System.in 필드 : 콘솔로 부터 데이터를 입력 받음 , InputStream 과 사용 가능
// System.out 필드 : 콘솔로 데이터 출력하기 위해 사용
public class ConsoleInPutMain {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        for(byte b = 48; b < 58; b++) {
            os.write(b);
        }
        os.write(10);
        for(byte b = 65; b < 65+26; b++) {
            os.write(b);
        }
        os.write(10);
        String hangul = "가나다라마바사아자타카파하";
        // getBytes() : 유니코드를 바이트코드로 인코딩해주는 메소드
        byte[] hangulBytes = hangul.getBytes();
        os.write(hangulBytes);
        os.flush();
    }
}
