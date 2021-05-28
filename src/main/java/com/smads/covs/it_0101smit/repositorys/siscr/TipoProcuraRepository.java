package com.smads.covs.it_0101smit.repositorys.siscr;

import com.smads.covs.it_0101smit.models.siscr.TipoProcura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoProcuraRepository extends JpaRepository<TipoProcura, Integer> {

  TipoProcura findByCiTipoProcura(Integer ciTipoProcura);
}
