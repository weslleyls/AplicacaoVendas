/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vendas.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author aluno
 */
public class Login extends Application{

    @Override
    public void start(Stage palco) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new  Scene(root);
        palco.setTitle("Vendas - 1.0");
        palco.setScene(scene);
        palco.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
