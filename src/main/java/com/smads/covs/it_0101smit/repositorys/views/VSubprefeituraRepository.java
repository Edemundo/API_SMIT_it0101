package com.smads.covs.it_0101smit.repositorys.views;

import com.smads.covs.it_0101smit.models.views.VSubprefeituraDm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VSubprefeituraRepository extends JpaRepository<VSubprefeituraDm, Integer> {

  VSubprefeituraDm findByCdSubprefeitura(Integer cdSubprefeitura);
}
