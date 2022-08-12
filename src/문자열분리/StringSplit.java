package 문자열분리;
import 시스템클래스.SystemMain;

import java.util.Scanner;
import java.util.StringTokenizer;
// StringTokenizer 클래스 : 특정 구분자로 연결되어 있는 경우,
// 구분자 기준으로 문자열을 자름 (String의 split 메소드와 유사함)
// countTokens() : 꺼내지 않고 남아 있는 토큰의 수
// hasMoreTokens() : 남아 있는 토큰이 있는지 여부 확인
// nextToken() : 토큰을 하나씩 꺼내 옴
public class StringSplit {
    public static void main(String[] args) {
        Car car = new Car();
        Class cls = car.getClass(); // Class 클래스
        System.out.println(cls.getName()); // 패키지이름과 클래스이름 출력
        System.out.println(cls.getSimpleName());
        System.out.println(cls.getSuperclass());
        System.out.println(cls.getPackage().getName());

    }
}
class Car {}
