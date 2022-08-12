package 암호체크만들기;
import java.util.Scanner;
public class PasswordMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 암호 체크를 위한 클래스에 대한 객체 생성, 생성자는 기본 생성자
        CheckPWClass checkPW = new CheckPWClass();
        // 사용자가 입력한 패스워드를 저장하기 위한 변수
        String password;
        while(true) { // 무한 반복, 사용자가 quit 할 때까지 문한 반복
            password = sc.next(); // 키보드를 통해서 패스워드 입력 받음
            // 입력 받은 패스워드가 종료(quit)이면 반복문 종료 함
            // equalsIgnoreCase() : 대소문자를 구분하지 않음
            if(password.equalsIgnoreCase("quit")) break;
            // 패스워드 체크를 위해 입력받은 문자열을 매개변수로 전달하면서 inputPW() 호출
            if(checkPW.inputPW(password)) {
                System.out.println("Good password!");
            } else {
                System.out.println("Bad password!");
            }
        }
    }
}
