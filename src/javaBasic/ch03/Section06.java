package javaBasic.ch03;

import java.util.ArrayList;

public class Section06 {
    static class Animal{
        public void move(){
            System.out.println("동물이 움직입니다.");
        }
        public void eating(){

        }
    }

    static class Human extends Animal{
        public void move(){
            System.out.println("사람은 두발로 걷습니다.");
        }

        public void readBooks(){
            System.out.println("사람이 책을 읽습니다.");
        }
    }

    static class Tiger extends Animal{
        public void move(){
            System.out.println("호랑이가 네 발로 뜁니다.");
        }

        public void hunting(){
            System.out.println("호랑이가 사냥을 합니다.");
        }
    }
    static class Eagle extends Animal{
        public void move(){
            System.out.println("독수리가 하늘을 날아갑니다.");
        }
        public void flying(){
            System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
        }
    }

    public void moveAnimal(Animal animal){
        animal.move();
    }

    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        Section06 test = new Section06();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for (Animal animal : animalList)
            animal.move();

        System.out.println("--------------------------------");
        ArrayList<Animal> list = animalList;

        for(int i =0; i<list.size(); i++) {
            Animal animal = list.get(i);

            if (animal instanceof Animal){
                System.out.println("Animal\n");
            }

            if ( animal instanceof Human) {
                Human human = (Human)animal;
                human.readBooks();
            }
            else if( animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }
            else if( animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            }
            else {
                System.out.println("error");
            }

        }

    }
}


