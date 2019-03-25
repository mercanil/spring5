package spring.guru.springWeb.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import spring.guru.springWeb.model.Author;
import spring.guru.springWeb.model.Book;
import spring.guru.springWeb.model.Publisher;
import spring.guru.springWeb.repository.AuthorRepository;
import spring.guru.springWeb.repository.BookRepository;
import spring.guru.springWeb.repository.PublisherRepository;


@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    private PublisherRepository publisherRepository;

    public DevBootStrap(AuthorRepository authorRepository,BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
    private void initData(){
        Publisher zara = new Publisher("Zara yayil" , "Zara");
        Author anilMercan = new Author("Anil","Mercan");
        Book firstBook = new Book("Domanin Driven Design","123123",zara);
        anilMercan.getBooks().add(firstBook);
        firstBook.getAuthors().add(anilMercan);

        authorRepository.save(anilMercan);
        publisherRepository.save(zara);
        bookRepository.save(firstBook);


        Publisher sivas = new Publisher("Sivas yayil" , "Sivas");
        Author nilayMercan = new Author("Nilay","Mercan");
        Book secondBook = new Book("Domanin Driven Implemet","434343",sivas);
        nilayMercan.getBooks().add(secondBook);
        secondBook.getAuthors().add(nilayMercan);

        authorRepository.save(nilayMercan);
        publisherRepository.save(sivas);
        bookRepository.save(secondBook);


    }

}
