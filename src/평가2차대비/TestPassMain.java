package 평가2차대비;
import java.util.Scanner;
// [프로그래밍 응용]
// 1. 메소드 오버로딩을 묻는 문제
// 2. 사용자가 입력한 값의 합을 구하는 문제, 0보다 큰 숫자 입력
// 0이하의 숫자가 오면 1이상의 숫자를 입력 하라고 해야 함.
public class TestPassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력 하세요 : ");
        int num = sc.nextInt(); // 정수를 입력 받음
        int sum = 0; // 합을 구하기 위해서는 값을 누적해야 하므로 반드시 초기화 필요
        if(num > 0) { // 조건 체크 확인 필요(문제^^)
            int i = 1;
            while(i <= num) { // 반복문의 문제는 i값을 변경해주는 코드가 없음
                sum += i;
                i++; // i의 값을 변경 해주는 코드가 필요 함(문제^^)
            }
            System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
        } else {
            System.out.println("숫자가 1이상 이어야 합니다.");
        }

    }
}
