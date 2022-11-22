package me;

import java.util.Objects;

public class Studying {

    static class Student {
        String ID;
        String name;
        int age;

        public Student(String ID, String name, int age) {
            this.ID = ID;
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Student student1; // 객체 변수
        Student student2; // 객체 변수

        // 인스턴스화
        // student1는 Student 클래스의 인스턴스화 (객체에 메모리를 할당)
        student1 = new Student("0001", "John",  30);
        // student2는 Student 클래스의 인스턴스화 (객체에 메모리를 할당)
        student2 = new Student("0002", "James", 50);
    }
}
