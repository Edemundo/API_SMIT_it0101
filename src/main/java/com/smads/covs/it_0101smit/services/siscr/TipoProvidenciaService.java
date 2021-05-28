package com.smads.covs.it_0101smit.services.siscr;

import com.smads.covs.it_0101smit.models.siscr.TipoProvidencia;
import com.smads.covs.it_0101smit.repositorys.siscr.TipoProvidenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProvidenciaService {

  private final TipoProvidenciaRepository tipoProvidenciaRepository;

  @Autowired
  public TipoProvidenciaService(TipoProvidenciaRepository tipoProvidenciaRepository) {
    this.tipoProvidenciaRepository = tipoProvidenciaRepository;
  }

  public TipoProvidencia findTipoProvidencia(Integer ciTipoProvidencia){
    return tipoProvidenciaRepository.findByCiTipoProvidencia(ciTipoProvidencia);
  }
}
