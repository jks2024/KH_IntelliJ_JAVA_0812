package 데이터와변수;

import java.util.Scanner;

// 각 데이터형에 대한 변수 선언
// 변수의 사용 범위 : 지역변수는 중괄호 {}내에서 생존 한다.
// 괄호에 대해서 : []대괄호는 배열을 의미, {} 중괄호는 메소드나 클래스의 범위,
// () 소괄호는 메소드의 매개변수 목록을 넣는 부분
// 상수 : 상수는 값이 한번 정해지면 변경이 불가능한 변수를 의미 (final)
// 타입 변환 : 하나의 타입을 다른 타입으로 변환하는 것
// 정수형을 문자형으로 변경하는 것 : 제공되는 메소드를 사용
// 명시적 형변환은 개발자가 의도를 가지고 형을 변경하는 것
// 묵시적 형변환은 컴파일러가 유리한 방향으로 자동으로 형변 변경
public class DataValMain {
    public static void main(String[] args) {

        // 진수에 대한 표현
        int var1 = 0b1010; // 2진수
        int var2 = 0206;   // 8진수
        int var3 = 365;    // 10진수
        int var4 = 0xB3;   // 16진수
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);



    }
}
