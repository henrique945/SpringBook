package com.example.aula4.services;

import com.example.aula4.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula4.models.Book;
import java.util.ArrayList;

/**
 * BookService
 */
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * Cria um livro
     */
    public void createBook(String name, String autor, int paginas) {
        System.out.println(name);
        System.out.println(autor);
        System.out.println(paginas);
        bookRepository.createBook(name, autor, paginas);
    }

    /**
     * Busca e retorna todos os livros
     */
    public ArrayList<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }
}