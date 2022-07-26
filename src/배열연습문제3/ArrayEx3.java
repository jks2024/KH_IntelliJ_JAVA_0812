package 배열연습문제3;

import java.util.Scanner;

// 햄버거 3개, 음료 2개를 배열로 입력 받음 (햄버거 0,1,2 배열, 음료는 3,4배열)
// 세트 메뉴 가격 = 햄버거(제일싼거) + 음료(제일싼거) - 50
public class ArrayEx3 {
    public static void main(String[] args) {
        // 햄버거와 음료를 입력 받기 위한 배열 선언 (총 5개)
        int[] menu = new int[5];
        // 햄버거와 음료에 대한 가격을 입력 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : ");
        // 반복문과 스캐너를 이용해서 배열에 햄버거와 가격 입력 받음
        for(int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }
        // 제일 싼 햄버거를 선택하기위한 변수를 생성하고, 배열의 0번 인덱스의 값을 넣어줌
        int minBurger = menu[0];
        // 제일 싼 음료를 선택하기 위한 변수를 생성하고, 배열의 3번 인덱스의 값을 넣어 줌
        int minDrink = menu[3];
        for(int i = 0; i < menu.length; i++) {
            if((i < 3) && (minBurger > menu[i])) minBurger = menu[i];
            if((i > 2) && (minDrink > menu[i])) minDrink = menu[i];
        }
        // 출력 : (햄버거 변수 + 음료 변수 - 50)
        System.out.println(minBurger + minDrink - 50);

    }
}
