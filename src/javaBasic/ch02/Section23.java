package javaBasic.ch02;

import java.util.ArrayList;

public class Section23 {
    public static void main(String[] args) {
        ArrayList<Section21.Book> library = new ArrayList<Section21.Book>();

        library.add(new Section21.Book("A1", "T1"));
        library.add(new Section21.Book("A2", "T2"));
        library.add(new Section21.Book("A3", "T3"));
        library.add(new Section21.Book("A4", "T4"));
        library.add(new Section21.Book("A5", "T5"));

        for (int i = 0; i < library.size(); i++){
            library.get(i).showBookInfo();
        }

//        title = A1
//        author = T1
//        title = A2
//        author = T2
//        title = A3
//        author = T3
//        title = A4
//        author = T4
//        title = A5
//        author = T5

    }
}
