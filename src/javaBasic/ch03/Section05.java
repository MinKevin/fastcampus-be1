package javaBasic.ch03;

public class Section05 {
    static class TestMethod{
        int num;

        void aaa(){
            System.out.println("aaa() 메서드 호출");
        }
    }

    public static void main(String[] args) {
        TestMethod a1 = new TestMethod();
        a1.aaa();

        TestMethod a2 = new TestMethod();
        a2.aaa();
    }
}
