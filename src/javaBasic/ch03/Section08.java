package javaBasic.ch03;

public class Section08 {
    static class Parent{
        Parent(){
            System.out.println("Parent");
        }
    }

    static class Child1 extends Parent{
        Child1(){
            System.out.println("Child1");
        }
        public void childMtd(){
            System.out.println("childMtd");
        }
    }

    static class Child2 extends Parent{
        Child2(){
            System.out.println("Child1");
        }
        public void childMtd(){
            System.out.println("childMtd");
        }
    }

    static class Child3 extends Parent{
        Child3(){
            System.out.println("Child1");
        }
        public void childMtd(){
            System.out.println("childMtd");
        }
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        //아래는 당연히 오휴
        //parent.childMtd();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();

        //원래 Child의 메서드를 가지고 있었지만,
        //메모리에 매칭이 되지 않은 상태였으므로
        //이를 자식 클래스로 형변환 시 매칭되서 사용 가능

        System.out.println(child1 instanceof Parent);
        //System.out.println(child2 instanceof Child1);
        //
        //
        // System.out.println(Parent instanceof child1);

    }
}
