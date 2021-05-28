package com.smads.covs.it_0101smit.models.siscr;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoProvidencia {

  @Id
  private int ciTipoProvidencia;
  private String dcTipoProvidencia;

  public TipoProvidencia() {
  }

  public int getCiTipoProvidencia() {
    return ciTipoProvidencia;
  }

  public void setCiTipoProvidencia(int ciTipoProvidencia) {
    this.ciTipoProvidencia = ciTipoProvidencia;
  }

  public String getDcTipoProvidencia() {
    return dcTipoProvidencia;
  }

  public void setDcTipoProvidencia(String dcTipoProvidencia) {
    this.dcTipoProvidencia = dcTipoProvidencia;
  }

  @Override
  public String toString() {
    return "TipoProvidencia{" +
      "ciTipoProvidencia=" + ciTipoProvidencia +
      ", dcTipoProvidencia='" + dcTipoProvidencia + '\'' +
      '}';
  }
}
