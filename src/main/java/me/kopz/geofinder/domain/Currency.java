package me.kopz.geofinder.domain;

public class Currency {

  private String name;
  private String symbol;

  public String getSymbol() {
    return symbol;
  }

  public Currency(String name, String symbol){
    this.name = name;
    this.symbol = symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
