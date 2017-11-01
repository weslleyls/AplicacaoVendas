
package com.vendas.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    Connection conexao = null;
    
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/vendas_bd", "root","sa");
        }  catch(SQLException e){
            throw new RuntimeException(e);
            
        }
    }
}
