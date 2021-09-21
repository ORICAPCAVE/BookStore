package team3.bookstore.bookstore.repositories;

import org.springframework.data.repository.CrudRepository;
import team3.bookstore.bookstore.domain.Book;

/**
 * Created by LKL on 09/18/2021 from https://www.youtube.com/watch?v=xaR7Nk0E1Aw&t=3114s
 */


public interface BookRepository extends CrudRepository <Book, Long>{

}