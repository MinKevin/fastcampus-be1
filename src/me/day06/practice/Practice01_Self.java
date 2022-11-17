package me.day06.practice;

import java.util.Scanner;

public class Practice01_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int STUDENTS = 10;
        int[] scores = new int[STUDENTS];
        //새로운 배열 객체를 생성하여 초기화 하므로 위에서 선언한 배열과 다른 배열이 저장됨
        scores = new int[] {90, 85, 80, 95, 100, 55, 60, 75, 90, 70, 100};
        System.out.println(scores.length);

        /*
        //따라서 아래와 같이 index를 통합 접근 후 초기화는 오류가 발생
        scores[11] = 100;
        System.out.println(scores.length);
         */

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("max = " + max(scores));
        System.out.println("min = " + min(scores));
        System.out.println("average = " + average(scores));
        System.out.println("derivation = " + derivation(scores));
        System.out.println("standard = " + standard(scores));

    }

    public static int max(int[] scores){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max)
                max = scores[i];
        }
        return max;
    }

    public static int min(int[] scores){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] < min)
                min = scores[i];
        }
        return min;
    }

    public static double average(int[] scores){
        double avg = 0;
        for (int i = 0; i < scores.length; i++)
            avg += scores[i] / scores.length;

        return avg;
    }

    public static double derivation(int[] scores){
        double avg = average(scores);
        double dev = 0;

        for (int i = 0; i < scores.length; i++){
            dev += Math.pow(scores[i] - avg, 2) / scores.length;
        }
        return dev;
    }

    public static double standard(int[] scores){
        return Math.sqrt(derivation(scores));
    }
}


