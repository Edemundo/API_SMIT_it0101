package com.smads.covs.it_0101smit.repositorys.siscr;

import com.smads.covs.it_0101smit.models.siscr.TipoProvidencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoProvidenciaRepository extends JpaRepository<TipoProvidencia, Integer> {

  TipoProvidencia findByCiTipoProvidencia(Integer ciTipoProvidencia);
}
