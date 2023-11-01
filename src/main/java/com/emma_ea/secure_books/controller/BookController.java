package com.emma_ea.secure_books.controller;

import com.emma_ea.secure_books.entity.Book;
import com.emma_ea.secure_books.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    private BookRepository repository;


    @GetMapping
    public Iterable<Book> getBooks() {
        return repository.findAll();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return repository.save(book);
    }

    @GetMapping("/{bookId}")
    public Book getBook(@PathVariable Long bookId) {
        return repository.findById(bookId).orElseThrow(RuntimeException::new);
    }

    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable Long bookId) {
        repository.deleteById(bookId);
    }
}
