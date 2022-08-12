package 평가1_2번;
public class Circle {
    // 접근제한자 (+), 더 이상 변경 불가능 하도록 final 로 선언 함.
    public final static double PI = 3.14;
    // 접근제한자(-), 클래스 내부에서만 젒근 가능 (문제 1번)
    private double radius;
    // 기본 생성자가 아니고 매개변수가 있는 생성자임(문제 2번)
    public Circle(double radius) {
        this.radius = radius;
    }
    // 세터/게터는 인스턴스 필드에 대하서 값을 읽거나 쓰기 위한 메소드를 만드는 것
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
    }
}