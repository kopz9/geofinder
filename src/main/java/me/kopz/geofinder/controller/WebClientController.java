package me.kopz.geofinder.controller;

import me.kopz.geofinder.domain.Country;
import me.kopz.geofinder.service.WebClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1")
public class WebClientController {

  private final WebClientService service;

  public WebClientController(WebClientService service){
    this.service = service;
  }

  @GetMapping("/{name}")
  public Mono<Country> checkCountryByName(@PathVariable String name){
    return service.checkCountryByName(name);
  }
}
