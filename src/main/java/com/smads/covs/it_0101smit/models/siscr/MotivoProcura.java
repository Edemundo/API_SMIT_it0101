package com.smads.covs.it_0101smit.models.siscr;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MotivoProcura {

  @Id
  private int ciMotivoProcura;
  private String dcMotivoProcura;

  public MotivoProcura() {
  }

  public int getCiMotivoProcura() {
    return ciMotivoProcura;
  }

  public void setCiMotivoProcura(int ciMotivoProcura) {
    this.ciMotivoProcura = ciMotivoProcura;
  }

  public String getDcMotivoProcura() {
    return dcMotivoProcura;
  }

  public void setDcMotivoProcura(String dcMotivoProcura) {
    this.dcMotivoProcura = dcMotivoProcura;
  }

  @Override
  public String toString() {
    return "MotivoProcura{" +
      "ciMotivoProcura=" + ciMotivoProcura +
      ", dcMotivoProcura='" + dcMotivoProcura + '\'' +
      '}';
  }
}
