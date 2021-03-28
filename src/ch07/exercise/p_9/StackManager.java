package ch07.exercise.p_9;

/**
 * 실습문제 9번
 *
 * Vector 컬렉션을 이용하여 IStack<T> 인터페이스를 구현한 스택을 생성하고 출력하는 프로그램
 */
public class StackManager {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<Integer>();
        for(int i=0; i<10; i++)                 // 10개의 정수를 push 함
            stack.push(i);

        while(true) {                           // 스택이 빌 때까지 pop
            Integer n = stack.pop();
            if (n == null)                      // 스택이 빈 경우
                break;                          // 반복문 종료
            System.out.print(n + " ");
        }
    }
}
