package 어레이홀짝;
import java.util.*;

public class ArrayMethod {
    List<Integer> inList = new Vector<>();
    List<Integer> oddList = new Vector<>();
    List<Integer> evenList = new Vector<>();
    // 정수값 입력 받는 메소드
    void inputValue() {
        int tmp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        while(true) {
            tmp = sc.nextInt();
            if(tmp == 999) break;
            inList.add(tmp);
        }
    }
    void calcMethod() {
        for(Integer e : inList) {
            if(e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }
    void printMethod() {
        System.out.print("홀수 : ");
        for(Integer e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(Integer e : evenList) System.out.print(e + " ");
        System.out.println();
    }


}
