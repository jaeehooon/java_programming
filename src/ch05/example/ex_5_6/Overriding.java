package ch05.example.ex_5_6;

/**
 * 예제 5-6 | 메소드 오버라이딩
 *
 */
public class Overriding {
    public static void main(String[] args) {
        Weapon weapon;
        weapon = new Weapon();          // weapon 객체 생성
        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());

        weapon = new Cannon();         // Cannon 객체 생성
        System.out.println("대포의 살상 능력은 " + weapon.fire());
    }
}
