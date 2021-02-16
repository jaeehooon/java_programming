package ch05.exercise.p_4;

/**
 * Converter 클래스를 상속받아 Km를 mile로 변환하는 Km2Mile 클래스
 */
public class Km2Mile extends Converter {
    // 필드

    // 생성자
    public Km2Mile(double ratio) {
        this.ratio = ratio;
    }

    @Override
    protected double convert(double src) {
        return (src / this.ratio);
    }

    @Override
    protected String getSrcString() {
        return "Km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }

    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6);          // Km2Mile 객체 생성
        toMile.run();                                   // 단위변환 실행
    }
}
