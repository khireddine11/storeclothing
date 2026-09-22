/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.daoimpl;
/**
 * 
 */
import com.wassimdevelopment.dao.SaleItemDao;
import com.wassimdevelopment.database.db;
import com.wassimdevelopment.model.SaleItems;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JARGON
 */
public class SaleItemsDaoimpl implements SaleItemDao {

    private Connection connection;
    private ResultSet rs;
    private PreparedStatement pr;

    @Override
    public void addRecieptItems(SaleItems var1) {
        String addSaleItem = "INSERT INTO pos_2026.saleitems(saleid ,barcode,quantity ,unitprice ) VALUES(?,?,?,?) ";
        try {
            this.connection = db.getConnection();
            this.pr = this.connection.prepareStatement(addSaleItem);
            this.pr.setInt(1, var1.getSaleIdPrimitive());
            this.pr.setString(2, var1.getBarcodePrimitive());
            this.pr.setInt(3, var1.getQtyPrimitive());
            this.pr.setDouble(4, var1.getUnitPricePrimitive());
            this.pr.execute();
           

       } catch (SQLException var12) {
         var12.printStackTrace();
      } catch (UnknownHostException ex) {
            Logger.getLogger(SaleItemsDaoimpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
         try {
            if (this.rs != null) {
               this.rs.close();
            }

            if (this.pr != null) {
               this.pr.close();
            }

            if (this.connection != null) {
               this.connection.close();
            }
         } catch (SQLException var11) {
            var11.printStackTrace();
         }

      }
    }

}
