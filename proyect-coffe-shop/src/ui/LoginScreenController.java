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

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    //Ingredient List Attributes
    @FXML
    private TableView<Ingredient> tvIngredientList;
    @FXML
    private TableColumn<Ingredient, String> tcNameIngredient;
    @FXML
    private TableColumn<Ingredient, Boolean> tcStateIngredient;

    //AddEmployee Attributes
    @FXML
    private Pane paneAddEmployee;
    @FXML
    private TextField txtNameEmployeeAdd;
    @FXML
    private TextField txtLastNameEmployeeAdd;
    @FXML
    private TextField txtIdEmployeeAdd;
    //Table view Employee Attributes
    @FXML
    private Pane paneListEmployee;
    @FXML
    private TableView<Employee> tvEmployee;
    @FXML
    private TableColumn<Employee, ?> tableEmployeeNumber;
    @FXML
    private TableColumn<Employee, String> tcEmployeeName;
    @FXML
    private TableColumn<Employee, String> tcEmployeeLastName;
    @FXML
    private TableColumn<Employee, String> tcIdEmployee;
    @FXML
    private Button btnDeleteEmployee;
    @FXML
    private Button btnUpdateEmloyee;
    @FXML
    private Button btnDisableEmployee;
    
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
    
    public void initializeTableViewIngredient() {
    	ObservableList<Ingredient> observableList;
    	observableList = FXCollections.observableArrayList(coffe.getIngredients());
    	
		tvIngredientList.setItems(observableList);
		tcNameIngredient.setCellValueFactory(new PropertyValueFactory<Ingredient,String>("nombre")); //the tableview search for a method called getName
		tcStateIngredient.setCellValueFactory(new PropertyValueFactory<Ingredient,Boolean>("estado")); //the tableview search for a method called getEmail
    }
    
    public void initializeTableViewEmployee() {
    	ObservableList<Employee> observableList;
    	observableList = FXCollections.observableArrayList(coffe.getEmployees());
    	
		tvEmployee.setItems(observableList);
		tcEmployeeName.setCellValueFactory(new PropertyValueFactory<Employee,String>("nombre")); //the tableview search for a method called getName
		tcEmployeeLastName.setCellValueFactory(new PropertyValueFactory<Employee,String>("apellido")); //the tableview search for a method called getEmail
		tcIdEmployee.setCellValueFactory(new PropertyValueFactory<Employee,String>("id"));
    }
    
//    Lista de clientes
//    Lista de ordenes
//    Lista de productos
//    Añadir producto
//    Eliminar(Productos, clientes, empleados, ingredientes)
//    Modificar(Productos, clientes, empleados, ingredientes)
//    Deshabilitar()
    public void xd() {
    	
    }
}
