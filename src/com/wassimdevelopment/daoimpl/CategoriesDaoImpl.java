/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.daoimpl;

import com.wassimdevelopment.dao.CategoriesDao;
import com.wassimdevelopment.database.db;
import com.wassimdevelopment.model.Categories;
import java.sql.Connection;
import java.sql.SQLException;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author JARGON
 */
public class CategoriesDaoImpl implements CategoriesDao {

    Connection postrs;
    PreparedStatement st;
    ResultSet rs;

    @Override
    public void addCategories(Categories categories) {
        String insertCategories = "INSERT INTO pos_master.categories(name,description )VALUES(?,?) ";
        try {
            postrs = db.getConnection();
            st = postrs.prepareStatement(insertCategories);
            st.setString(1, categories.getProductNamePrimitive());
            st.setString(2, categories.getDescriptionPrimitive());
            st.execute();

        } catch (SQLException | UnknownHostException e) {
            System.out.println("com.wassimdevelopment.daoimpl.CategoriesDaoImpl.addCategories()");
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (postrs != null) {
                    postrs.close();
                }

            } catch (SQLException e) {
            }
        }

    }

    @Override
    public List<Categories> getAllCategories() {
        List<Categories> categories = new ArrayList();
        String getAllQuery = "SELECT * FROM pos_master.categories";

        try {
            postrs = db.getConnection();
            rs = postrs.createStatement().executeQuery(getAllQuery);

            while (this.rs.next()) {
               //categories.add(new Categories(rs.getInt(1), rs.getString(2), rs.getString(3)));
                categories.add(new Categories(rs.getInt(1),rs.getString(2),rs.getString(3)));
                System.out.println(rs.getInt(1)+"name: "+rs.getString(2)+"des: "+rs.getString(3));
            }
        } catch (SQLException | UnknownHostException var12) {
            var12.printStackTrace();
         
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

        return categories;
    }
}
