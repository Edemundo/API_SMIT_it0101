package com.smads.covs.it_0101smit.models.views;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v_distrito_dm")
public class VDistritoDm {

  @Id
  private Integer nrDistrito;
  private String nmDistrito;

  public VDistritoDm() {
  }

  public Integer getNrDistrito() {
    return nrDistrito;
  }

  public void setNrDistrito(Integer nrDistrito) {
    this.nrDistrito = nrDistrito;
  }

  public String getNmDistrito() {
    return nmDistrito;
  }

  public void setNmDistrito(String nmDistrito) {
    this.nmDistrito = nmDistrito;
  }

  @Override
  public String toString() {
    return "VDistritoDm{" +
      "nrDistrito=" + nrDistrito +
      ", nmDistrito='" + nmDistrito + '\'' +
      '}';
  }
}
