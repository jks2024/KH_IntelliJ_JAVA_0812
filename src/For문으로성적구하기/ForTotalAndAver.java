package For문으로성적구하기;
import java.util.Scanner; // 스캐너를 사용하기위해 import
// 정수 n을 입력 받아서, n의 숫자만큼의 성적으로 입력 받음
// 성적의 총점과 평균을 구하기
public class ForTotalAndAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // new 키워드로 객체를 생성
        int total = 0; // 총점을 누적하기 위한 변수
        System.out.print("과목 개수 입력 : ");
        int n = sc.nextInt(); // 스캐너 클래스에서 정수를 입력 받는 메소드
        // n의 숫자만큼 반복 수행 (성적을 입력 받기 위해서...)
        System.out.print("과목 개수에 대한 성적 입력 : ");
        for(int i = 0; i < n; i++) { // 0에서부터 n보다 작은 동안..
            total += sc.nextInt(); // total = total + sc.nextInt()
        }
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f\n", (double)total/n);


    }
}
