package javaBasic.ch02;

public class Section12 {
    static class Person{
        String name;
        int age;

        public Person(){
            this("JK", 29);
        }
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void showPerson(){
            System.out.println(name + ' ' + age);
        }

        public Person getPerson(){
            return this;
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();

        System.out.println(person);

        Person p2 = person.getPerson();
        System.out.println(p2);
    }
}
