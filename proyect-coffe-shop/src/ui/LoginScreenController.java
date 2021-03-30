/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
/**
 * FXML Controller class
 *
*@author DanielRamirez<br>
*@author AmilcarRodriguez<br>
*/
public class LoginScreenController implements Initializable {

    @FXML
    private AnchorPane login;
    @FXML
    private TextField txtUserLogin;
    @FXML
    private PasswordField txtUserPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadRegister(ActionEvent event) {
    }

    @FXML
    private void login(ActionEvent event) {
    }
    
}
