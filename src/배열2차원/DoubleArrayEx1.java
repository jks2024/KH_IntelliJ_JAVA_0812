package 배열2차원;

import java.util.Arrays;

// 2차원 배열 : 행과 열이 존재
public class DoubleArrayEx1 {
    public static void main(String[] args) {
        //int[][] arr = new int[2][3];
        //int k = 10;
        //for(int i = 0; i < arr.length; i++) {
        //    for(int j = 0; j <arr[i].length; j++) {
        //        arr[i][j] = k;
        //        k += 10;
        //    }
        //}
        int[][] arr = {
                {100, 200, 300},
                {400, 500, 600}
        };

        //for(int i = 0; i < arr.length; i++) {
        //    for(int j = 0; j < arr[i].length; j++) {
        //        System.out.print(arr[i][j] + " ");
        //    }
        //}
        for(int[] ints : arr) {
            for(int e : ints) {
                System.out.print(e + " ");
            }
        }

    }

}
