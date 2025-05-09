package me.kopz.geofinder.client;

import me.kopz.geofinder.domain.Country;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
public class CountriesClient {

  private final WebClient webClient;

  public CountriesClient(WebClient webClient){
    this.webClient = webClient;
  }

  public Mono<Country> findCountryByName(String name){

    return webClient
        .get()
        .uri("/{name}", name.toLowerCase())
        .accept(APPLICATION_JSON)
        .retrieve()
        .onStatus(HttpStatusCode::is4xxClientError, error -> Mono.error(new RuntimeException("Please specify a valid name")))
        .bodyToFlux(Country.class)
        .next();
  }
}
