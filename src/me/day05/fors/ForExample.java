package me.day05.fors;

public class ForExample {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.printf("[%d] hello\n", i);
        }
        System.out.println();

        for(int i = 1; i <= 5; i++) {
            System.out.printf("[%d] hello\n", i);
        }
        System.out.println();

        for(int i = 5; i > 0; i--) {
            System.out.printf("[%d] hello\n", i);
        }
        System.out.println();

    }
}
