package ch05.exercise.p_1;

/**
 * TV를 나타내는 클래스
 *
 * TV size를 인자로 받아 객체를 생성한다.
 */
class TV {
    // 필드
    private int size;

    // 생성자
    public TV(int size) {
        this.size = size;
    }

    /**
     * Getter 메소드
     */
    protected int getSize() {
        return size;
    }
}
