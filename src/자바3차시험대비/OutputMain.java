package 자바3차시험대비;
import java.util.*;
// 문제 해결 시나리오
// 1. 클라이언트용 프로그램 작성 했으나 서버에 연결 되지 않음. 이유를 찾아서 기술
// 2. IO를 이용하여 기존 파일에 데이터를 이어쓸 수 있도록 구현
// 서술형
// 1. 상속에 대해 서술 : 부모가 가진 멤버(필드, 메소드)를 새로 작성하지 않고 물려 받아 자신의 것처럼 사용 하는 것
// 2. 다형성에 대해서 서술 : 상속을 이용한 기술로 부모 타입으로 부터 파생된 여러 가지 타입의 자식 객체를
// 부모 클래스 타입 하나로 다룰 수 있는 기술
// 3. 오버라이딩에 대해서 서술 : 부모 클래스의 메소드를 상속 받아 재정의 해서 사용 하는 것. 이 경우 자식 메소드가 우선
// 4. 오버로딩과 오버라이딩의 차이점 기술 :
// - 오버로딩 : 동일 클래스내에 동일한 메소드 이름을 사용하는 것으로 매개변수의 타입이나 개수가 달라야 한다.
// - 오버라이딩 : 부모 클래스에서 정의 되어 있는 메소드를 자식 클래스에서 재 정의 하는 것 (매개변수, 자료형, 개수, 순서가 동일해야 함)
// 5. String 클래스의 주요 메소드 설명
// - charAt(int index) : 주어진 문자열에서 해당 인덱스의 문자 추출해서 반환하는 메소드
// - length() : 문자열의 길이를 반환하는 메소드
// - substring(begin, end) : begin 부터 end 미만까지의 문자열을 추출해서 반환하는 메소드
// - toUpperCase() : 해당 문자열 전부를 대문자로 변경
// - toLowerCase() : 해당 문자열 전부를 소문자로 변경
// 6. String str = "Apple, Kiwi, Strawberry, Banana"; => Kiwi 문자열을 출력
// 7. 인터페이스와 추상클래스의 차이점 기술
// - 추상클래스는 상속시 키워드로 extents를 사용하며 단일 상속이다.
// - 한개 이상의 추상 메소드가 존재해야 하고 일반 메소드를 포함 할 수 있다.
// - 인터페이스는 상속 시 implements 키워드를 사용하고 다중 상속 처럼 사용 가능 하다.
// - 인터페이스는 기본적으로 모든 메소드가 추상메소드 이므로 abstract를 생략 할 수 있다.
// - 추상클래스는 일반 필드를 포함 할 수 있지만 인터페이스는 상수 필드만 가능 하다.
// 8. 오버라이딩 성립 요건 5가지 기술
// - 메소드 이름이 같아야 함, 매개변수도 같아야 함, 반환 타입도 같아야 함, 접근제한자도 같아야 함. 예외처리 개수가 같아야 함
// 9. Wrapper 클래스 8가지 기술 (기본 타입에 대한 참조 타입)
// - Boolean, Byte, Character, Short, Integer, Long, Float, Double
// 10. 문자열 "10"을 int 자료형인 10으로 변환 시키기
// - Integer.parseInt("10"); // 문자열을 정수로 변환
// 11. 문자열 "13.45"를 double 자료형인 13.45로 변환
// - Double.parseDouble("13.45");
// 12. Math 클래스의 메소드는 모두 정적 메소드 이다.
// - min(num1, num2) : 전달 된 2개의 값 중에서 작은 값을 반환
// - max(num1, num2) : 전달 된 2개의 값 중에서 큰 값을 반환
// - abs(num) : 전달 된 값에 대한 절대값 반환
// - round(num) : 전달 된 값에 대해 반올림한 결과를 반환
// - floor(num) : 전달된 수의 버림한 결과를 반환
// 13. StringTokenizer 클래스
// - countTokens() : 객체안에 담겨 있는 토큰의 개수를 반환 (꺼내지 않고 남아 있는 토큰의 수)
// - hasMoreTokens(0 : 남아 있는 토큰이 있는지 확인
// - nextToken() : 토큰을 하나씩 가져와서 반환
// 14. 현재 시스템 날짜 및 시간 가져 오기 : SimpleDateFormat 이용 "2021년 08월 22일 15시 45분 45초" 출력
// - Date today = new Date();
// - SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
// - String str = sdf.format(today);
// - System.out.println(str);
// 15. 예외처리 관련 문제 : "부적절한 나눗셈을 시도 하였습니다."
// - try { } catch(ArithmeticException e) {  }
// 16. 예외처리 관련 문제
// - ArithmeticException 은 RuntimeException 자식 클래스 이기 때문에
// RuntimeException에서 다형성 개념이 적용되므로 접근 가능하다.
// 17. 0으로 나누기 연산시 발생될 수 있는 예외클래스 기술 하시오.
// - ArithmeticException
// 18. 배열에서 부적절한 인덱스 접근하려고 할 때 발생 할 수 있는 예외클래스 기술
// - ArrayIndexOutOfBoundsException
// 19. 배열의 크기를 음수로 지정하는 경우 발생하는 예외 클래스 기술
// - NegativeArraySizeException
// 20. 컬렉션 프레임워크 중 set 관련 문제
// - add(E e) : 전달 된 객체를 Set에 추가하는 메소드
// - isEmpty() : 해당 Set이 비어 있는지 확인. 비어 있으면 true, 비어 있지 않으면 false
// - size() : 해당 Set에 저장되어 있는 객체 수를 반환하는 메소드
// 21. Map 계열의 컬렉션 프레임워크 메소드 설명
// - put(k key, V value) : 전달된 키와 값을 해당 Map에 추가시켜주는 메소드
// - get(K key) : 전달된 키에 대한 객체를 반환해주는 메소드
// - keySet() : 모든 key를 담아 Set객체로 반환
// - entrySet() : 키와 값의 쌍으로 구성된 모든 Map.entry 객체를 Set에 담아서 리턴
// 22. List 계열의 컬렉션 클래스 메소드 설명 기술
// - add(E e) : 전달된 객체를 리스트 끝에 추가
// - set(index, E e) : 해당 인덱스의 값을 전달된 객체로 변경
// - size() : 리스트에 저장된 객체의 수를 반환
// - remove(index); 전달된 인덱스의 객체를 제거
// - get(index) : 해당 인덱스의 객체를 반환
// 23. Map에 담겨 있는 요소들을 순차접근하기위한 두가지 방법,
// ketSet(), entrySet()에 대해 기술하고 방법 설명
// ketSet() : Map의 key를 Set에 담은 후 Set에 있는 Iterator를 통해 접근
// entrySet() : Map의 key와 값을 Set에 담은 후 Set에 있는 Iterator를 통해 접근
// 24. 자바의 배열과 컬렉션의 차이점 기술
// - 배열은 크기를 지정해야하고 한번 크기를 정하면 변경할 수 없지만 컬렉션의 크기는 제약이 없다.
// - 컬렉션은 정렬 및 반복자 등을 제공하여 알고리즘을 구현하는데 필수적인 요소를 제공하고 있다.
// - 배열은 한가지 타입으로 구성되지만 컬렉션은 객체등을 통해서 다양한 데이터를 포함 할 수 있다.
public class OutputMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 모든 키를 Set 객체에 담아서 리턴
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + "\t" + value);
        }





    }
}
