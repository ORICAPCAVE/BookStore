package team3.bookstore.bookstore.repositories;

import org.springframework.data.repository.CrudRepository;
import team3.bookstore.bookstore.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
