package com.springframework.repositories;

import com.springframework.models.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Rajesh on 29-08-2017.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure , Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
