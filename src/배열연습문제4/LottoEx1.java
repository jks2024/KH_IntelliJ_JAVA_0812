package 배열연습문제4;
import java.util.Arrays;
import java.util.HashSet;

// 로또 번호 자동 생성 :
public class LottoEx1 {
    public static void main(String[] args) {
//        int[] lotto = new int[6];
//        int tmp; // 랜덤으로 생성된 번호를 임시 저장
//        boolean isExist = false;
//        int index = 0; // 중복된 번호가 없는 경우 0부터 채워 나감
//        while(true) {
//            tmp = (int)((Math.random() * 45) + 1);
//            for(int i = 0; i < lotto.length; i++) {
//                if(lotto[i] == tmp) isExist = true;
//            }
//            if(!isExist) lotto[index++] = tmp; // 현재 생성된 번호가 배열내에 없으면 배열에 추가
//            if(index == 6) break;
//            isExist = false;
//        }
//        System.out.println(Arrays.toString(lotto));
        HashSet<Integer>set = new HashSet<>();
        while(true) {
            int val = (int)(Math.random()* 45) + 1;
            set.add(val);
            if(set.size() == 6) break;
        }
        System.out.println(set);

    }
}
