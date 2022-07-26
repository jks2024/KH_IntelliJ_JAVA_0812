package 상근이알람;
import java.util.Scanner;
public class AlarmEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour, min, calc; // 시간, 분, 시간과 분을 분으로 환산
        System.out.print("시간 입력 : ");
        hour = sc.nextInt();
        min = sc.nextInt();
        calc = (hour * 60) + min; // 입력 받은 시간과 분을 분으로 환산
        if(calc < 45) {
            calc = (24 * 60) + min;
        }
        calc -= 45; // calc = calc - 45;
        System.out.println("알람 : " + (calc / 60) + "시" + (calc % 60) + "분");
    }
}
