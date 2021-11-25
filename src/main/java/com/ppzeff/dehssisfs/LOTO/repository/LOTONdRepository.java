package com.ppzeff.dehssisfs.LOTO.repository;

import com.ppzeff.dehssisfs.LOTO.models.LOTONdModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LOTONdRepository extends CrudRepository<LOTONdModel, Long> {

    @Query(value = "select DISTINCT u.specialistFIO  from LOTONdModel u")
    List<String> findAllspecialistFIO();
}
