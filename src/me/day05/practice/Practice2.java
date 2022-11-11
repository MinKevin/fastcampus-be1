package me.day05.practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char inp = ' ';
        String answer = "";
        while (true) {
            inp = sc.next().charAt(0);
            if (inp == 'q')
                break;
            answer = inp + answer;
        }
        System.out.println(answer);
    }
}
