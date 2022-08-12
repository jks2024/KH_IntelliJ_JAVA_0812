package 예외처리테스트;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("test.txt");
            f.write("test");
        } catch (IOException e ) {
            e.printStackTrace();
        } finally {
            if(f != null) {
                try {
                    f.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
