/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 03590320281
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button btnsoma;
    @FXML
    private TextField txtnumero1;
    @FXML
    private Label label1;
    @FXML
    private TextField txtnumero2;
    @FXML
    private Label label11;
    @FXML
    private TextField txtresultado;
    
    @FXML
    private void soma (ActionEvent event) {
       Double num1 = Double.parseDouble(txtnumero1.getText());
       Double num2 = Double.parseDouble(txtnumero2.getText());
       Double resultado = num1+num2;       
       
       txtresultado.setText(resultado.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
