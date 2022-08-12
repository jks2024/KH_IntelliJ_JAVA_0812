package 시스템클래스;
import static java.lang.Thread.sleep;

// 현재 시간 읽기 : System.currentTimeMillis(); // 1000 / 1초
// 현재 시간 읽기 : System.nanoTime() // 1000000 / 1 초
public class SystemMain {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0; // 총 검색 횟수
        int randVal = (int) (Math.random() * 1000) + 1;
        for(int i = 0; i < 1000; i++) {
            data[i] = i + 1;
        }
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++) {
            cnt++;
            sleep(1);
            if(randVal == data[i]) {
                System.out.println("찾은 위치 : " + (i+1));
                break;
            }
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("총 소요된 검색 시간 : " +
                (timeEnd - timeStart) + "밀리초 입니다.");

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.home"));

    }
}
