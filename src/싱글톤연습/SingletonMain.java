package 싱글톤연습;
// 프로그램 전체에서 단 하나의 객체로 존재
// 장점 : 메모리 절약, 클래스간의 데이터 공유가 주 목적
public class SingletonMain {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        test1.setInfo("동그라미", 27);
        test2.viewInfo();
    }
}
