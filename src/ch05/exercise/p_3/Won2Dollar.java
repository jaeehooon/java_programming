package ch05.exercise.p_3;

/**
 * Converter 클래스를 상속받아 원화를 달러로 변환해주는 Won2Dollar 클래스
 */
public class Won2Dollar extends Converter {
    // 필드

    // 생성자
    public Won2Dollar(int ratio) {
        this.ratio = ratio;             // 환율
    }

    /**
     * 원화를 인자로 받아 달러로 변환하는 메소드
     *
     * @param src       원화
     * @return          달러로 변환한 값
     */
    @Override
    protected double convert(double src) {
        return src / this.ratio;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }

    public static void main(String[] args) {
        Won2Dollar toDollar = new Won2Dollar(1200);         // Won2Dollar 객체 생성
        toDollar.run();             // 변환 실행
    }
}
