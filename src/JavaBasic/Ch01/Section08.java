package JavaBasic.Ch01;

public class Section08 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

        //char의 수의 범위는 양수이므로 음수는 입력 불가
        //char ch4 = -66;

        char ch5 = '한';
        char ch6 = '\ud55C';

        System.out.println(ch5);
        System.out.println(ch6);
    }
}
//result
//        A
//        65
//        B
//        67
//        C
//        한
//        한
