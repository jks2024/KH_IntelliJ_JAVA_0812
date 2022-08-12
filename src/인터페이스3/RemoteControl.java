package 인터페이스3;
// 인터페이스에 포함되는 것들
// 상수 : 모든 필드는 자동으로 상수(final static)로 변환된다.
// 메소드 : 모든 메소드는 추상메소드로 변경된다. (자동으로 abstract 붙는다.)
// 디폴트메소드 : 구현부를 가짐. 상속 받은 클래스가 재정의 사용 가능
// 정적 메소드 : static, 객체와 상관없이 인터페이스 타입으로 사용
public interface RemoteControl {
    int MAX_VOLUME = 100; // 자동으로 final static 이 붙는다.
    int MIN_VOLUME = 0;
    void turnON();        // 자동으로 abstract 가 붙는다.
    void turnOFF();
    void setVolume(int volume);
    // 디폴트 메소드 : jdk 1.8 이후에 추가 됨, default 키워드를 사용 함
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    static void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }

}
