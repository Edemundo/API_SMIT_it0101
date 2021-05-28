package com.smads.covs.it_0101smit.repositorys.siscr;

import com.smads.covs.it_0101smit.models.siscr.Encaminhamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncaminhamentoRepository extends JpaRepository<Encaminhamento, Integer> {

  Encaminhamento findByCiEncaminhamento(Integer ciEncaminhamento);
}
