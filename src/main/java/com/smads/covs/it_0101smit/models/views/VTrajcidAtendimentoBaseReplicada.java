package com.smads.covs.it_0101smit.models.views;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "v_trajcid_atendimento_base_replicada")
public class VTrajcidAtendimentoBaseReplicada {

  @Id
  private Date dtPreAtendimento;
  private int ciAtendimento;
  private int ciCidadao;
  private int ciCentroAssistencial;
  private int cdSubprefeitura;
  private Date dtAtualizacao;
  private int ciTipoProcura;
  private int ciTipoProvidencia;
  private int ciMotivoProcura;
  private int ciEncaminhamento;

  public VTrajcidAtendimentoBaseReplicada() {
  }

  public Date getDtPreAtendimento() {
    return dtPreAtendimento;
  }

  public void setDtPreAtendimento(Date dtPreAtendimento) {
    this.dtPreAtendimento = dtPreAtendimento;
  }

  public int getCiAtendimento() {
    return ciAtendimento;
  }

  public void setCiAtendimento(int ciAtendimento) {
    this.ciAtendimento = ciAtendimento;
  }

  public int getCiCidadao() {
    return ciCidadao;
  }

  public void setCiCidadao(int ciCidadao) {
    this.ciCidadao = ciCidadao;
  }

  public int getCiCentroAssistencial() {
    return ciCentroAssistencial;
  }

  public void setCiCentroAssistencial(int ciCentroAssistencial) {
    this.ciCentroAssistencial = ciCentroAssistencial;
  }

  public int getCdSubprefeitura() {
    return cdSubprefeitura;
  }

  public void setCdSubprefeitura(int cdSubprefeitura) {
    this.cdSubprefeitura = cdSubprefeitura;
  }

  public Date getDtAtualizacao() {
    return dtAtualizacao;
  }

  public void setDtAtualizacao(Date dtAtualizacao) {
    this.dtAtualizacao = dtAtualizacao;
  }

  public int getCiTipoProcura() {
    return ciTipoProcura;
  }

  public void setCiTipoProcura(int ciTipoProcura) {
    this.ciTipoProcura = ciTipoProcura;
  }

  public int getCiTipoProvidencia() {
    return ciTipoProvidencia;
  }

  public void setCiTipoProvidencia(int ciTipoProvidencia) {
    this.ciTipoProvidencia = ciTipoProvidencia;
  }

  public int getCiMotivoProcura() {
    return ciMotivoProcura;
  }

  public void setCiMotivoProcura(int ciMotivoProcura) {
    this.ciMotivoProcura = ciMotivoProcura;
  }

  public int getCiEncaminhamento() {
    return ciEncaminhamento;
  }

  public void setCiEncaminhamento(int ciEncaminhamento) {
    this.ciEncaminhamento = ciEncaminhamento;
  }

  @Override
  public String toString() {
    return "VTrajcidAtendimentoBaseReplicada{" +
      "dtPreAtendimento=" + dtPreAtendimento +
      ", ciAtendimento=" + ciAtendimento +
      ", ciCidadao=" + ciCidadao +
      ", ciCentroAssistencial=" + ciCentroAssistencial +
      ", cdSubprefeitura=" + cdSubprefeitura +
      ", dtAtualizacao=" + dtAtualizacao +
      ", ciTipoProcura=" + ciTipoProcura +
      ", ciTipoProvidencia=" + ciTipoProvidencia +
      ", ciMotivoProcura=" + ciMotivoProcura +
      ", ciEncaminhamento=" + ciEncaminhamento +
      '}';
  }
}
