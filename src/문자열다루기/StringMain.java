package 문자열다루기;
// equals() : 문자열을 비교함(대소문자 구분)
// equalsIgnoreCase : 문자열을 비교 함(대소문자 구분 안함)
// indexOf() : 문자열에서 특정 문자/문자열이 시작되는 인덱스를 반환(연속해서 찾지 않는다)
// contains() : 문자열에서 특정 문자열이 포함되어 있는지 확인 (true/false)
// charAt() : 문자열에서 인덱스 위치의 문자를 반환
// replaceAll() : 문자열 중 특정 문자열을 다른 문자열로 변경(특정 문자열을 지울 때도 사용)
// replace() : 문자열 중 특정 문자열을 다른 문자열로 변경(특정 문자열을 지울 때도 사용)
// substring(5) : 문자열 중 특정 문자열을 뽑아 낼 때 사용 (해당 인덱스 부터 끝까지...)
// substring(5, 8) : 5에서 8미만까지 문자열을 뽑아 냄
// toUpperCase() / toLowerCase() : 문자열을 모두 대문자/ 모두 소문자로 변경
// trim() : 문자열의 앞/뒤의 공백을 제거
// split() : 문자열을 특정 구분자로 분리하는 메소드
// 문자열 포매팅 : String.format()와 System.out.printf()
// String.format() : 서식으로 문자열을 구성해서 결과를 반환하는 메소드
// System.out.printf() : 서식으로 문자열을 구성해서 결과 출력하는 메소드
// toCharArray() : 문자열의 문자 배열로 반환
public class StringMain {
    public static void main(String[] args) {
        String name = "Seoul City";
        char[] arrName = name.toCharArray();
        for(int i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i] + " ");
        }
    }
}
