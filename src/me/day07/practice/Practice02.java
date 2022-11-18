package me.day07.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T, R;
        String answer[] = new String[1000];

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            String[] input = br.readLine().split(" ");
            R = Integer.parseInt(input[0]);
            answer[i] = "";

            for (int j = 0; j < input[1].length(); j++){
                for (int k = 0; k < R; k++){
                    //System.out.print(input[1].charAt(j));
                    answer[i] += input[1].charAt(j);
                }
            }
        }

        for (int i = 0; i < T; i++)
            System.out.println(answer[i]);
    }
}

