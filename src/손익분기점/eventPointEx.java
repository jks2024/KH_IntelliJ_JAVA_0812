package 손익분기점;

import java.util.Scanner;

// 월드전자에서 생산하는 노트북이 몇대 팔려야 이익이 발생하는가를 묻는 문제
// 입력 : 고정비용 가변비용 판매단가
// 몇대를 팔아야 손익분기점을 달성하는가를 묻는 문제
// 손익분기점이 존재하지 않으면 -1
public class eventPointEx {
    public static void main(String[] args) {
        // 스캐너 객체를 생성해서 고정비용 가변비용 생산비용을 입력 받음
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int fixCost = sc.nextInt();
        int varCost = sc.nextInt();
        int sellPrice = sc.nextInt();
        // 손익분기점을 달성할 수 없으면 -1을 출력하고 끝냄
        if(varCost >= sellPrice) {
            System.out.println("-1");
            return;
        }
       // while(true) {
       //     //if(fixCost + (varCost * cnt) < sellPrice * cnt) break;
       //     if(cnt > fixCost / (sellPrice - varCost)) break;
       //     cnt++;
       // }
        System.out.println((fixCost / (sellPrice - varCost)) + 1);

    }
}
