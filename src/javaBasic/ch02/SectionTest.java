package javaBasic.ch02;

public class SectionTest {
    static class Test{
        public Test t = new Test();
        private Test(){};
    }

    public static void main(String[] args) {
        Test ts = new Test();
        Test t = ts.t;
        Test tt = ts.t.t;
        Test ttt = ts.t.t.t;

        System.out.println(t);
        System.out.println(tt);
        System.out.println(ttt);
    }
}
