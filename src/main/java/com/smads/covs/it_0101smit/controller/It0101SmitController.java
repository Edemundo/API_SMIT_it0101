package com.smads.covs.it_0101smit.controller;

import com.smads.covs.it_0101smit.models.retorno.SiscrData;
import com.smads.covs.it_0101smit.models.views.VTrajcidAtendimentoBaseReplicada;
import com.smads.covs.it_0101smit.services.siscr.*;
import com.smads.covs.it_0101smit.services.views.VDistritoDmService;
import com.smads.covs.it_0101smit.services.views.VSubprefeituraDmService;
import com.smads.covs.it_0101smit.services.views.VTrajcidAtendimentoBaseReplicadaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/it0101")
public class It0101SmitController {

  private final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

  // private final todos os services das tabelas que serão utilizadas do banco 0101
  private final VDistritoDmService vDistritoDmService;
  private final VSubprefeituraDmService vSubprefeituraDmService;
  private final CentroAssistencialService centroAssistencialService;
  private final EncaminhamentoService encaminhamentoService;
  private final MotivoProcuraService motivoProcuraService;
  private final TipoProcuraService tipoProcuraService;
  private final TipoProvidenciaService tipoProvidenciaService;

  private final VTrajcidAtendimentoBaseReplicadaService vTrajcidAtendimentoBaseReplicadaService;

  private final ArrayList<String> lstEndereco;
  private final List<SiscrData> lstSiscrData;
  private List<VTrajcidAtendimentoBaseReplicada> lstVTrajcidAtendimentoBaseReplicada;


  public It0101SmitController(VDistritoDmService vDistritoDmService, VSubprefeituraDmService vSubprefeituraDmService,
                              CentroAssistencialService centroAssistencialService, EncaminhamentoService encaminhamentoService,
                              MotivoProcuraService motivoProcuraService, TipoProcuraService tipoProcuraService,
                              TipoProvidenciaService tipoProvidenciaService,
                              VTrajcidAtendimentoBaseReplicadaService vTrajcidAtendimentoBaseReplicadaService,
                              ArrayList<String> lstEndereco, List<SiscrData> lstSiscrData) {
    this.vDistritoDmService = vDistritoDmService;
    this.vSubprefeituraDmService = vSubprefeituraDmService;
    this.centroAssistencialService = centroAssistencialService;
    this.encaminhamentoService = encaminhamentoService;
    this.motivoProcuraService = motivoProcuraService;
    this.tipoProcuraService = tipoProcuraService;
    this.tipoProvidenciaService = tipoProvidenciaService;
    this.vTrajcidAtendimentoBaseReplicadaService = vTrajcidAtendimentoBaseReplicadaService;
    this.lstEndereco = lstEndereco;
    this.lstSiscrData = lstSiscrData;
  }

  @GetMapping("/sisa")
  public ArrayList<String> it0101SisaData(@RequestParam String nrDistrito, @RequestParam String cdSubprefeitura) {
    Integer intNrDistrito = Integer.valueOf(nrDistrito);
    Integer intCdSubprefeitura = Integer.valueOf(cdSubprefeitura);

    String nmDistrito = vDistritoDmService.findVDistritoDm(intNrDistrito).getNmDistrito();
    String nmSubprefeitura = vSubprefeituraDmService.findVSubprefeituraDm(intCdSubprefeitura).getNmSubprefeitura();

    lstEndereco.add(nmDistrito);
    lstEndereco.add(nmSubprefeitura);

    return lstEndereco;
  }

  @GetMapping("/siscr")
  public List<SiscrData> it0101SiscrData(@RequestParam String ciCidadao){

    BigInteger biCiCidadao = new BigInteger(ciCidadao);

    lstVTrajcidAtendimentoBaseReplicada = vTrajcidAtendimentoBaseReplicadaService.findVTrajcidAtendimentoBaseReplicada(biCiCidadao);
    lstSiscrData.clear();
    for (VTrajcidAtendimentoBaseReplicada vTrajcidAtendimentoBaseReplicada : lstVTrajcidAtendimentoBaseReplicada){

      SiscrData siscrData = new SiscrData();

      String strDtAtualizacao = null;
      if(vTrajcidAtendimentoBaseReplicada.getDtAtualizacao() != null){
        strDtAtualizacao = formatter.format(vTrajcidAtendimentoBaseReplicada.getDtAtualizacao());
        siscrData.setDtAtualizacao(strDtAtualizacao);
      }
      else{
        siscrData.setDtAtualizacao("-");
      }

      String strDtPreAtendimento = null;
      if(vTrajcidAtendimentoBaseReplicada.getDtPreAtendimento() != null){
        strDtPreAtendimento = formatter.format(vTrajcidAtendimentoBaseReplicada.getDtPreAtendimento());
        siscrData.setDtPreAtendimento(strDtPreAtendimento);
      }
      else{
        siscrData.setDtPreAtendimento("-");
      }

      Integer cdSubprefeitura = vTrajcidAtendimentoBaseReplicada.getCdSubprefeitura();
      Integer ciCentroAssistencial = vTrajcidAtendimentoBaseReplicada.getCiCentroAssistencial();
      Integer ciEncaminhamento = vTrajcidAtendimentoBaseReplicada.getCiEncaminhamento();
      Integer ciMotivoProcura = vTrajcidAtendimentoBaseReplicada.getCiMotivoProcura();
      Integer ciTipoProcura = vTrajcidAtendimentoBaseReplicada.getCiTipoProcura();
      Integer ciTipoProvidencia = vTrajcidAtendimentoBaseReplicada.getCiTipoProvidencia();

      if(cdSubprefeitura != null){
        String nmSubprefeitura = vSubprefeituraDmService.findVSubprefeituraDm(cdSubprefeitura).getNmSubprefeitura();
        siscrData.setNmSubprefeitura(nmSubprefeitura);
      }
      else{
        siscrData.setNmSubprefeitura("-");
      }

      if(ciCentroAssistencial != null){
        String nmCentroAssistencial = centroAssistencialService.findCentroAssistencial(ciCentroAssistencial).getNmCentroAssistencial();
        siscrData.setNmCentroAssistencial(nmCentroAssistencial);
      }
      else{
        siscrData.setNmCentroAssistencial("-");
      }

      if(ciEncaminhamento != null){
        String dcEncaminhamento = encaminhamentoService.findEncaminhamento(ciEncaminhamento).getDcEncaminhamento();
        siscrData.setDcEncaminhamento(dcEncaminhamento);
      }
      else{
        siscrData.setDcEncaminhamento("-");
      }

      if(ciMotivoProcura != null){
        String dcMotivoProcura = motivoProcuraService.findMotivoProcura(ciMotivoProcura).getDcMotivoProcura();
        siscrData.setDcMotivoProcura(dcMotivoProcura);
      }
      else{
        siscrData.setDcMotivoProcura("-");
      }

      if(ciTipoProcura != null){
        String dcTipoProcura = tipoProcuraService.findTipoProcura(ciTipoProcura).getDcTipoProcura();
        siscrData.setDcTipoProcura(dcTipoProcura);
      }
      else{
        siscrData.setDcTipoProcura("-");
      }

      if(ciTipoProvidencia != null){
        String dcTipoProvidencia = tipoProvidenciaService.findTipoProvidencia(ciTipoProvidencia).getDcTipoProvidencia();
        siscrData.setDcTipoProvidencia(dcTipoProvidencia);
      }
      else{
        siscrData.setDcTipoProvidencia("-");
      }

      lstSiscrData.add(siscrData);
    }

    return lstSiscrData;
  }
}
