package me.kopz.geofinder.service;

import me.kopz.geofinder.client.CountriesClient;
import me.kopz.geofinder.domain.Country;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class WebClientService {

  private final CountriesClient countriesClient;

  public WebClientService(CountriesClient countriesClient){
    this.countriesClient = countriesClient;
  }

  public Mono<Country> checkCountryByName(String name){
    return countriesClient.findCountryByName(name);
  }
}