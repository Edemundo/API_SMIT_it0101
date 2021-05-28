package com.smads.covs.it_0101smit.repositorys.views;

import com.smads.covs.it_0101smit.models.views.VTrajcidAtendimentoBaseReplicada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public interface VTrajcidAtendimentoBaseReplicadaRepository
  extends JpaRepository<VTrajcidAtendimentoBaseReplicada, Date> {

  List<VTrajcidAtendimentoBaseReplicada> findAllByCiCidadao(Integer ciCidadao);
}
