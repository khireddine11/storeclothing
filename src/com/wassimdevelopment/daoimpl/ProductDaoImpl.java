/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.daoimpl;

import com.wassimdevelopment.dao.ProductDAO;
import com.wassimdevelopment.database.db;
import com.wassimdevelopment.model.Product;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JARGON
 */
public class ProductDaoImpl implements ProductDAO {

    private Connection connection;
    private ResultSet rs;
    private PreparedStatement pr;

    @Override
    public List<Product> getAllProducts() {
        return null;

    }

    @Override
    public List<Product> getLastAddedProducts(int var1) {
        return null;

    }

    @Override
    public void addProduct(Product product) {
        String insertProductQuery = 
                "insert into product (product_sku, reference, description, alert_qte) values (?,?,?,?)";
        
        try {
         this.connection = db.getConnection();
         this.pr = this.connection.prepareStatement(insertProductQuery);
////         this.pr.setString(1, product.getSku());
////         this.pr.setString(2, product.getReference());
////         this.pr.setString(3, product.getName());
////         
////         this.pr.setDouble(11, product.getAlertQty());
        
         this.pr.execute();
      } catch (SQLException var13) {
      } catch (UnknownHostException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void updateProduct(Product var1, String var2) {

    }

    @Override
    public void deleteProduct(Product var1) {

    }

    @Override
    public Product getProduct(String var1) {
        return null;

    }

    @Override
    public int getProductAvailableQty(String var1) {
        return 0;

    }

}
