package com.smads.covs.it_0101smit.services.siscr;

import com.smads.covs.it_0101smit.models.siscr.TipoProcura;
import com.smads.covs.it_0101smit.repositorys.siscr.TipoProcuraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProcuraService {

  private final TipoProcuraRepository tipoProcuraRepository;

  @Autowired
  public TipoProcuraService(TipoProcuraRepository tipoProcuraRepository) {
    this.tipoProcuraRepository = tipoProcuraRepository;
  }

  public TipoProcura findTipoProcura(Integer ciTipoProcura){
    return tipoProcuraRepository.findByCiTipoProcura(ciTipoProcura);
  }
}
