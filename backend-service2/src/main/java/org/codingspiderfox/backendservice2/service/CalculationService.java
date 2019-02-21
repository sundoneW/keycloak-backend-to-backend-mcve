package org.codingspiderfox.backendservice2.service;

import org.codingspiderfox.backendservice2.dto.PriceInfo;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

  public PriceInfo convertToEur(PriceInfo priceInChf) {

    //TODO get real currency exchange factor
    float factor = 0.1f;
    return new PriceInfo(0, "GER",priceInChf.getPrice() * factor,
        "EUR");
  }
}
