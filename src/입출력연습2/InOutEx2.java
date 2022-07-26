package 입출력연습2;
import java.util.Scanner;
// Scanner 클래스 : 표준 입력 클래스, java.util 패키지에 있음
// 클래스이름 참조자이름(객체이름) = new 클래스이름(System.in);
public class InOutEx2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("이름을 입력 하세요 : ");
       String name = sc.next(); // 문자열을 입력 받음(공백이오면 중단 됨)
        sc.nextLine(); // 버퍼 비워 주기
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine();
        System.out.print("성별을 입력 하세요 : ");
        char gender = sc.next().charAt(0); // 문자열 중에서 0번째 인덱스의 값을 가져 옴
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();
        System.out.print("회원정보를 출력 하시겠습니까?[yes/no] : ");
        String isPrint = sc.next();
        if(isPrint.equalsIgnoreCase("yes")) {
            System.out.println("======== 회원 정보 =========");
            System.out.println("이름 : " + name);
            System.out.println("주소 : " + addr);
            System.out.println("성별 : " + gender);
            System.out.println("나이 : " + age);
        } else {
            System.out.println("출력 안함");
        }







    }
}
