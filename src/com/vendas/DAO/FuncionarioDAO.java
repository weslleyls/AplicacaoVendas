
package com.vendas.DAO;

import com.vendas.conexao.Conexao;
import com.vendas.model.FuncionarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDAO {
    
    Connection conn = new Conexao().getConnection();
    
    public boolean buscaFuncionario(String email) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        FuncionarioModel funcionario = null;
        
        boolean login = false;
        
        String query = "SELECT emailfuncionario FROM funcionario where emailfuncionario like ? ;";
        
        try {
            
            stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
              email.equals(rs.getString("emailfuncionario"));
              login = true;
            }
            
            rs.close();
            stmt.close();
            
        } catch(SQLException e){
            throw new RuntimeException(e);
        } finally {
            conn.close();
        }
        
      return login;  
    }
    
}
