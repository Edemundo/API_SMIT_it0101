package com.smads.covs.it_0101smit.services.siscr;

import com.smads.covs.it_0101smit.models.siscr.MotivoProcura;
import com.smads.covs.it_0101smit.repositorys.siscr.MotivoProcuraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotivoProcuraService {

  private final MotivoProcuraRepository motivoProcuraRepository;

  @Autowired
  public MotivoProcuraService(MotivoProcuraRepository motivoProcuraRepository) {
    this.motivoProcuraRepository = motivoProcuraRepository;
  }

  public MotivoProcura findMotivoProcura(Integer ciMotivoProcura){
    return motivoProcuraRepository.findByCiMotivoProcura(ciMotivoProcura);
  }
}
