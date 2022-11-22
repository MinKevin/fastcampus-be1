package javaBasic.ch03;

public class Section03 {
    static class Parent{
        int pVar1;
        int pVar2;
        Parent(int pVar1, int pVar2){
            this.pVar1 = pVar1;
            this.pVar2 = pVar2;
        }
    }

    static class Son extends Parent{
        int sVar1 = 0;
        Son(int pVar1, int pVar2, int sVar1){
            super(pVar1, pVar2);
            sVar1 = 100;
        }
        public int getsVar1() {
            return sVar1;
        }
    }

    public static void main(String[] args) {
        Parent pr2 = new Son(50, 60, 100);
        //pr2.getsVar();
    }
}

