package ch05.example.ex_5_6;

/**
 * 무기를 표현하는 클래스
 * 살상능력을 반환하는 메소드를 포함한다.
 */
class Weapon {
    protected int fire() {
        return 1;               // 무기는 기본적으로 한 명만 살상
    }
}
