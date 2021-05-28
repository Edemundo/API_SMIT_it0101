package com.smads.covs.it_0101smit.services.views;

import com.smads.covs.it_0101smit.models.views.VTrajcidAtendimentoBaseReplicada;
import com.smads.covs.it_0101smit.repositorys.views.VTrajcidAtendimentoBaseReplicadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class VTrajcidAtendimentoBaseReplicadaService {

  private final VTrajcidAtendimentoBaseReplicadaRepository vTrajcidAtendimentoBaseReplicadaRepository;
  private List<VTrajcidAtendimentoBaseReplicada> Response;

  @Autowired
  public VTrajcidAtendimentoBaseReplicadaService(VTrajcidAtendimentoBaseReplicadaRepository vTrajcidAtendimentoBaseReplicadaRepository) {
    this.vTrajcidAtendimentoBaseReplicadaRepository = vTrajcidAtendimentoBaseReplicadaRepository;
  }

  public List<VTrajcidAtendimentoBaseReplicada> findVTrajcidAtendimentoBaseReplicada(BigInteger ciCidadao){
    Integer intCiCidadao = ciCidadao.intValue();
    Response = vTrajcidAtendimentoBaseReplicadaRepository.findAllByCiCidadao(intCiCidadao);
    System.out.println(Response);
    return Response;
  }
}
