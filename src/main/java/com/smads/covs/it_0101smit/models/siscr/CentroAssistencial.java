package com.smads.covs.it_0101smit.models.siscr;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CentroAssistencial {

  @Id
  private int ciCentroAssistencial;
  private String nmCentroAssistencial;

  public CentroAssistencial() {
  }

  public int getCiCentroAssistencial() {
    return ciCentroAssistencial;
  }

  public void setCiCentroAssistencial(int ciCentroAssistencial) {
    this.ciCentroAssistencial = ciCentroAssistencial;
  }

  public String getNmCentroAssistencial() {
    return nmCentroAssistencial;
  }

  public void setNmCentroAssistencial(String nmCentroAssistencial) {
    this.nmCentroAssistencial = nmCentroAssistencial;
  }

  @Override
  public String toString() {
    return "CentroAssistencial{" +
      "ciCentroAssistencial=" + ciCentroAssistencial +
      ", nmCentroAssistencial='" + nmCentroAssistencial + '\'' +
      '}';
  }
}
