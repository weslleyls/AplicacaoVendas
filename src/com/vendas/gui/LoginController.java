/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vendas.gui;

import com.vendas.DAO.FuncionarioDAO;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author aluno
 */
public class LoginController implements Initializable {
    @FXML
    TextField tEmail;
    
    @FXML 
    Button btnLogin;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void login(ActionEvent e){
        
        FuncionarioDAO funcionario = new FuncionarioDAO();
        
        
        try {
            funcionario.buscaFuncionario(tEmail.getText());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
