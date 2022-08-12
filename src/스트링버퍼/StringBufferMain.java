package 스트링버퍼;
// StringBuffer() : 문자열을 추가하거나 변경할 때 사용
public class StringBufferMain {
    public static void main(String[] args) {
        // StringBuilder 성능이 우수하지만 싱글 쓰레드용
        // StringBuffer 멀티 쓰레드용
        // delete(시작인덱스, 끝인덱스) : 전달된 인덱스의 문자열을 제거
        // insert(인덱스, "추가할 문자열") : 문자열 삽입
        // substring(시작인덱스, 끝인덱스) : 문자열 자르기
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("Java");
        sb.append("^^");
        sb.delete(0, 5); // 시작 인덱스에서 끝 인덱스 미만까지 삭제
        sb.insert(0, "Hi^^ ");
        System.out.println(sb);
        System.out.println(sb.substring(0, 8)); // 문자열 자르기
    }
}
