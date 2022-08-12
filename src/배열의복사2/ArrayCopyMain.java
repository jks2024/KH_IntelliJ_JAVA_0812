package 배열의복사2;

import java.util.Arrays;

// 배열을 깊은 복사를 하는 방법 (for, arraycopy, copyOf())
// arraycopy() : 배열을 복사 할 때 사용하는데, 주로 배열의 공간이 부족한 경우
// 더 큰 공간을 할당 하고자 할 때 사용
// arraycopy(src, src pos, dest, dset pos, length)
// copyOf() : 배열을 원하는 길이 만큼 새로운 배열로 복사
public class ArrayCopyMain {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr1, 10);
        for(int e : arr2) System.out.print(e + " ");

    }
}
