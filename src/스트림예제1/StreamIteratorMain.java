package 스트림예제1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
//스트림이란?
// 컬렉션 프레임워크의 저장 요소를 하나씩 참조해서 람다식으로 처리
// 다양한 데이터를 표준화된 방법으로 다루기 위한 것
// 내부 반복자 사용
// 단 한번만 사용 가능, 원본 데이터 변경 하지 않음, 병렬처리에 장점이 있음
// forEach() : 스트림 요소에 대한 순차접근 (Iterator 와 유사 함)
public class StreamIteratorMain {
    public static void main(String[] args) {
        String[] name = {"이은지", "이영지", "미미", "안유진", "나영석"};
        List<String> list = new ArrayList<>(Arrays.asList(name));
        // Iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // 향상된 for 문
        for(String e : list) System.out.print(e + " ");
        System.out.println();

        // 스트림을 이용 , Collection 인터페이스에 stream() 메소드 정의 되어 있음
        Stream<String> stream = list.stream();
        // forEach(변수 -> 반복처리(변수))
        stream.forEach(s->System.out.print(s + " "));

    }
}
