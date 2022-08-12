package 자동차종합연습;
import java.util.Scanner;
public class CarTotalExMain {
    public static void main(String[] args) {
        final int[] dist = {0, 400, 150, 200, 300}; // 부산, 대전, 강릉, 광주
        Car car = null; // 부모클래스로 참조 타입 변수, 자식 객체를 동적 바인딩 할 수 있다.
        Driver driver = new Driver();
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 선택 [1]부산, [2]대전, [3]강릉, [4]광주 : ");
        int cityLoc = sc.nextInt();
        System.out.print("이동할 승객 수를 입력 하세요 : ");
        int passCnt = sc.nextInt();
        System.out.print("이동할 차량 선택 : [1]스포츠카, [2]승용차, [3]버스 : ");
        int carSel = sc.nextInt();
        System.out.print("부가 기능 [1]ON, [2]OFF : ");
        int option = sc.nextInt();
        boolean isMode = (option == 1) ? true : false;
        switch(carSel) {
            case 1 : car = new SportsCar("Ferrari"); break;
            case 2 : car = new Sedan("GV80"); break;
            case 3 : car = new Bus("BUS"); break;
            default : System.out.println("차량 선택이 잘 못 되었습니다.");
        }
        driver.drive(car, passCnt, dist[cityLoc], isMode);

    }
}
