package com.emma_ea.secure_books.repository;

import com.emma_ea.secure_books.entity.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends
        PagingAndSortingRepository<Book, Long> { }
