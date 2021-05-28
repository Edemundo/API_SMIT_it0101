package com.smads.covs.it_0101smit.services.siscr;

import com.smads.covs.it_0101smit.models.siscr.Encaminhamento;
import com.smads.covs.it_0101smit.repositorys.siscr.EncaminhamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncaminhamentoService {

  private final EncaminhamentoRepository encaminhamentoRepository;

  @Autowired
  public EncaminhamentoService(EncaminhamentoRepository encaminhamentoRepository) {
    this.encaminhamentoRepository = encaminhamentoRepository;
  }

  public Encaminhamento findEncaminhamento(Integer ciEncaminhamento){
    return encaminhamentoRepository.findByCiEncaminhamento(ciEncaminhamento);
  }
}
