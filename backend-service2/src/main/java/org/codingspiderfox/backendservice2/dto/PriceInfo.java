package org.codingspiderfox.backendservice2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceInfo {

  private long id;
  private String country;
  private float price;
  private String currencyShort;

}
