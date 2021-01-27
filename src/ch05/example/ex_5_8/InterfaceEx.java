package ch05.example.ex_5_8;

/**
 * 예제 5-8 | 인터페이스를 구현하고 동시에 클래스를 상속받는 사례
 */
public class InterfaceEx {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone();            // SmartPhone 객체 생성
        p.sendCall();       // 전화 걸기
        p.play();           // 음악 재생
        System.out.println(p.calculate(3, 5));  // 덧셈 수행
        p.schedule();       // 일정 관리
    }
}
