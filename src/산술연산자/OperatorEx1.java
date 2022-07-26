package 산술연산자;
// 산술연산자 : 사칙연산과 나머지 연산
// 대입연산자 : 변수에 값을 대입하는 이항 연산자, 결합 방향은 오른쪽에서 왼쪽
// 증감연산자 : 단항연산자, 1씩 증가 또는 감소 시킬 때 사용 함. (전위와 후위 관계가 중요)
// 비교연산자 : >, <, >=, <=, !=, ==
// 논리연산자 : &&(AND 연산, 둘다 참인 경우 참), ||(OR 연산, A이거나 B, 둘중 하나만 참이면 참)
// !(NOT 부정의 연산자, 현재의 조건을 부정함)
// 삼항연산자 : 3개의 피연산자를 가짐.(조건문의 if ~ else 구문을 대체 함)
public class OperatorEx1 {
    public static void main(String[] args) {
        boolean isON = true;
        String strONOFF = (isON) ? "ON" : "OFF";
        System.out.println("전원 : " + strONOFF);
    }
}
