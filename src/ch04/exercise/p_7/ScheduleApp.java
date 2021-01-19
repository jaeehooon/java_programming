package ch04.exercise.p_7;
import java.util.Scanner;

/**
 * 실습 문제 7
 *
 * 하루의 할 일을 표현하는 Day 클래스를 이용하여 한 달의 할 일을 표현하는 스케줄 프로그램
 */
public class ScheduleApp {
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);                // 4월달의 할 일 스케줄 객체 생성
        april.run();                        // 스케줄 프로그램 실행
    }
}
