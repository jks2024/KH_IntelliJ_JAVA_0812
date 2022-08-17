package 람다메소드참조3;
import java.util.function.BiFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
// 메소드 참조에는 생성자 참조를 포함 합니다.
// 메소드 참조 : 클래스 필드, 인스턴스 필드, 매개변수참조, 생성자참조
public class LambdaMethodEx3 {
    public static void main(String[] args) {
        // 한개의 double형 매개변수를 전달 받아 한개의 double형 값을 반환
        DoubleUnaryOperator oper;
        oper = (n) -> Math.abs(n);
        System.out.println(oper.applyAsDouble(-5));
        oper = Math::abs; // 메소드 참조 표현식
        System.out.println(oper.applyAsDouble(-5));

    }
}

