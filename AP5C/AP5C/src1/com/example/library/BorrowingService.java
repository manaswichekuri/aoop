package com.example.library;

public interface BorrowingService  {
    void borrowBook(Member member, Book book);
    void returnBook(Member member, Book book);
}