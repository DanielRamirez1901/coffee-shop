/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Button;
import java.awt.TextArea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Coffe;
import model.Employee;
import model.Ingredient;
import model.Client;
/**
 * FXML Controller class
 *
*@author DanielRamirez<br>
*@author AmilcarRodriguez<br>
*/
public class LoginScreenController implements Initializable {

	//Login Screen Attributes
    @FXML
    private AnchorPane login;
    @FXML
    private TextField txtUserLogin;
    @FXML
    private PasswordField txtUserPassword;
    
    //AddIngregient Attributes
    @FXML
    private TextField txtIngredientName;

    //AddEmployee Attributes
    @FXML
    private Pane paneAddEmployee;
    @FXML
    private TextField txtNameEmployeeAdd;
    @FXML
    private TextField txtLastNameEmployeeAdd;
    @FXML
    private TextField txtIdEmployeeAdd;
    
    //AddClient Attributes
    @FXML
    private Pane paneAddClient;
    @FXML
    private TextField txtNameClientAdd;
    @FXML
    private TextField txtLastnameClientAdd;
    @FXML
    private TextField txtAddressClientAdd;
    @FXML
    private TextField txtPhoneClientAdd;
    @FXML
    private TextArea txtaObservationsClientAdd;
    @FXML
    private Button registerClient;
    @FXML
    private TextField txtIdClient;
    
    //Relations
    private Coffe coffe;
    private Ingredient ingredient;
    private Employee employee;
    private Client client;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void loadRegister(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PersonalAdmin.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent addUserPane = fxmlLoader.load();
    	
		login.getChildren().clear();
    	login.setTopAnchor(addUserPane, null);
    	Stage st = (Stage)
    	addUserPane.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);

    }
    
    @FXML
    public void login(ActionEvent event) throws IOException{
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);

      
        if(coffe.userLogin(txtUserLogin.getText(), txtUserPassword.getText()) != false) {
            alert.setContentText("Ha iniciado sesión correctamente");
            
        }else if(coffe.userLogin(txtUserLogin.getText(), txtUserPassword.getText()) == false) {
            alert.setContentText("Usuario y/o contraseña incorrectos");
            System.out.println(txtUserLogin.getText() +" "+txtUserPassword.getText()+" "+txtUserLogin.getText()+" "+txtUserPassword.getText()+" ");
        }

        alert.showAndWait();
    }
    
    @FXML
    public void registerIngredient(ActionEvent event)throws IOException{
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Información");
    	alert.setHeaderText(null);
    	if(!txtIngredientName.getText().equals("")) {
    		ingredient = new Ingredient(txtIngredientName.getText(), true);
    		coffe.addIngredient(ingredient);
    	}//End if
    	txtIngredientName.setText("");
    	alert.setContentText("Ingrediente registrado exitosamente");
    	alert.showAndWait();

    }
    
    @FXML
    public void registerEmployee(ActionEvent event)throws IOException{
    	Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        if(!txtNameEmployeeAdd.getText().equals("") && !txtLastNameEmployeeAdd.getText().equals("") && !txtIdEmployeeAdd.getText().equals("")) {
        	employee = new Employee(txtNameEmployeeAdd.getText(),txtLastNameEmployeeAdd.getText(),txtIdEmployeeAdd.getText());
        	coffe.addEmployee(employee);
        }//End if
        txtNameEmployeeAdd.setText("");txtLastNameEmployeeAdd.setText("");txtIdEmployeeAdd.setText("");
        alert.setContentText("Empleado registrado exitosamente");
    	alert.showAndWait();
    }
    
    @FXML
    public void registerClient(ActionEvent event)throws IOException{
    	Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        if(!txtNameClientAdd.getText().equals("") && !txtLastnameClientAdd.getText().equals("") && !txtIdClient.getText().equals("") && !txtAddressClientAdd.getText().equals("") && !txtPhoneClientAdd.getText().equals("")) {
        	client = new Client(txtNameClientAdd.getText(),txtLastnameClientAdd.getText(),txtIdClient.getText(),txtAddressClientAdd.getText(),txtPhoneClientAdd.getText(),txtaObservationsClientAdd.getText());
        	coffe.addClient(client);
        }//End if
        txtNameClientAdd.setText("");txtLastnameClientAdd.setText("");txtIdClient.setText("");txtAddressClientAdd.setText("");txtPhoneClientAdd.setText("");txtaObservationsClientAdd.setText("");
        alert.setContentText("Cliente registrado exitosamente");
    	alert.showAndWait();
    }
}
