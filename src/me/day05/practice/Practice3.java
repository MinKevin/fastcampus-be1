package me.day05.practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM = 5;
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < NUM; i++) {
            double inp = sc.nextDouble();
            if (inp < 0 || inp > 100){
                System.out.println("유효하지 않은 성적 입력값입니다.");
                sum = 0;
                i = -1;
                continue;
            }
            sum += inp;
        }
        avg = sum / NUM;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
