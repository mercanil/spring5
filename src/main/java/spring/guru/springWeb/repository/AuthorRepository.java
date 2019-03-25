package spring.guru.springWeb.repository;

import org.springframework.data.repository.CrudRepository;
import spring.guru.springWeb.model.Author;


public interface AuthorRepository extends CrudRepository<Author,Long> {
}
