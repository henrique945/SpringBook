package com.example.aula4.repository;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.example.aula4.models.Book;

/**
 * BookRepository
 */
@Repository
public class BookRepository {

    public HashMap<Integer, Book> hm = new HashMap<Integer, Book>();

    public BookRepository(){
    }

    /**
     * Função para criar um livro
     */
    public void createBook(String name, String autor, int paginas){
        hm.put(hm.size()+1, new Book(hm.size()+1, name, autor, true, paginas));
    }

    /**
     * Função para selecionar todos os livros
     */
    public ArrayList<Book> getAllBooks(){
        return new ArrayList<Book>(hm.values());
    }
    
}