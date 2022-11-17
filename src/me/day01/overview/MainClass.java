package me.day01.overview;

/**
 * @class: MainClass
 * This is MainClass for overview
 * */
public class MainClass { // 클래스 이름 (Camel Upper Case == Pascal Case)
    public static int a = 0;

    /**
     * @method: main
     * @param: String[] args
     * This is main method for overview
     * */
    public static void main(String[] args) { // 메소드 이름 (Camel Lower Case) ex) calculateAverage
        System.out.println("한국어"); // 실행화면 출력 + 엔터
        System.out.print("한국어"); // 실행화면 출력
        System.out.println("한국어");
        // 한: 2byte (완성형)
        // ㅎ + ㅏ + ㄴ: 3byte (조합형)

        // 변수 (변할 수 있는 수를 저장하는 공간)
        // 변수 선언
        String str1; // 변수 선언
        str1 = "Hello Java!"; // 데이터 (리터럴, literal) 할당
        str1 = "Hello Python!";
        System.out.println(str1);

//        String str1;
        String STR1; // 변수 scope

        // 상수 (변할 수 없는 수를 저장하는 공간)
        final String CONST_STRING; // 상수 선언
        CONST_STRING = "Hello Java!"; // 데이터 (리터럴, literal) 할당 (마지막)
//      CONST_STRING = "Hello Python!"; // 컴파일 오류

        //int a = 10;
        //int a = 10;



        if (true) {
            int a = 10;
            System.out.println(a);
        }

        for (int i = 0; i < 10; i++) {
            int a = 10;
            System.out.println(a);
        }


        /*
        ㅁㄴㅇㅁㄴ
        ㅁㄴㅇㅁㄴㅇ
        ㅁㄴㅇㅁㄴㅇ
        ㅁㄴㅇㅁㄴㅇ
        */

    }

}
