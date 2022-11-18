package javaBasic.ch02;

public class Section20 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int arr2[] = new int[10];

        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < 26; i++)
            alphabets[i] = (char)(ch + i);
    }
}
