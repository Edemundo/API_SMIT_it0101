package com.smads.covs.it_0101smit.repositorys.views;

import com.smads.covs.it_0101smit.models.views.VDistritoDm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VDistritoDmRepository extends JpaRepository<VDistritoDm, Integer> {

  VDistritoDm findByNrDistrito(Integer nrDistrito);
}
