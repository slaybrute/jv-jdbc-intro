package mate.academy.service;

import java.util.List;
import java.util.Optional;
import mate.academy.model.Book;

public interface BookService {
    Book create(Book book);

    Optional<Book> findBy(Long id);

    List<Book> findAll();

    Book update(Book book);

    boolean deleteById(Long id);

}
