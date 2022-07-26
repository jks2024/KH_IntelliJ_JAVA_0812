package ArrayEx1;
import java.util.Arrays;
// 배열의 다양한 초기화 방법
// 다양한 데이터 타입에 대한 배열 선언
public class ArrayEx1 {
    public static void main(String[] args) {
        String[] weeks = new String[7];
        weeks[0] = "월요일";
        weeks[1] = "화요일";
        weeks[2] = "수요일";
        weeks[3] = "목요일";
        weeks[4] = "금요일";
        weeks[5] = "토요일";
        weeks[6] = "일요일";
        System.out.print("[");
        for(int i = 0; i < weeks.length; i++) {
            System.out.print(weeks[i] + ", ");
        }
        System.out.print("\b\b]");
        System.out.println();

        System.out.println(Arrays.toString(weeks)); //배열 클래스의 메소드를 이용해서 출력

        System.out.print("[");
        for(String e : weeks) System.out.print(e + ", ");
        System.out.print("\b\b]");
        System.out.println();






    }
}
