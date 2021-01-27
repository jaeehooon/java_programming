package ch05.example.ex_5_8;

/**
 * PDA 클래스를 상속받고, MoblilePhoneInterface, MP3Interface 인터페이스 클래스를 구현한 클래스
 * 각 인터페이스에 선언된 메소드를 모두 구현한다.
 */
public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

    /**
     *  MobilePhoneInterface 추상 메소드 구현
     */
    @Override
    public void sendCall() {
        System.out.println("전화 걸기");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 받기");
    }

    @Override
    public void sendSMS() {
        System.out.println("SMS 보내기");
    }

    @Override
    public void receiveSMS() {
        System.out.println("SMS 받기");
    }


    /**
     * MP3Interface 의 추상 메소드 구현
     */
    @Override
    public void play() {
        System.out.println("음악 재생");
    }

    @Override
    public void stop() {
        System.out.println("재생 중지");
    }

    /**
     * SmartPhone 클래스의 고유 메소드
     * 일정 관리를 하는 메소드
     */
    public void schedule() {
        System.out.println("일정 관리");
    }
}
