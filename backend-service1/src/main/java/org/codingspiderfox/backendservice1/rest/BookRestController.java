package org.codingspiderfox.backendservice1.rest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.codingspiderfox.backendservice1.dto.Book;
import org.codingspiderfox.backendservice1.dto.PriceInfo;
import org.jboss.logging.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookRestController {

  @GetMapping(value = "/book")
  public List<Book> getAllBooks() {

    return Arrays.asList(new Book(1, "Booktitle", "Author", Arrays.asList(
        new PriceInfo(1, "CHE", 1, "CHF"))));
  }

  @PostMapping(value = "/book")
  public Book addBook(@RequestBody Book book) {

    return book;
  }

}
