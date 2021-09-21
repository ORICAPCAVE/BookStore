package team3.bookstore.bookstore.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import team3.bookstore.bookstore.domain.Author;
import team3.bookstore.bookstore.domain.Book;
import team3.bookstore.bookstore.repositories.AuthorRepository;
import team3.bookstore.bookstore.repositories.BookRepository;
import team3.bookstore.bookstore.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository = null;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        /*this.publisherRepository = publisherRepository;*/
    }

    @Override
    public void run(String... args) throws Exception {

        Author Erich = new Author("Eric", "Gamma");
        Book DP = new Book("Design Patterns",  "0-201-63361-2");
        Erich.getBooks().add(DP);
        DP.getAuthors().add(Erich);

        /*authorRepository.save(Erich);
        bookRepository.save(DP);*/

        Author Wallis = new Author("Wallis", "Budge");
        Book BLAH = new Book("Babylonian Life And History", "-13:978-0-7607-6549-4");
        Wallis.getBooks().add(BLAH);
        BLAH.getAuthors().add(Wallis);

        /*authorRepository.save(Wallis);
        bookRepository.save(BLAH);*/





        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());

    }
}
