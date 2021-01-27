package ch05.example.ex_5_8;

/**
 * 전화기 인터페이스 역할을 하는 클래스
 */
interface PhoneInterface {
    // 필드
    int BUTTONS = 20;

    void sendCall();            // 전화하기
    void receiveCall();         // 전화받기
}

/**
 * 전화기 인터페이스 클래스를 상속받고, 핸드폰 역할을 하는 인터페이스 클래스
 */
interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();             // 문자(SMS) 보내기
    void receiveSMS();          // 문자(SMS) 받기
}
