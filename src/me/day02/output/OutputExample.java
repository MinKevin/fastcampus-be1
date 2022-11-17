package me.day02.output;

public class OutputExample {
    public static void main(String[] args) {
        int month = 2; // 1 ~ 12
        int day = 10; //  1 ~ 31

        // %d: decimal (10진수)
        System.out.printf("%02d월 %2d일\n", month, day);

        month = 12;
        day = 31;
        System.out.printf("%2d월 %2d일\n", month, day);

        // 10 (4byte) -> 00000000 00000000 00000000 00000000


        // %x: hex (16진수)
        System.out.printf("%x월 %x일\n", month, day);

        // %o: octal (8진수)
        System.out.printf("%o월 %o일\n", month, day);


        final double PI = 123.1415927;
        System.out.printf("%.3f\n", PI);
        System.out.printf("%e\n", PI);


    }
}
