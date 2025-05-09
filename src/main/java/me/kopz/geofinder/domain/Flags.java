package me.kopz.geofinder.domain;

public class Flags {

  private String png;
  private String svg;

  public Flags(String png, String svg){
    this.png = png;
    this.svg = svg;
  }

  public String getPng() {
    return png;
  }

  public void setPng(String png) {
    this.png = png;
  }

  public String getSvg() {
    return svg;
  }

  public void setSvg(String svg) {
    this.svg = svg;
  }
}
