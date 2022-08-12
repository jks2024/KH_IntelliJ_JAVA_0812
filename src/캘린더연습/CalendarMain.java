package 캘린더연습;

import 자동차종합연습.Car;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Calendar 클래스 : 정적메소드인 getInstance()를 이용하여 현재 운영체제에
// 설정된 시간을 기준으로 Calendar 하위 객체를 얻을 수 있습니다
// 추상클래스 이므로 new 키워드를 사용해 객체를 생성 할 수 없습니다.
// (이유는 각 나라마다 날짜 및 시간을 표시하는 방법이 다르기 때문)
// 포함된 필드는 전부 클래스(static)변수 입니다.
public class CalendarMain {
    public static void main(String[]args) {
        // getInstance()는 정적메소드 이므로 클래스 이름을 사용한다.
        Calendar now = Calendar.getInstance();
//        System.out.println(now.get(Calendar.YEAR));
        // MONTH는 배열의 인덱스 이므로 실제 달을 표시 하려면 1을 더해야 함
//        System.out.println(now.get(Calendar.MONTH)+1);
//        System.out.println(now.get(Calendar.DAY_OF_MONTH));
//        System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 주에서 몇번째 날인지
//        System.out.println(now.get(Calendar.AM_PM));
//        System.out.println(now.get(Calendar.HOUR));
//        System.out.println(now.get(Calendar.MINUTE));
//        System.out.println(now.get(Calendar.SECOND));
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        System.out.println("오늘은 " + year + "년"
                + month + "월" + day + "일 입니다.");
        // Date 클래스를 이용한 방식
        Date now1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("오늘은 yyyy년M월d일 입니다");
        System.out.println(sdf.format(now1));


    }
}
