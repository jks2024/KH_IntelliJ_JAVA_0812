package 평가대비2차_서술형;
import java.util.Scanner;
//1. 반복문
// - for() : 반복횟수가 정해져 있을 때 주로 사용
// - while() : 반복 횟수가 정해져 있지 않을 때 주로 사용
// - do ~ while() : 무조건 한번은 수행되는 반복문(조건식이 마지막에 있음)
// 반복 여부를 결정하는 조건식이 맨 아래에 존재
// 2. 무한 반복문 while에서 1분터 10까지만 출력 할 수 있는 방법을 제시 하시오.
// - 단, while문에서 while(true) 유지하면 만점
// 3. 문자열 배열을 만들어서 "사과", "딸기", "오렌지" 로 초기화
// 4. 구구단 출력 문제 : 2단만 출력(싱글 for문 사용)
// 5. 패스
// 6. 문자열 출력 하기
// 7. 배열의 얕은 복사, 깊은 복사를 설명 하시오.
// - 얕은 복사란? 주소가 복사 됨
// - 깊은 복사란? 값이 복사
// 8. 배열의 깊은 복사를 할 수 있는 방법 세 가지
// - 배열을 깊은 복사를 하는 방법 (for, arraycopy, copyOf())
// 9. 배열의 특징 2가지 (같은 데이터 타입, 크기 변경 불가능, 여러개의 값을 연속으로 저장 할 수 있다.)
// - 같은 타입이 연속으로 존재하는 유한의 데이터를 저장하는 공간
// 10. int 자료형을 10개 담을 수 있는 공간 iArr을 생성 하시오.
// 11. double 자료형 5개 담을 수 있는 dArr을 생성
// 12, 13. 어떤 값을 출력되는 묻는 문제 : 주소값이 출력, 0
// - String 참조변수에 아무것도 대입되지 않으면 null (참조형에서 주소가 할당되어 있지 않을 때)
// - 객체를 만들고 아무것도 대입하지 않으면 이것도 null
// - null을 참조하는 객체를 호출하면 NullPointerException 에러 발생
// 14. 배열을 for문으로 출력하는 문제
// 15. 클래스 변수와 인스턴스 변수의 초기화 순서
// - 클래스 변수 : JVM이 정한 기본값 -> 명시적 초기화 -> 초기화 블록
// - 인스턴스 변수 : JVM이 정한 기본값 -> 명시적 초기화 -> 초기화 블록 -> 매개변수 생성자
// - 클래스 변수 : 클래스 생성 시 초기화
// - 인스턴스 변수는 : 객체 생성시 생성자를 통해 초기화
// 16. memberId에 대한 getter/setter 작성 문제
// 17. 접근제한자의 접근 가능 범위에 대해 기술하시오.
// - private : 클래스 내에서만 접근 가능(클래스 내부의 메소드롤 통해 필드를 접근)
// - default : (키워드는 없음) 동일 패키지 내에서 접근 가능
// - protected : 동일 패키지 내에서 접근 가능, 만약 다른 패키지에 있더라도 상속 관계이면 접근 가능
// - public : 모든 패키지에서 접근 가능
// 18. 필드에 들어 갈 수 있는 접근 제한자를 기술 하시오
// - (private, default, protected, public)
// - 필드란? 클래스 내부에서 사용되는 변수를 의미 함.
// 19. 메소드에 들어 갈 수 있는 접근 제한자 기술 (private, default, protected, public)
// - 메소드란? 클래스 내부에서 사용되는 하나의 동작 기능 구현 한 것
// - 메소드란? 필드에 대해 값을 쓰거나 읽는 동작을 위해 사용되기도 함.(게터/세터)
// 20. 객체지향프로그램의 3대특징에 대해 쓰시오.
// - 상속, 다형성, 캡슐화(데이터은닉), 추상화
// 21. 자바에서 클래스 변수, 인스턴스 변수, 지역 변수의 특징에 대해너서 기술
// - 클래스 변수 : static 선언된 필드(멤버) 변수, 클래스에 소속되고, 객체로 만들어 지지 않는다.
// - 프로그램 실행시 정적메모리영역에 할당되고 프로그램 종료 시 소멸 된다.
// - 인스턴스 변수 : new에 의해서 객체로 만들어 생성되는 변수(heap), this 참조 변수로 접근 가능
// - 지역 변수 : 메소드 또는 제어문 내에서 선언된 변수를 의미하고 stack영역에 생성됨.
// - 해당 메소드나 제어문을 벗어나면 자동 소멸된다.
// 22. 메소드 오버로딩에 대해서 설명 하시오.
// - 동일한 메소드 이름을 사용하고, 매개변수의 타입이나 개수로 메소드를 자동으로 호출 함.
// - 키워드 (동일한 메소드 이름, 매개변수, 반환 타입으로 결정되지 않는다.)
// 23. public class 클래스명{}, class 클래스명 {} 차이가 뭔지 설명
// - 클래스명에는 접근제한자 public 이거나, 없거나(default) 둘 중 하나만 존재함
// - public이 붙어 있으면 해당 파일의 주인이 된다.다른 패키지에서 import 해서 사용 가능
// - public이 없으면 해당 패키지 안에 있는 클래스 끼리만 사용 가능
// - (왜냐면 import 할 수 없기 때문에)
// 24. 클래스에 들어 갈 수 있는 접근 제한자 기술(public, default)
public class TestPassMainEx3 {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo("GV80");
        System.out.println(MemberInfo.company);
    }
}
class MemberInfo {
    static String company = "현대자동차";
    String modelName; // 인스턴스 변수 또는 인스턴스 필드라고 부름
    public MemberInfo(String modelName) {
        this.modelName = modelName;
    }
}


