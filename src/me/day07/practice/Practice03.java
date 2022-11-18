package me.day07.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br. readLine());

        int answer = 0;
        while(st.hasMoreTokens()){
            answer++;
            String nxt = st.nextToken();
            //System.out.println(nxt);
        }
        System.out.println(answer);
    }
}
