package me.day02.output;

public class OutputExample {
    public static void main(String[] args){
        int month = 10;
        int day = 20;

        System.out.printf("%d월 %d일\n", month, day);

        // %x : hex(16진수)
        System.out.printf("%#x월 %#x일\n", month, day);

        // %o : octal(8진수)
        System.out.printf("%#o월 %#o일\n", month, day);

        Math.min(1, 2);
    }
}
