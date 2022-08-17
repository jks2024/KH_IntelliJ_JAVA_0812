package 스트림예제2;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
// 스트림은 컬렉션의 요소에 대해 중간 처리와 최종 처리를 수행 할 수 있는데,
// 중간 처리에서는 매핑, 필터링, 정렬을 수행하고 최종 처리에서는
// 반복, 카운팅, 평균, 총합 등의 처리를 수행
public class StreamEx2 {
    public static void main(String[] args) {
        List<StudentInfo> list = new LinkedList<>();
        list.add(new StudentInfo("미미", 45));
        list.add(new StudentInfo("안유진", 98));
        list.add(new StudentInfo("이영지", 88));
        list.add(new StudentInfo("이은지", 90));
        list.add(new StudentInfo("나영석", 91));
        // 중간 스트림 만들기 : 스트림을 이용해 평균 구하기
        double avg = list.stream()
                .mapToDouble(StudentInfo::getScore) // 메소드 참조
                .average()
                .getAsDouble();
        System.out.println("평균점수 : " + avg);


    }

}
class StudentInfo {
    private String name;
    private int score;

    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
