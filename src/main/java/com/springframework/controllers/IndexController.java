package com.springframework.controllers;

import com.springframework.models.Category;
import com.springframework.models.UnitOfMeasure;
import com.springframework.repositories.CategoryRepository;
import com.springframework.repositories.UnitOfMeasureRepository;
import com.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by Rajesh on 25-08-2017.
 */
@Controller
public class IndexController {

    RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

          return "index";
      }



}
