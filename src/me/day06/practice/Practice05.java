package me.day06.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 제출 코드
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        String input = s;
        input = input.toLowerCase();

        int numA = (int)'a';
        int numZ = (int)'z';
        int num0 = (int)'0';
        int num9 = (int)'9';

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) >= numA && input.charAt(i) <= numZ ||
                input.charAt(i) >= num0 && input.charAt(i) <= num9)
                sb.append(input.charAt(i));
        }

        for (int i = 0; i < sb.length() / 2; i++){
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
 */

public class Practice05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        input = input.toLowerCase();

        int numA = (int)'a';
        int numZ = (int)'z';
        int num0 = (int)'0';
        int num9 = (int)'9';

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) >= numA && input.charAt(i) <= numZ ||
                    input.charAt(i) >= num0 && input.charAt(i) <= num9)
                sb.append(input.charAt(i));
        }

        for (int i = 0; i < sb.length() / 2; i++){
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}

