package 저항값구하기;

import java.util.Scanner;

// 2개의 컬러값을 입력 받음
// 첫번째 입력 10의 자리
// 두번째 입력 1자리
// 세번째 곱하기 값
public class OhmMainEx {
    public static void main(String[] args) {
        // 컬러값에 대한 문자열 배열 선언
        String[] color = {"black", "brown", "red", "orange", "yellow", "green",
        "blue", "violet", "grey", "white"};
        int[] mul = {1, 10, 100, 1000, 10000, 100000, 1000000,
                10000000, 100000000, 1000000000};
        int firstIdx = 0, secondIdx = 0, thirdVal = 0;
        Scanner sc = new Scanner(System.in);
        String firstColor = sc.nextLine();
        String secondColor = sc.nextLine();
        String thirdColor = sc.nextLine();
        for(int i = 0; i < 10; i++) {
            if(firstColor.equals(color[i])) firstIdx = i;
            if(secondColor.equals(color[i])) secondIdx = i;
            if(thirdColor.equals(color[i])) thirdVal = i;
        }
        System.out.println((long)((firstIdx * 10) + secondIdx) * (long)(Math.pow(10, thirdVal)));



    }
}
