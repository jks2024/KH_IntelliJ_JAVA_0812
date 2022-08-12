package 전자레인지;
import java.util.Scanner;
// 3개의 타이머 : 5분(300), 1분(60), 10초
// 정확한 시간을 맞출 수 없으면 -1 (즉, 10보다 작은 수)
public class TimerMainEx {
    public static void main(String[] args) {
        int t, a, b, c; // t는 요리시간 입력 받기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.println("요리시간(초) : ");
        t = sc.nextInt();
        if(t % 10 != 0) System.out.println("-1");
        else {
            a = t / 300; // 300으로 나눈 몫
            b = t % 300 / 60; // 300보다 작은 값에서 60으로 나눈 몫
            c = t % 300 % 60 / 10; // 300으로 나눈 나머지에서 다시 60으로 나누고 남은 값을 10으로 나눔
            System.out.printf(a + " " + b + " " + c);
        }
    }
}
