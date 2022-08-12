package 쓰레드6;
import java.util.Scanner;

// 스레드의 안정한 종료 방법 : stop 플래그, interrupt()
// stop flag(true/false) 이용 방법
public class ThreadMainEx6 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String isQuit;
        RunThread runThread = new RunThread();
        runThread.start();
        while(true) {
            System.out.print("실행을 중지 하시겠습니까?(quit/no) : ");
            isQuit = sc.next();
            if(isQuit.equalsIgnoreCase("quit")) {
                Thread.sleep(1000);
                runThread.setStop(true);
                System.out.println("프로그램을 종료 합니다.");
                break;
            }
        }

    }
}
