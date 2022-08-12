package 단어정렬;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
// 사용자로 부터 개수를 입력 받음
// 개수만큼의 단어를 입력
// 길이가 짧은 것 부터, 길이가 같으면 사전순, 중복 제거
public class WordSortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사용자로 부터 단어의 개수 입력
        String[] word = new String[n]; // 개수 만큼의 배열 생성
        sc.nextLine(); // 버퍼 비우기(개행문자가 다음 입력값으로 들어가는 걸 방지)
        for(int i = 0; i < word.length; i++) {
            word[i] = sc.nextLine(); // 엔터키 기준으로 입력 받기 위해 nextLine()
        }
        // set 컬렉션 : 순서를 보장하지 않음, 중복 허용하지 않음
        // asList() : 배열을 컬렉션에 넣을 때 사용하는 메소드
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        // String[0] : 원래 생성된 크기 만큼을 넘기다는 의미
        word = hashSet.toArray(new String[0]);
        //Arrays.sort(word);
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 길이가 같으면 사전순 정렬
                } else {
                    return o1.length() - o2.length(); //만약 앞이 길다면 양수(양수가 반환되면 정렬)
                }
            }
        });
        System.out.println(Arrays.toString(word));
    }
}
