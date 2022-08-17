package 스트림예제3;
import java.util.stream.IntStream;
// 배열로 부터 스트림 얻기
// 숫자 범위로 부터 스트림 얻기 :
public class StreamArrayEx {
    public static void main(String[] args) {
        // 반복문을 제거 하기 위한 메소드
        IntStream.range(1, 100).forEach(System.out::println);
//        IntStream stream = IntStream.rangeClosed(1, 100);
//        AtomicInteger sum = new AtomicInteger();
//        stream.forEach(e -> sum.addAndGet(e));
//        System.out.println("총합 : " + sum);
    }
}
