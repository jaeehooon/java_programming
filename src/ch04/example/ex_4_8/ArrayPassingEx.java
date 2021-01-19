package ch04.example.ex_4_8;

/**
 * 예제 4-8 | 인자로 배열이 전달되는 예
 */
public class ArrayPassingEx {
    /**
     * 인자로 입력받은 배열 a의 공백문자를 ','로 변경하는 메소드
     *
     * @param a     문자들을 담은 배열
     */
    static void replaceSpace(char a[]) {
        for(int i=0; i<a.length; i++)       // 배열의 크기만큼 루프를 돈다.
            if (a[i] == ' ')        // 배열의 원소가 공백문자이면
                a[i] = ',';         // 공백문자를 쉼표(,)로 변경
    }

    /**
     * 인자로 받은 배열 a의 문자들을 화면에 출력하는 메소드
     *
     * @param a     문자들을 담은 배열
     */
    static void printCharArray(char a[]) {
        for(int i=0; i<a.length; i++)   // 배열의 크기만큼 루프를 돈다.
            System.out.print(a[i]);     // 배열 원소 문자 출력
        System.out.println();
    }

    public static void main(String[] args) {
        char[] c= {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.'};
        printCharArray(c);            // 원래 배열 원소 출력
        replaceSpace(c);              // 공백 문자 바꾸기
        printCharArray(c);              // 수정된 배열 원소 출력
    }
}
