package ch05.example.ex_5_2;

class Person {
    // 필드
    private int weight;         // private 접근 지정. Student 클래스에서 접근 불가
    int age;                    // default 접근 지정. Student 클래스에서 접근 가능
    protected int height;       // protected 접근 지정. Student 클래스에서 접근 가능
    public String name;         // public 접근 지정. Student 클래스에서 접근 가능

    /**
     * private 멤버인 weight 에 접근하기 위한 getter, setter 메소드
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return this.weight;
    }
}
