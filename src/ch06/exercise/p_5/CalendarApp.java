package ch06.exercise.p_5;
import java.util.Calendar;
/**
 * 실습문제 5번
 *
 * Calendar 객체를 다루는 프로그램
 * 현재 시간이 낮 12시 이전이면 "Good Morning",
 * 오후 6시 이전이면 "Good Afternoon",
 * 밤 10시 이전이면 "Good Evening",
 * 그 이후는 "Good Night"를 출력하는 프로그램
 *
 */
public class CalendarApp {
    // 필드

    // 생성자

    /**
     * Calendar 객체를 인자로 받고
     * 현재 시간을 출력한 뒤, 시간에 따라 메세지를 출력하는 메소드
     *
     * @param cal   Calendar 객체
     */
    public static void printNow(Calendar cal) {
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        System.out.print("현재 시간은 " + hourOfDay + "시 " + minute + "분입니다.\n");
        if (hourOfDay <= 12)
            System.out.println("Good Morning");
        else if (hourOfDay <= 18)
            System.out.println("Good Afternoon");
        else if (hourOfDay <= 22)
            System.out.println("Good Evening");
        else
            System.out.println("Good Night");
    }

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();      // Calendar 객체 생성
        printNow(now);
    }
}
