package 문자열추가하기;

import java.util.Scanner;

// 2개의 문자열 입력 받음, 정수 개수 만큼의 문자열을 첫번째 문자열 뒤에서 부터 자름
// 두번째 문자열 앞에 붙임
// 첫번째 : seoul
// 두번째 : korea
// 정수 : 2
// 결과 : ulkorea
public class StringEx2 {
    public static void main(String[] args) {
        // 문자열을 입력 받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 첫번째와 두번째 문자열을 각각 입력 받음
        System.out.print("첫번째 문자열 : ");
        String firstStr = sc.next();
        System.out.print("두번째 문자열 : ");
        String secondStr = sc.next();
        // 정수를 입력 받음
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        // 첫번째 입력 받은 문자열에서 n의 개수 만큼을 뒤에서 부터 자름
        int pos = firstStr.length() - n; // 문자열 길이로 부터 n의 개수 만큼 이동 한 위치를 찾음
        String sub = firstStr.substring(pos);
        System.out.println(sub + secondStr);
    }
}
