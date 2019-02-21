package org.codingspiderfox.backendservice1.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

  private long id;
  private String title;
  private String author;
  private List<PriceInfo> prices;

}
