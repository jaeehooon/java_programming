package ch05.example.ex_5_6;

/**
 * Weapon 클래스를 상속받고, 대포를 표현하는 클래스
 *
 */
class Cannon extends Weapon {
    @Override
    protected int fire() {
        return 10;              // 대포는 한 번에 10명을 살상
    }
}
