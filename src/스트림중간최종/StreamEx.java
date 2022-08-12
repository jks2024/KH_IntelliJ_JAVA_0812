package 스트림중간최종;

import java.util.Arrays;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) {
        List<StInfo> stList = Arrays.asList(
                new StInfo("우영우", 99),
                new StInfo("최수연", 96),
                new StInfo("권민우", 92)
        );
        double avg = stList.stream()
                // 중간처리
                .mapToInt(StInfo::getScore)
                // 최종 처리
                .average()
                .getAsDouble();

        System.out.println("평균 점수 : " + avg);

    }
}

class StInfo {
    String name;
    int score;

    public StInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }
    int getScore() {
        return score;
    }
}
