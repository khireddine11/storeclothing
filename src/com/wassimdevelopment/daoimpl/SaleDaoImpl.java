/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.daoimpl;

import com.wassimdevelopment.dao.SalesDao;
import com.wassimdevelopment.database.db;
import com.wassimdevelopment.model.Sales;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JARGON
 */
public class SaleDaoImpl implements SalesDao {

    private Connection connection;
    private ResultSet rs;
    private PreparedStatement pr;

    @Override
    public void addRecieptItems(Sales var1) {

        String addSales = "INSERT INTO pos_2026.sales2026(totalamont,cashierid) VALUES(?,?) ";
        try {
            this.connection = db.getConnection();
            this.pr = this.connection.prepareStatement(addSales, Statement.RETURN_GENERATED_KEYS);
            this.pr.setDouble(1, var1.getTotalAmountPrimitive());
            this.pr.setInt(2, var1.getCashierIdPrimitive());
            this.pr.execute();
            ResultSet rs = pr.getGeneratedKeys();
            int saleID = 0;
            if (rs.next()) {
                saleID = rs.getInt(1);
                var1.setSaleId(saleID);
            }
        } catch (UnknownHostException | SQLException e) {
        
    }
    }
}


