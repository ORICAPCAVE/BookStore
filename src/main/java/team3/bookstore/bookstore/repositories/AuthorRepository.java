package team3.bookstore.bookstore.repositories;

import team3.bookstore.bookstore.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by LKL on 09/18/2021 from https://www.youtube.com/watch?v=xaR7Nk0E1Aw&t=3114s
 */


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
