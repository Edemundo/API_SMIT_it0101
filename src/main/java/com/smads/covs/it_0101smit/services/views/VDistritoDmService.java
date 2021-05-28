package com.smads.covs.it_0101smit.services.views;

import com.smads.covs.it_0101smit.models.views.VDistritoDm;
import com.smads.covs.it_0101smit.repositorys.views.VDistritoDmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VDistritoDmService {

  private final VDistritoDmRepository vDistritoDmRepository;

  @Autowired
  public VDistritoDmService(VDistritoDmRepository vDistritoDmRepository) {
    this.vDistritoDmRepository = vDistritoDmRepository;
  }

  public VDistritoDm findVDistritoDm(Integer nrDistrito){
    return vDistritoDmRepository.findByNrDistrito(nrDistrito);
  }
}
