package 어레이리스트;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// 배열의 확장판, 자바에서 리스트 구조의 컬렉션 프레임워크의 기본 자료 구조
public class ArrayListMain {
    public static void main(String[] args) {
        String[]data = {"161", "111", "133", "124", "138", "145", "155"};
        // Arrays.asList(배열) : 이미 만들어져 있는 배열로 ArrayList를 만듬
        List<String> pitches = new ArrayList<>(Arrays.asList(data));
        // 리스트 정렬 하기, 오름 차순 : Comparator.naturalOrder()
        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches);
        // 리스트 정렬 하기, 내림 차순 : Comparator.reverseOrder()
        pitches.sort(Comparator.reverseOrder());
        System.out.println(pitches);
    }
}
