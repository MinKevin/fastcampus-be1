package me.day06.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
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

        //강사님
        //        String[] answer = new Solution().solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28});
//        System.out.println(Arrays.toString(answer));

//        String[] answer2 = new Solution().solution(6, new int[] {46, 33, 33, 22, 31, 50}, new int[] {27, 56, 19, 14, 14, 10});
//        System.out.println(Arrays.toString(answer2));

        String[] answer1 = new Solution1().solution(6,
                new int[] {65535, 65535, 65535, 65535, 65535, 65535},
                new int[] {65535, 65535, 65535, 65535, 65535, 65535});
        System.out.println(Arrays.toString(answer1));

        String[] answer2 = new Solution2().solution(6,
                new int[] {65535, 65535, 65535, 65535, 65535, 65535},
                new int[] {65535, 65535, 65535, 65535, 65535, 65535});
        System.out.println(Arrays.toString(answer2));
    }
}

class Solution1 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String binaryString = Long.toBinaryString(arr1[i] | arr2[i]); // 비트 연산
//            System.out.println(binaryString.getBytes().length); // 16 바이트

            binaryString = String.format("%" + n + "s", binaryString);

            binaryString = binaryString.replace("1", "#");
            binaryString = binaryString.replace("0", " ");
            answer[i] = binaryString;
        }

        return answer;
    }
}

class Solution2 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String binaryString = Integer.toBinaryString(arr1[i] | arr2[i]); // 비트 연산
//            System.out.println(binaryString.getBytes().length); // 16 바이트

//            System.out.println(binaryString);
            // 최대 비트값: 1111111111111111
            // toBinaryString()를 통해 문자열로 변경: "1111111111111111"
            // 문자 하나당 1바이트 * 16개 => 총 16 바이트
            // int:  4 바이트
            // long: 8 바이트
            // 정확하게는 Integer.parseInt(binaryString), Long.parseLong(binaryString) 불가

            binaryString = String.format("%" + "0" + n + "d", new BigInteger(binaryString));
//            System.out.println(binaryString);
            binaryString = binaryString.replace("1", "#");
            binaryString = binaryString.replace("0", " ");
            answer[i] = binaryString;
        }

        return answer;
    }
}




