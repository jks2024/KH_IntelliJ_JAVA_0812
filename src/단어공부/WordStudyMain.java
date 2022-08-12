package 단어공부;

import java.util.Scanner;

// 문자열을 입력 받아 가장 많이 사용된 알파벳이 무엇인지 확인
// 만약, 가장많이 사용된 단어가 여러개인 경우 ? 출력
public class WordStudyMain {
    public static void main(String[] args) {
        // 단어를 입력 받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 가장 많이 등장하는 단어를 찾기 위해 알파벳 수 만큼의 배열 생성(대소문자 구분 안함으로..)
        int[] alpha = new int[26];
        int max = 0;
        char result = 0;
        System.out.print("단어 입력 : ");
        String word = sc.next(); // 스캐너 객체를 이용해 문자열을 입력 받음
        // 입력 받은 단어의 길이 만큼 반복문을 수행하면서 알파벳을 정수로 변환한 인덱스에 값 누적
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') alpha[word.charAt(i) - 'a']+=1;
            else alpha[word.charAt(i) - 'A']+=1;
        }
        for(int i = 0; i < alpha.length; i++) {
            if(alpha[i] == max) result = '?'; // 가장 많이 등장하는 수가 여러개 인 경우
            else if(alpha[i] > max) { // 현재 인덱스의 문자 개수가 max 보다 큰 경우
                max = alpha[i];
                result = (char) ('A' + i); // 결과를 문자로 출력하기 위해서 인덱스의 정수값을 문자로 변환
            }
        }
        System.out.println(result);

    }
}
