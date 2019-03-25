package spring.guru.springWeb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.guru.springWeb.repository.BookRepository;

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @RequestMapping(value = "/books")
    public String getBooks(Model m ){
        m.addAttribute("books" , bookRepository.findAll());
        return "books";
    }
}

