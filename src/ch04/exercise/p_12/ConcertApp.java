package ch04.exercise.p_12;
import ch04.exercise.p_12.reservation.BookingSystem;

/**
 * 실습 문제 12번
 *
 * 간단한 콘서트 예약 시스템 프로그램
 */
public class ConcertApp {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();       // 예약시스템 객체 생성
        system.run();                                       // 프로그램 실행
    }
}
