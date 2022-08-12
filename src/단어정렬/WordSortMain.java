package 단어정렬;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
// N개의 단어를 입력 받아 (길이가 짧은 것 부터, 길이가 같으면 사전 순으로, 중복 된 단어는 제거) 정렬
public class WordSortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] word = new String[n];
        sc.nextLine(); // 버퍼 비우기 (개행문자 버림)
        for(int i = 0; i < word.length; i++) {
            word[i] = sc.nextLine();
        }
        // Set을 중복 제거
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        // String[0] : 이건 원래 생성된 크기 만큼을 넘긴다는 의미
        word = hashSet.toArray(new String[0]);

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    // compareTo() : 두개의 값을 비교해 int 값으로 반환해주는 함수
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length(); // 양수가 나오면 정렬을 해야 할 조건이 된다.
                }
            }
        });
        System.out.println(Arrays.toString(word));



    }
}
