package com.smads.covs.it_0101smit.repositorys.siscr;

import com.smads.covs.it_0101smit.models.siscr.MotivoProcura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotivoProcuraRepository extends JpaRepository<MotivoProcura, Integer> {

  MotivoProcura findByCiMotivoProcura(Integer ciMotivoProcura);
}
