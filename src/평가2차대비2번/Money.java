package 평가2차대비2번;
// money 라는 인스턴스 필드는 접근제한자(private)구현 되어야 함
public class Money {
    public static final String UNIT = "원";
    private int money; // 요게 문제임(^^)
    public Money(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    // 클래스 메소드 or static 메소드
    public static String getUnit() {
        return UNIT;
    }
    public void print() {
        System.out.println(money + UNIT + "이 있습니다.");
    }
}
