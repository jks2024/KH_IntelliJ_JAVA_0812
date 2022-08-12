package 열거형연습;
import 열거형연습.Common.*;
// java.lang.enum
// values() : 열거체의 모든 상수를 저장한 배열을 생성하여 반환 합니다.
// valueOf() : 전달된 문자열과 일치하는 해당 열거체 상수를 반환
// ordinal() : 해당 열거체 상수가 몇번째에 정의 되었는지 인덱스를 반환(0부터 시작)
public class EmunMainEx {
    public static void main(String[] args) {
        int index = Rainbow.YELLOW.ordinal();
        System.out.println(index);
    }
}


