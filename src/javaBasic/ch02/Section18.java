package javaBasic.ch02;

import java.util.Calendar;

public class Section18 {
    static class Company{
       private static Company instance = new Company();
       private Company(){};

       public static Company getInstance(){
           return instance;
       }
    }

    public static void main(String[] args) {
        Company comp1 = Company.getInstance();
        Company comp2 = Company.getInstance();

        System.out.println("comp2 = " + comp2);
        System.out.println("comp1 = " + comp1);
    }
}
