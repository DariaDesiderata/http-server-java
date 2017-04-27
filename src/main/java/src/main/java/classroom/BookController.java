package classroom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BookController {

  @GetMapping("/books")
    public String getBooks(
      @RequestParam("sort-by") String sortBy) {
      return "List of books will be displayed here";
    }


  @GetMapping("/books/{id}")
    public String getOneBook(@PathVariable int id) {
      return "Info about one book will be here";
    }


  @PostMapping("/books")
    public String newBook() {
      return "You can add a book here";
    }

}
