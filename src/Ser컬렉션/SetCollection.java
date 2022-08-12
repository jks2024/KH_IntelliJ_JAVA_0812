package Ser컬렉션;
// HashSet : 순서를 유지해주지 않고, 중복 허용을 하지 않음
// 집합의 기능 사용 : 교집합, 합집합, 차집합
// 합집합 : 양쪽에 있는 모든 요소를 포함 함(중복허용 하지 않음)
// 교집합 : 양쪽 모두에 존재하는 요소만 포함(중복허용 하지 않음)
// 차집합 : 앞의 집합에서 뒤의 집합을 뺌(?)
import java.util.Arrays;
import java.util.HashSet;
public class SetCollection {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java"); // 값 추가 하기
        set.add("Python");
        set.add("Kotlin");
        set.addAll(Arrays.asList("JavaScript", "C++", "C#")); // 여러개의 값 한번에 추가 하기
        set.remove("C#");
        set.removeAll(Arrays.asList("JavaScript", "C++", "C#")); // 여러개를 한번에 삭제
        System.out.println(set);


    }
}
