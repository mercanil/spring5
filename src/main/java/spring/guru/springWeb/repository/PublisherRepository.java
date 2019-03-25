package spring.guru.springWeb.repository;

import org.springframework.data.repository.CrudRepository;
import spring.guru.springWeb.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher , Long> {
}
