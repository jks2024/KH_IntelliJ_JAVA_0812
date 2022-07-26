package 버블정렬;
import java.util.Arrays;
// 버블 정렬은 배열의 각 요소를 현재위치와 다음 위치의 요소를 각각 다 비교
public class BubbleEx1 {
    public static void main(String[] args) {
        int[] arr = {9,4,3,10,50,8,77,6,23,1};
        int tmp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
