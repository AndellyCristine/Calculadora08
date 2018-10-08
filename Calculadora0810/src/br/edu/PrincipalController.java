/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 04380230210
 */
public class PrincipalController implements Initializable {

    double n1,n2,resultado;
    private Button buttonMais;
    private Label label;
    private TextField txtNum1;
    private TextField txtNum2;
    private TextField txtResultado;
    private Button btnMenos;
    private Button btnVezes;
    private Button btnDivisao;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
    
    private void SOMAR(ActionEvent event) {
       
        n1 = Double.parseDouble(txtNum1.getText());
        n2 = Double.parseDouble(txtNum2.getText());
        
        resultado = n1+n2;
        
        txtResultado.setText(String.valueOf(resultado));
    }
    
     private void SUBTRAIR (ActionEvent event) {
       
        n1 = Double.parseDouble(txtNum1.getText());
        n2 = Double.parseDouble(txtNum2.getText());
        
        resultado = n1-n2;
        
        txtResultado.setText(String.valueOf(resultado));
    }
     
     private void MULTIPLICAR (ActionEvent event) {
       
        n1 = Double.parseDouble(txtNum1.getText());
        n2 = Double.parseDouble(txtNum2.getText());
        
        resultado = n1*n2;
        
        txtResultado.setText(String.valueOf(resultado));
    }
     
     private void DIVIDIR (ActionEvent event) {
       
        n1 = Double.parseDouble(txtNum1.getText());
        n2 = Double.parseDouble(txtNum2.getText());
        
        resultado = n1/n2;
        
        txtResultado.setText(String.valueOf(resultado));
    }
     
     private void LIMPAR (ActionEvent event) {
       txtNum1.setText("");
       txtNum2.setText("");
       txtResultado.setText("");
    }
     
      private void SAIR (ActionEvent event) {
      System.exit(0);
    }
}
