package 스트림최종연산;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// 스트림에서 중간 연산을 통해 변환된 스트림은 마지막으로 최종 연산을 통해 소모하여 결과 표시
// 최종연산을 수행하면 모든 요소가 소모되어 해당스트림을 사용 할 수 없습니다.
// 최종연산의 요소의 소모(reduce()) : 첫 번째와 두번째 요소를 가지고 연산을 수행한 뒤,
// 그 결과와 세 번째 요소를 가지고 또 다시 연산을 수행
// Optional<T> : 클래스를 사용하면 NPE(Null point Exception)을 방지 할 수 있도록 해줌
// ifPresent() : null 상태를 체크하며 if문 대신에 사용
// forEach() : 요소를 순회하면 결과를 출력함
// reduce() : 첫 번째와 두 번째 요소에 대한 연산을 수행 후, 그 결과와 세 번째 요소를 가지고 연산을 수행
// findFirst(), findAny() : 해당 스트림에서 첫 번째 요소를 참조하는 Optional 객체 반환
// findFirst() 병렬 처리가 안됨, 병렬처리 시 첫번째 요소를 가져 오기 위해서는 findAny()를 사용
// anyMatch() : 해당 스트림의 일부 요소가 특정 조건을 만족할 경우 true 반환
// allMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족할 경우 true
// count() : 스트림의 요소의 총 개수를 long 타입의 값으로 반환
// max() : 큰값, min() 작은 값
//
public class StreamFinalEx {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(30, 60, 90, 98);
        DoubleStream stream2 = DoubleStream.of(30.33, 90.99, 88.43, 32.08);
        System.out.println(stream1.sum());
        System.out.println(stream2.average().getAsDouble());
    }
}
