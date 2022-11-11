package me.day05.dowhile;

public class DoWhileExample {
    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println("hello");
            i++;
        } while (i < 0); // 조건 참일 때 진행

        System.out.println("i = " + i);
        System.out.println();;

        i = 0;
        while (true) { // 무한 루프
            System.out.println("hello");
            i++;

            if (!(i < 0)) break; // i >= 0, 조건이 참일 때 빠져나옴
        }
        System.out.println("i = " + i);
        System.out.println();
    }
}
