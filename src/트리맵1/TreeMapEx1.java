package 트리맵1;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

// TreeMap 이란 ? 이진 트리 기반의 Map 컬렉션 입니다.
// TreeSet과 차이점은 키와 값이 저장된 Map.Entry를 저장 합니다.
// TreeMap의 기본 동작은 부모키 값과 비교해 작은것은 왼쪽, 큰것은 오른쪽에 저장
// Map 인터페이스 타입 변수에 대입되지만 TreeMap 클래스 타입으로 대입하는 이유는
// 특정 객체를 찾거나 범위 검색과 관련된 메소드를 사용 하기 위함.
public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(55, "나희도");
        score.put(50, "고유림");
        score.put(98, "백이진");
        score.put(76, "구자경");
        score.put(99, "우영우");

        System.out.println(score);

        // 반환 타입이 Map
        NavigableMap<Integer, String> descMap = score.descendingMap();
        // 반환 타입이 Set
        Set<Map.Entry<Integer, String>> descEntrySet = descMap.entrySet();
        for(Map.Entry<Integer, String> entry : descEntrySet) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        // Map의 값을 전체 출력하기 위해서는 entrySet(). keySet()메소드를 사용 하면 됨
        // entrySet() : Key와 value의 값이 모두 필요한 경우 사용
        // keySet() : Key의 값만 필요한 경우 사용
        System.out.println();




    }
}
