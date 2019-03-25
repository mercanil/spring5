package spring.guru.springWeb.repository;


import org.springframework.data.repository.CrudRepository;
import spring.guru.springWeb.model.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
