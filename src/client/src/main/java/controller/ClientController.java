package client.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
import server.model.Restaurant;

public class ClientController {

    private static final String 
        SERVER_HOST = "localhost:8080",
        GET_RESTAURANTS_ENDPOINT = "restaurants";

    private final WebClient client;

    public ClientController() {
        this.client = WebClient.builder()
            .baseUrl(SERVER_HOST)
            .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();
    }
    
    public Mono<Restaurant[]> getRestaurants() {
        return client.get()
            .uri(GET_RESTAURANTS_ENDPOINT)
            .retrieve()
            .bodyToMono(Restaurant[].class);
    }

}
