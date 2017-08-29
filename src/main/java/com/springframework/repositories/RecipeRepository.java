package com.springframework.repositories;

import com.springframework.models.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rajesh on 29-08-2017.
 */
public interface RecipeRepository extends CrudRepository<Recipe , Long> {
}
