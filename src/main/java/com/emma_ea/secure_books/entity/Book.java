package com.emma_ea.secure_books.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Book {
    @Id
    private long bookId;
    private String bookAuthor;
    private String bookTitle;
    private String bookPublisher;
}
