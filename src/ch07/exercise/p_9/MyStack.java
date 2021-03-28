package ch07.exercise.p_9;
import java.util.Vector;

/**
 * IStack<T>를 구현한 MyStack 클래스
 *
 * Vector 컬렉션을 통해 스택을 구현하고, pop, push 메소드가 포함된다.
 */
class MyStack<T> implements IStack<T> {
    // 필드
    private Vector<T> v;            // Vector 컬렉션 객체 레퍼런스

    // 생성자
    public MyStack() {              // 기본 생성자
        v = new Vector<T>();        // Vector 객체 생성
    }

    /**
     * Vector 컬렉션에 요소를 pop하는 메소드
     *
     * @return      컬렉션의 마지막 요소
     */
    @Override
    public T pop() {
        if (getSize() != 0)             // 현재 Vector 컬렉션에 요소가 있으면
            return v.remove(this.getSize() - 1);
        return null;                   // 요소가 없으면 null 반환
    }

    /**
     * Vector 컬렉션에 T 객체 요소를 push하는 메소드
     *
     * @param ob        T 타입의 요소
     * @return          요소를 추가하면 true,
     *                  추가하지 못하면 false 반환
     */
    @Override
    public boolean push(T ob) {
        return v.add(ob);
    }

    /**
     * 현재 Vector 컬렉션의 사이즈를 반환하는 메소드
     *
     * @return      현재 Vector의 사이즈
     */
    private int getSize() {
        return v.size();
    }
}
