package org.codingspiderfox.backendservice2;

import java.util.List;
import org.codingspiderfox.backendservice2.dto.Book;
import org.codingspiderfox.backendservice2.service.BackendService1Handler;
import org.codingspiderfox.backendservice2.service.CalculationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BackendService2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(BackendService2Application.class, args);


		BackendService1Handler backendService1Handler = ctx.getBean(BackendService1Handler.class);

		CalculationService calculationService = ctx.getBean(CalculationService.class);

		List<Book> books = backendService1Handler.getAllBooks();

		for (Book book : books) {

			book.getPrices().add(calculationService.convertToEur(book.getPrices().get(0)));
			backendService1Handler.sendUpdatedPriceInfoForBook(book);
		}
	}

}
