package com.smads.covs.it_0101smit.services.siscr;

import com.smads.covs.it_0101smit.models.siscr.CentroAssistencial;
import com.smads.covs.it_0101smit.repositorys.siscr.CentroAssistencialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CentroAssistencialService {

  private final CentroAssistencialRepository centroAssistencialRepository;

  @Autowired
  public CentroAssistencialService(CentroAssistencialRepository centroAssistencialRepository) {
    this.centroAssistencialRepository = centroAssistencialRepository;
  }

  public CentroAssistencial findCentroAssistencial(Integer ciCentroAssistencial){
    return centroAssistencialRepository.findByCiCentroAssistencial(ciCentroAssistencial);
  }
}
