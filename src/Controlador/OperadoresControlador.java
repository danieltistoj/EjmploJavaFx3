/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Operaciones;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class OperadoresControlador implements Initializable {

    @FXML
    private TextField txtOperadorUno;
    @FXML
    private TextField txtOperadorDos;
    @FXML
    private Button botonOperar;
    @FXML
    private TextField txtResp;
    @FXML
    private RadioButton radioSuma;
    @FXML
    private RadioButton radioMulti;
    @FXML
    private RadioButton radioResta;
    @FXML
    private RadioButton radioDivision;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      ToggleGroup tg = new ToggleGroup();
      this.radioSuma.setToggleGroup(tg);
      this.radioResta.setToggleGroup(tg);
      this.radioMulti.setToggleGroup(tg);
      this.radioDivision.setToggleGroup(tg);
    }    

    @FXML
    private void HacerOperacion(ActionEvent event) {
        int op1, op2;
        try {
            op1 = Integer.parseInt(txtOperadorUno.getText());
            op2 = Integer.parseInt(txtOperadorDos.getText());
            Operaciones op = new Operaciones(op1, op2);
            
            if(radioSuma.isSelected()){
                txtResp.setText(op.Suma()+"");
            }else if(radioResta.isSelected()){
                txtResp.setText(op.Resta()+"");
            }
            else if(radioMulti.isSelected()){
                txtResp.setText(op.Multi()+"");
            }
            else{
                if(op2 == 0){
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setHeaderText(null);
                        alert.setTitle("Error");
                        alert.setContentText("El operador dos no puede ser cero");
                        alert.showAndWait();
                }
                else{
                    txtResp.setText(op.Division()+"");
                }
                
            }
            
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Forma incorrecta");
            alert.showAndWait();
        }
    }
    
}
