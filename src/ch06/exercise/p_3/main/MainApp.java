package ch06.exercise.p_3.main;

import ch06.exercise.p_3.etc.Calc;

public class MainApp {
    public static void main(String[] args) {
        Calc c = new Calc(10, 20);
        System.out.println(c.sum());
    }
}
