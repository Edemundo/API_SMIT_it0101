package com.smads.covs.it_0101smit.models.siscr;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoProcura {

  @Id
  private int ciTipoProcura;
  private String dcTipoProcura;

  public TipoProcura() {
  }

  public int getCiTipoProcura() {
    return ciTipoProcura;
  }

  public void setCiTipoProcura(int ciTipoProcura) {
    this.ciTipoProcura = ciTipoProcura;
  }

  public String getDcTipoProcura() {
    return dcTipoProcura;
  }

  public void setDcTipoProcura(String dcTipoProcura) {
    this.dcTipoProcura = dcTipoProcura;
  }

  @Override
  public String toString() {
    return "TipoProcura{" +
      "ciTipoProcura=" + ciTipoProcura +
      ", dcTipoProcura='" + dcTipoProcura + '\'' +
      '}';
  }
}
