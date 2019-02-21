package org.codingspiderfox.backendservice2.service;

import java.util.Arrays;
import java.util.List;
import org.codingspiderfox.backendservice2.dto.Book;
import org.codingspiderfox.backendservice2.config.KeycloakClientCredentialsRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BackendService1Handler {

  public static final String URL = "http://localhost:10000/api/book";

  @Autowired
  private RestTemplateProvider restTemplateProvider;

  public List<Book> getAllBooks() {

    return Arrays.asList(new RestTemplate()
        .getForObject(URL, Book[].class));

  }

  public Book sendUpdatedPriceInfoForBook(Book bookWithUpdatedPriceInfo) {

    return restTemplateProvider.getDefaultRestTemplate()
        .postForObject(URL, bookWithUpdatedPriceInfo, Book.class);
  }

}
