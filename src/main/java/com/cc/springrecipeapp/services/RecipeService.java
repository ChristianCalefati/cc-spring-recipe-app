package com.cc.springrecipeapp.services;

import com.cc.springrecipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}
