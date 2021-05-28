package com.smads.covs.it_0101smit.services.views;

import com.smads.covs.it_0101smit.models.views.VSubprefeituraDm;
import com.smads.covs.it_0101smit.repositorys.views.VSubprefeituraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VSubprefeituraDmService {

  private final VSubprefeituraRepository vSubprefeituraRepository;

  @Autowired
  public VSubprefeituraDmService(VSubprefeituraRepository vSubprefeituraRepository) {
    this.vSubprefeituraRepository = vSubprefeituraRepository;
  }

  public VSubprefeituraDm findVSubprefeituraDm(Integer cdSubprefeitura){
    return vSubprefeituraRepository.findByCdSubprefeitura(cdSubprefeitura);
  }
}
