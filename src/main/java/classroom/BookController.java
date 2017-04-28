package classroom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

  private final BookRepository repository;

  public BookController(BookRepository repository) {
    this.repository = repository;
  }

  @GetMapping("")
    public Iterable<Book> all() {
      // @RequestParam("sort-by") String sortBy
      return this.repository.findAll();
    }


  @GetMapping("/{id}")
    public Book getOneBook(@PathVariable String id) {
      Long bookId = Long.parseLong(id);
      return this.repository.findOne(bookId);
    }


  @PostMapping("")
    public Book createNewBook(@RequestBody Book book) {
      return this.repository.save(book);
    }

  @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
      Long bookId = Long.parseLong(id);
      this.repository.delete(bookId);
    }
}
