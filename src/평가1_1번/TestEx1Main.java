package 평가1_1번;
import java.util.Scanner;
// 반복문에 대해서 이해 여부 확인
// 문자열 비교 방법을 물어 봄
public class TestEx1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 반복문의 진입 조건은 참이어야 한다. (1번 문제)
        while(true) {
            System.out.print("문자열을 입력 하세요 : ");
            // 문자열을 입력 받기 위한 String 변수를 선언하고 문자열 대입
            String str = sc.nextLine();
            // 실제 문자열을 비교하는 메소드 equals (2번 문제)
            if(str.equals("exit")) break;
            else {
                System.out.println(str.length() + "글자 입니다.");
            }
        }
    }
}
