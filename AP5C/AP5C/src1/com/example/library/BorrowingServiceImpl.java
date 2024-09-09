package com.example.library;

import java.util.HashMap;
import java.util.Map;

public class BorrowingServiceImpl implements BorrowingService {

    private Map<String, Book> borrowedBooks = new HashMap<>();

    @Override
    public void borrowBook(Member member, Book book) {
        if (!book.isBorrowed()) {
            book.borrowBook();
            borrowedBooks.put(member.getMemberId(), book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    @Override
    public void returnBook(Member member, Book book) {
        if (borrowedBooks.containsKey(member.getMemberId())) {
            book.returnBook();
            borrowedBooks.remove(member.getMemberId());
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Book was not borrowed by this member.");
        }
    }
}
