package com.example.aula4.controllers;

import java.util.ArrayList;

import com.example.aula4.models.Book;
import com.example.aula4.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * BookController
 */
@Controller
public class BookController {

    @Autowired
    private BookService service;

    /**
     * Função para mostrar todos os livros (GET)
     */
    @GetMapping("/book")
    public ModelAndView getAllBooks(){
        ModelAndView mv = new ModelAndView("booksView");
        
        ArrayList<Book> listBooks = service.getAllBooks();

        mv.addObject("books", listBooks);
        return mv;
    }

    /**
     * Função para cadastrar livros (POST)
     */
    @PostMapping("/book")
    public ModelAndView createBook(@ModelAttribute Book book){
        ModelAndView mv = new ModelAndView("booksView");
        
        service.createBook(book.getNome(), book.getAutor(), book.getPaginas());

        ArrayList<Book> listBooks = service.getAllBooks();

        mv.addObject("books", listBooks);
        return mv;
    }


}