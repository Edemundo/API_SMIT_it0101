package com.smads.covs.it_0101smit.models.views;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v_subprefeitura_dm")
public class VSubprefeituraDm {

  @Id
  private Integer cdSubprefeitura;
  private String nmSubprefeitura;

  public VSubprefeituraDm() {
  }

  public Integer getCdSubprefeitura() {
    return cdSubprefeitura;
  }

  public void setCdSubprefeitura(Integer cdSubprefeitura) {
    this.cdSubprefeitura = cdSubprefeitura;
  }

  public String getNmSubprefeitura() {
    return nmSubprefeitura;
  }

  public void setNmSubprefeitura(String nmSubprefeitura) {
    this.nmSubprefeitura = nmSubprefeitura;
  }

  @Override
  public String toString() {
    return "VSubprefeituraDm{" +
      "cdSubprefeitura=" + cdSubprefeitura +
      ", nmSubprefeitura='" + nmSubprefeitura + '\'' +
      '}';
  }
}
