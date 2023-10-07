package me.dio.service;

import me.dio.domain.model.Book;

public interface BookService {
    Book findById(Long id);

    Book create(Book bookToCreate);
}
