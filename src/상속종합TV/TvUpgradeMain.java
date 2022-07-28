package 상속종합TV;
// 상속 : Protype TV로 부터 상속 받아서 Product TV를 만듬
// 오버라이딩 : 채널 설정을 499개에서 999개로 변경 함 (부모의 메소드 재정의)
// 오버로딩 : 채널 설정을 오버로딩해서 인터넷 모드를 추가
// (동일한 메소드를 매개변수의 개수나 타입으로 자동 호출함)
// Product TV생성자 호출 시 부모의 생성자를 호출 함(super())
public class TvUpgradeMain {
    public static void main(String[]args) {
        ProductTV lgTV = new ProductTV("우리집 TV");
        lgTV.setPower(true);
        lgTV.setVolume(45);
        lgTV.setChannel(3, true);
        lgTV.viewTV();
    }
}
