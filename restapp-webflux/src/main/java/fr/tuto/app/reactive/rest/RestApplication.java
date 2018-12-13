package fr.tuto.app.reactive.rest;

import fr.tuto.app.reactive.rest.client.ProductWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {

    public static void main(String[] args) {

        SpringApplication.run(RestApplication.class, args);
        ProductWebClient gwc = new ProductWebClient();
        System.out.println(gwc.getResult());
    }
}
