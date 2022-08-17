package 람다만들기;
// 화살표 기호를 사용하여 람다 표현식을 작성 할 수 있습니다.
// 매개변수의 타입을 추론 할 수 있는 경우 타입을 생략 할 수 있음
// 매개변수가 하나인 경우에는 ()생략 할 수 있음
// 함수의 몸체가 하나의 명령문만으로 이루어진 경우 {} 생략 가능
// 상속을 주기 위한 선언부만 만들 수 있음
// 함수형 인터페이스 : 참조변수의타입  참조변수의이름 = 람다표현식

@FunctionalInterface
// 인터페이스 선언에 해당 어노테이션을 붙이면 컴파일러는 해당
// 인터페이스를 함수형 인터페이스로 인식 합니다.
// 함수형 인터페이스는 한개의 메소드만 허용 합니다.
interface MyFuncInterface {
    public int min(int x, int y); // 둘 중 작은 값을 반환
}
public class LambdaEx {
    public static void main(String[] args) {
        MyFuncInterface fi = (x, y) -> x < y ? x : y; // 구현부
        System.out.println(fi.min(3, 4));
    }
}

