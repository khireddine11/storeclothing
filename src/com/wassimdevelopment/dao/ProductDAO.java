/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wassimdevelopment.dao;

import com.wassimdevelopment.model.Product;
import java.util.List;

/**
 *
 * @author JARGON
 */
public interface ProductDAO {
   List<Product> getAllProducts();

   
   List<Product> getLastAddedProducts(int var1);

   void addProduct(Product var1);

   void updateProduct(Product var1, String var2);

   void deleteProduct(Product var1);

   Product getProduct(String var1);

   int getProductAvailableQty(String var1); 
}
