package com.springframework.services;

import com.springframework.models.Recipe;

import java.util.Set;

/**
 * Created by Rajesh on 29-08-2017.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
