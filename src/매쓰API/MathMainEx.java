package 매쓰API;
// Math 클래스 : 수학에서 자주 사용하는 메소드를 모아 둔 것
// static 메소드 이므로 객체 생성없이 사용 가능
// random() : 0.0 ~ 1.0 미만의 임의의 double 형 값을 생성하여 반환
// abs() : 절대값 구하기(전달된 값이 음수이면 양수로 반환, 양수면 그냥 양수)
// floor() : 소수점 이하를 무조건 날림
// ceil() : 소수점이하가 있으면 무조건 올림
// round() : 전달 받은 실수를 소수점 첫째 자리에서 반올림
// max() : 전달된 두 값을 비교하여 큰 값을 반환
// min() : 전달된 두 값을 비교하여 작은 값을 반환
public class MathMainEx {
    public static void main(String[] args) {
        System.out.println(Math.round(10.0999));     // 10
        System.out.println(Math.round(10.43333));     // 10
        System.out.println(Math.round(10.56666));     // 11
    }
}
