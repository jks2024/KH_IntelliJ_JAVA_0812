package 에어컨만들기;
import java.util.Calendar;
import java.util.Scanner;
// 전원 : ON/OFF (boolean)
// 온도 설정 기능 : int
// 현재 온도 표시 기능 : int
// Cooler ON/OFF (boolean)
// Heater ON/OFF (boolean)
// 바람세기 (1단/2단/3단)
// 현재 온도가 변경 될 때 화면에 에어컨 정보를 표시 하도록 함.
public class AirCon {
    private boolean isPower; // 전원 제어
    private int setTemp;     // 온도 설정
    private int currTemp;    // 현재 온도
    private boolean isCooler; // 에어컨 제어
    private boolean isHeater; // 히터 제어
    private int windStep;     // 바람세기 (1단/2단/3단)
    AirCon() { // 생성자는 에어컨이라는 객체가 만들어 질 때 어떤 상태로 시작해야 될지를 결정
        final int[] monthTemp = {-5, 3, 9, 15, 22, 26, 30, 31, 24, 16, 9, 3};
        Calendar now = Calendar.getInstance(); // 운영체제로 부터 현재의 날짜 정보 가져 옴
        int month = now.get(Calendar.MONTH); // 현재가 몇월인지 배열의 인덱스로 넘어 옴
        currTemp = monthTemp[month]; // 현재의 달 온도를 배열로 부터 가져 옴
        isPower = false; // 에어컨 초기 상태는 꺼져 있음
        setTemp = 18;    // 에어컨의 초기 설정 온도 지정
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }
    void airConInfo() {
        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("========에어컨 정보=========");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람세기 : " + windStr[windStep]);
    }
    void setAirCon() {
        // 에어컨 설정을 위해 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도가 " + currTemp + "입니다.");
        System.out.print("온도를 설정 하세요 : ");
        setTemp = sc.nextInt(); // 스캐너로 부터 현재 온도를 입력 받아 setTemp 넣어줌
        System.out.println("설정 온도는 " + setTemp + " 입니다.");
        System.out.print("바람 세기를 설정[1]1단 [2]2단 [3]3단 : ");
        windStep = sc.nextInt();
        if(currTemp > setTemp) {
            System.out.println("Cooler 가 동작 합니다.");
            isCooler = true; // 에어컨이 켜졌음
            isHeater = false;
        } else if(currTemp < setTemp) {
            System.out.println("Heater 가 동작 합니다.");
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }
    // 전원 설정
    void setPower(boolean power) {
        isPower = power;
    }
    // 바람세기 확인
    int getWindStep() {
        return windStep;
    }
    // 히터 상태 확인
    boolean isHeater() {
        return isHeater;
    }
    // 쿨러 상태 확인
    boolean isCooler() {
        return isCooler;
    }
    // 현재 온도 변경
    void setCurrTemp(int n) {
        currTemp += n;
    }
    // 현재 온도 확인
    int getCurrTemp() {
        return currTemp;
    }
    // 설정 온도 확인
    int getSetTemp() {
        return setTemp;
    }
}
