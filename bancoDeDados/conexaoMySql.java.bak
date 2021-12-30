/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author fschi
 */
public abstract class DatabaseMySQL implements Database{
    
    Connection connection;
    
    @Override
    public Connection conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nome_banco", "root", "123456");
            return connection;
           
        }
        catch(SQLException | ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco MySql: " + ex);
            return null;
        }
    }
    
    
    
}
