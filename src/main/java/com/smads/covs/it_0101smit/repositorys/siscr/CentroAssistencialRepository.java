package com.smads.covs.it_0101smit.repositorys.siscr;

import com.smads.covs.it_0101smit.models.siscr.CentroAssistencial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentroAssistencialRepository extends JpaRepository<CentroAssistencial, Integer> {

  CentroAssistencial findByCiCentroAssistencial(Integer ciCentroAssistencial);
}
