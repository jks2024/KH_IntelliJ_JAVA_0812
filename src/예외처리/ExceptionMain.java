package 예외처리;
import java.io.FileWriter;
import java.io.IOException;
// 예외처리란? 프로그램에서 예외 상황이 발생 했을 경우 프로그램의 갑작스러운 종료를 막고,
// 정상적인 동작을 유지 하도록 만들어 줌
// 파일 입출력에 대한 예외 처리
public class ExceptionMain {
    public static void main(String[] args) {
        FileWriter f = null; // 참조 변수에 초기값 대입
        try {
            f = new FileWriter("test.txt");
            f.write("Hello Java");
        } catch (IOException e) {
            e.printStackTrace(); // 디버깅용으로 사용하며 에러에 대한 Call Stack 저장
        // 어떤 발생하더라도 반드시 실행되어야 할 구문이 있으면 finally에 적어 줌
        } finally {
            if(f != null) {
                try {
                    f.close(); // 쓰기 위한 파일을 열고 난 다음 다 사용한 후 자원 반납하고 진행
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
