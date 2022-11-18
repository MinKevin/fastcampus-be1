package javaBasic.ch02;

public class Section10 {
    private int month;
    public static class test1{
        private int n2 = 2;
    }

    public static class test2{
        test1 test = new test1();
        Section10 st = new Section10();
        int n1 = test.n2;
        int n2 = st.month;
    }

    public static void main(String[] args) {
        Section10 st = new Section10();
        test1 test1 = new test1();
        int n1 = test1.n2;
        int n2 = st.month;
    }
}
