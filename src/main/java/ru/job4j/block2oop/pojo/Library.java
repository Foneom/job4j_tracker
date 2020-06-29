package ru.job4j.block2oop.pojo;

public class Library {

    public static void main(String[] args) {
        Book warAndPiece = new Book("Война и мир", 550);
        Book idiot = new Book("Идиот", 350);
        Book dogHeart = new Book("Собачье сердце", 400);
        Book cleanCode = new Book("CleanCode", 320);
            Book[] books = new Book[4];
            books[0] = warAndPiece;
            books[1] = idiot;
            books[2] = dogHeart;
            books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + ", " + book.getPage() + " стр.");
        }
        System.out.println("----------------------------------------------");
            Book temp;
            temp = books[0];
            books[0] = books[2];
            books[2] = temp;
                for (int index = 0; index < books.length; index++) {
                    Book book = books[index];
                        System.out.println(book.getName() + ", " + book.getPage() + " стр.");
        }
        System.out.println("----------------------------------------------");
            for (int index = 0; index < books.length; index++) {
                 Book book = books[index];
                    if (book.getName().equals("CleanCode")) {
                System.out.println(book.getName() + ", " + book.getPage() + " стр.");
            }
        }
    }
}
