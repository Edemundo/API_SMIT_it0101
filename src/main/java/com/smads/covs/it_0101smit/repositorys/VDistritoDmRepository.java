package com.smads.covs.it_0101smit.repositorys;

import com.smads.covs.it_0101smit.models.VDistritoDm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VDistritoDmRepository extends JpaRepository<VDistritoDm, Integer> {

  VDistritoDm findByNrDistrito(Integer nrDistrito);
}
