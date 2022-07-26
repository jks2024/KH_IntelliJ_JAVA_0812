package 스위치조건문;
import java.util.Scanner;
// switch(변수) { case :  }
// 스위치문으로 계산기 만들기
public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("성별을 입력 하세요 : ");
            char gender = sc.next().charAt(0);
            switch (gender) {
                case 'M': case 'm': System.out.println("남성 입니다."); break;
                case 'F': case 'f': System.out.println("여성 입니다."); break;
                default: System.out.println("성별을 잘 못 입력 하셨습니다. 다시 입력 하세요.");
                continue;
            }
            break;
        }

    }
}
