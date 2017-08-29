package com.springframework.repositories;

import com.springframework.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Rajesh on 29-08-2017.
 */
public interface CategoryRepository extends CrudRepository<Category , Long> {

    Optional<Category> findByCategoryName(String categoryName);
}
