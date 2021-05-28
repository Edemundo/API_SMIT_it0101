package com.smads.covs.it_0101smit.models.siscr;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Encaminhamento {

  @Id
  private int ciEncaminhamento;
  private String dcEncaminhamento;

  public Encaminhamento() {
  }

  public int getCiEncaminhamento() {
    return ciEncaminhamento;
  }

  public void setCiEncaminhamento(int ciEncaminhamento) {
    this.ciEncaminhamento = ciEncaminhamento;
  }

  public String getDcEncaminhamento() {
    return dcEncaminhamento;
  }

  public void setDcEncaminhamento(String dcEncaminhamento) {
    this.dcEncaminhamento = dcEncaminhamento;
  }

  @Override
  public String toString() {
    return "Encaminhamento{" +
      "ciEncaminhamento=" + ciEncaminhamento +
      ", dcEncaminhamento='" + dcEncaminhamento + '\'' +
      '}';
  }
}
