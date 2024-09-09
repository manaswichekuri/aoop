package com.example.library;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        BorrowingService borrowingService = new BorrowingServiceImpl();

        borrowingService.borrowBook(member1, book1);
        borrowingService.borrowBook(member2, book2);

        borrowingService.returnBook(member1, book1);
        borrowingService.returnBook(member2, book2);
    }
}
