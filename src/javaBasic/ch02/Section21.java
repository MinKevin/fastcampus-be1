package javaBasic.ch02;

public class Section21 {
    static class Book {
        private String title;
        private String author;
        private int no;
        private static int serialNum = 1;

        public Book() {
            this.no = serialNum++;
        }

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void showBookInfo() {
            System.out.println("title = " + title);
            System.out.println("author = " + author);
        }
    }

    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("T", "a");
        library[1] = new Book("T", "a");
        library[2] = new Book("T", "a");
        library[3] = new Book("T", "a");
        library[4] = new Book("T", "a");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        for (var v : library){
            System.out.println(v);
            v.showBookInfo();
        }
        for (var v : copyLibrary){
            System.out.println(v);
            v.showBookInfo();
        }
    }
}

