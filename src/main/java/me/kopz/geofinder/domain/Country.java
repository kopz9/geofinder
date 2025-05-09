package me.kopz.geofinder.domain;

import java.util.List;
import java.util.Map;

public class Country {

  private Name name;
  private Flags flags;
  private List<String> capital;
  private long population;
  private Map<String, String> languages;
  private Map<String, Currency> currencies;
  private String region;
  private List<String> borders;

  public Country(Name name, Flags flags, List<String> capital, long population, Map<String, String> languages, Map<String, Currency> currencies, String region, List<String> borders) {
    this.name = name;
    this.flags = flags;
    this.capital = capital;
    this.population = population;
    this.languages = languages;
    this.currencies = currencies;
    this.region = region;
    this.borders = borders;
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Flags getFlags() {
    return flags;
  }

  public void setFlags(Flags flags) {
    this.flags = flags;
  }

  public List<String> getCapital() {
    return capital;
  }

  public void setCapital(List<String> capital) {
    this.capital = capital;
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

  public Map<String, String> getLanguages() {
    return languages;
  }

  public void setLanguages(Map<String, String> languages) {
    this.languages = languages;
  }

  public Map<String, Currency> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(Map<String, Currency> currencies) {
    this.currencies = currencies;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public List<String> getBorders() {
    return borders;
  }

  public void setBorders(List<String> borders) {
    this.borders = borders;
  }
}
