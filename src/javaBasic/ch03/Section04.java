package javaBasic.ch03;

public class Section04 {

    static class Parent{
        public void method(){
            System.out.println("Parent");
        }
    }

    static class Child extends Parent{
        @Override
        public void method(){
            System.out.println("Child");
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Child();
        child.method(); //Child
        parent.method(); //Chlid
    }
}
