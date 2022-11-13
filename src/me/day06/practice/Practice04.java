package me.day06.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String answer;
        String answer1 = st.nextToken();
        String answer2 = st.nextToken();
        int num1 = Integer.parseInt(answer1);
        int num2 = Integer.parseInt(answer2);

        boolean num1IsBig = false;
        for (int i = 0; i < 3; i++){
            if (num1 % 10 > num2 % 10){
                num1IsBig = true;
                break;
            }
            else if (num1 % 10 < num2 % 10)
                break;
            num1 /= 10;
            num2 /= 10;
        }


        if (num1IsBig == true)
            answer = answer1;
        else
            answer = answer2;

        for (int i = 0; i < 3; i++)
            System.out.print(answer.charAt(2 - i));
    }
}
