/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.daoimpl;

import com.wassimdevelopment.dao.ProductVariationDao;
import com.wassimdevelopment.database.db;
import com.wassimdevelopment.model.ProductVariation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JARGON
 */
public class ProductVariationDaoImpl implements ProductVariationDao {

    private Connection postrs;
    private ResultSet rs;
    private PreparedStatement pr;

    @Override
    public ProductVariation getProduct(String Barcode) {
        ProductVariation productvariation = new ProductVariation();
        String getvariation = "SELECT size ,color, barcode,sellingprice,stockquantity FROM pos_master.productvariation WHERE barcode = '"+Barcode+"'";
        try {
            postrs = db.getConnection();
            rs = postrs.createStatement().executeQuery(getvariation);
             while (this.rs.next()) {
               productvariation.setSizePrimitive(rs.getString("size")+" "+rs.getString("color"));
              // productvariation.setColor(rs.getString("color"));
               productvariation.setBarcodePrimitive(rs.getString("barcode"));
               productvariation.setSellPricingPrimitive(rs.getDouble("sellingprice"));
               productvariation.setQtyStockPrimitive(rs.getInt("stockquantity"));
               System.out.println(rs.getString("size")+rs.getString("color")+rs.getString("barcde")+rs.getDouble("sellingprice"));
            }

        } catch (Exception e) {
        } finally {
            try {
                if (this.rs != null) {
                    this.rs.close();
                }

                if (postrs != null) {
                    postrs.close();
                }
            } catch (SQLException var11) {
                var11.printStackTrace();
            }

        }
        return productvariation;
        }

    }
