package com.ppzeff.dehssisfs.fire.repository;

import com.ppzeff.dehssisfs.fire.model.ExtinguisherModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExtinguisherRepo extends CrudRepository<ExtinguisherModel, Long> {
    @Query
    Optional<ExtinguisherModel> findByNumber(Integer number);
}
