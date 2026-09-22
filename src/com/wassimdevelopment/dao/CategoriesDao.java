/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.dao;

import com.wassimdevelopment.model.Categories;
import java.util.List;

/**
 *
 * @author JARGON
 */
public interface CategoriesDao {

    /**
     *
     * @param categories
     */
    void addCategories(Categories categories);
    List<Categories> getAllCategories();
}
