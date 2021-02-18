package ch05.exercise.p_9;

/**
 * Stack 인터페이스 클래스를 상속받아 스택 자료구조를 구현한 클래스
 */
class StringStack implements Stack {
    // 필드
    private int length;             // 현재 스택의 길이
    private int cap;                // 스택의 전체 저장 가능한 갯수
    private String[] stringStack;   // String 타입의 변수를 담는 배열

    // 생성자
    public StringStack() {}         // 기본 생성자
    public StringStack(int cap) {
        this.cap = cap;
        this.length = 0;
        stringStack = new String[cap];
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public int capacity() {
        return this.cap;
    }

    /**
     * 가장 마지막에 push한 문자열을 pop 하는 메소드
     * @return
     */
    @Override
    public String pop() {
        if (this.length > 0) {
            String last = stringStack[length - 1];
            stringStack[length - 1] = null;
            this.length--;
            return last;
        }
        return null;
    }

    /**
     * 사용자로부터 입력받은 문자열을 스택에 넣는 메소드
     *
     * @param val   문자열
     * @return      푸쉬에 성공하면 true,
     *              실패하면 false 반환
     */
    @Override
    public boolean push(String val) {
        if (this.length < this.cap) {
            stringStack[this.length] = val;
            this.length++;
            return true;
        }
        System.out.println("스택이 꽉 차서 푸시 불가!");
        return false;
    }

    /**
     * 현재 스택에 저장된 모든 문자열을 출력하는 메소드
     */
    public void printStack() {
        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        for(int i=this.length-1; i>=0; i--)
            System.out.print(stringStack[i] + " ");
        System.out.println();
    }
}
