package ch06.example.ex_6_6;

/**
 * 예제 6-6 | 박싱과 언박싱
 */
public class AutoBoxingUnBoxingEx {
    public static void main(String[] args) {
        int n = 10;
        Integer intObject = n;              // auto boxing
        System.out.println("intObject = " + intObject);

        int m = intObject + 10;             // auto unboxing
        System.out.println("m = " + m);
    }
}
