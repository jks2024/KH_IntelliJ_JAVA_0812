package 입력테스트;
import java.util.Scanner;
public class InputTestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("주소 입력 : ");
        String addr = sc.nextLine();
        System.out.print("성별 입력 : ");
        char gender = sc.next().charAt(0);



    }
}
