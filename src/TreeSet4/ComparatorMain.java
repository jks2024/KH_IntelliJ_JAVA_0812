package TreeSet4;
import java.util.Iterator;
import java.util.TreeSet;
// 객체에 대한 정렬 조건을 추가하는 방법 중 하나
public class ComparatorMain {
    public static void main(String[] args) {
        TreeSet <Fruit> treeSet = new TreeSet<>(new AscendComparator());
        treeSet.add(new Fruit("포도", 3400));
        treeSet.add(new Fruit("수박", 4500));
        treeSet.add(new Fruit("딸기", 6500));
        treeSet.add(new Fruit("키위", 2300));
        // Iterator 생성
        Iterator<Fruit> iterator = treeSet.iterator();
        while(iterator.hasNext()) { // 다음 값이 있는지 확인
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + " : " + fruit.price);
        }


    }
}
