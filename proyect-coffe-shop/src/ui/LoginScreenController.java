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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Coffe;
import model.Employee;
import model.Ingredient;
import model.Order;
import model.Product;
import model.Client;
import model.Order;

/**
 * FXML Controller class
 *
 * @author DanielRamirez<br>
 * @author AmilcarRodriguez<br>
 */
public class LoginScreenController implements Initializable {
<<<<<<< Updated upstream
	
	 @FXML
	 private BorderPane mainPanel;
	 
	//Add an Order Attributes
	@FXML
    private TextArea txtaObservationsOrder;
    @FXML
    private TextField txtQuantityProductsInOrder;
    @FXML
    private TextField txtNameProductsOrder;
    
	
	//AddProduct Attributes
	@FXML
    private TextField txtProductSyze;
    @FXML
    private TextField txtProductName;
    @FXML
    private TextField txtProductType;
    @FXML
    private TextField txtProductPrice;
    @FXML
    private TextField txtIngredientNameP;
    @FXML
    private TextField txtQuantityProduct;
    
	//Login Screen Attributes
=======

    //Login Screen Attributes
>>>>>>> Stashed changes
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
    private Product product;
    private Order order;

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
        Stage st = (Stage) addUserPane.getScene().getWindow();
        st.setHeight(575);
        st.setWidth(372);

    }

    @FXML
    public void login(ActionEvent event) throws IOException {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informaci�n");
        alert.setHeaderText(null);

        if (coffe.userLogin(txtUserLogin.getText(), txtUserPassword.getText()) != false) {
            alert.setContentText("Ha iniciado sesi�n correctamente");

        } else if (coffe.userLogin(txtUserLogin.getText(), txtUserPassword.getText()) == false) {
            alert.setContentText("Usuario y/o contrase�a incorrectos");
            System.out.println(txtUserLogin.getText() + " " + txtUserPassword.getText() + " " + txtUserLogin.getText() + " " + txtUserPassword.getText() + " ");
        }

        alert.showAndWait();
    }
<<<<<<< Updated upstream
    
    @FXML
    public void registerIngredient(ActionEvent event)throws IOException{
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Informaci�n");
    	alert.setHeaderText(null);
    	if(!txtIngredientName.getText().equals("")) {
    		ingredient = new Ingredient(txtIngredientName.getText(), true);
    		coffe.addIngredient(ingredient);
    	}//End if
    	else {
    		ifTextIsEmpty(event);
    	}
    	txtIngredientName.setText("");
    	alert.setContentText("Ingrediente registrado exitosamente");
    	alert.showAndWait();
=======

    @FXML
    public void registerIngredient(ActionEvent event) throws IOException {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informaci�n");
        alert.setHeaderText(null);
        if (!txtIngredientName.getText().equals("")) {
            ingredient = new Ingredient(txtIngredientName.getText(), true);
            coffe.addIngredient(ingredient);
        }//End if
        txtIngredientName.setText("");
        alert.setContentText("Ingrediente registrado exitosamente");
        alert.showAndWait();
>>>>>>> Stashed changes

    }

    @FXML
    public void registerEmployee(ActionEvent event) throws IOException {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informaci�n");
        alert.setHeaderText(null);
        if (!txtNameEmployeeAdd.getText().equals("") && !txtLastNameEmployeeAdd.getText().equals("") && !txtIdEmployeeAdd.getText().equals("")) {
            employee = new Employee(txtNameEmployeeAdd.getText(), txtLastNameEmployeeAdd.getText(), txtIdEmployeeAdd.getText());
            coffe.addEmployee(employee);
        }//End if
<<<<<<< Updated upstream
        else {
    		ifTextIsEmpty(event);
    	}
        txtNameEmployeeAdd.setText("");txtLastNameEmployeeAdd.setText("");txtIdEmployeeAdd.setText("");
=======
        txtNameEmployeeAdd.setText("");
        txtLastNameEmployeeAdd.setText("");
        txtIdEmployeeAdd.setText("");
>>>>>>> Stashed changes
        alert.setContentText("Empleado registrado exitosamente");
        alert.showAndWait();
    }

    @FXML
    public void registerClient(ActionEvent event) throws IOException {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informaci�n");
        alert.setHeaderText(null);
        if (!txtNameClientAdd.getText().equals("") && !txtLastnameClientAdd.getText().equals("") && !txtIdClient.getText().equals("") && !txtAddressClientAdd.getText().equals("") && !txtPhoneClientAdd.getText().equals("")) {
            client = new Client(txtNameClientAdd.getText(), txtLastnameClientAdd.getText(), txtIdClient.getText(), txtAddressClientAdd.getText(), txtPhoneClientAdd.getText(), txtaObservationsClientAdd.getText());
            coffe.addClient(client);
        }//End if
<<<<<<< Updated upstream
        else {
    		ifTextIsEmpty(event);
    	}
        txtNameClientAdd.setText("");txtLastnameClientAdd.setText("");txtIdClient.setText("");txtAddressClientAdd.setText("");txtPhoneClientAdd.setText("");txtaObservationsClientAdd.setText("");
=======
        txtNameClientAdd.setText("");
        txtLastnameClientAdd.setText("");
        txtIdClient.setText("");
        txtAddressClientAdd.setText("");
        txtPhoneClientAdd.setText("");
        txtaObservationsClientAdd.setText("");
>>>>>>> Stashed changes
        alert.setContentText("Cliente registrado exitosamente");
        alert.showAndWait();
    }

    public void initializeTableViewIngredient() {
        ObservableList<Ingredient> observableList;
        observableList = FXCollections.observableArrayList(coffe.getIngredients());

        tvIngredientList.setItems(observableList);
        tcNameIngredient.setCellValueFactory(new PropertyValueFactory<Ingredient, String>("nombre")); //the tableview search for a method called getName
        tcStateIngredient.setCellValueFactory(new PropertyValueFactory<Ingredient, Boolean>("estado")); //the tableview search for a method called getEmail
    }

    public void initializeTableViewEmployee() {
        ObservableList<Employee> observableList;
        observableList = FXCollections.observableArrayList(coffe.getEmployees());

        tvEmployee.setItems(observableList);
        tcEmployeeName.setCellValueFactory(new PropertyValueFactory<Employee, String>("nombre")); //the tableview search for a method called getName
        tcEmployeeLastName.setCellValueFactory(new PropertyValueFactory<Employee, String>("apellido")); //the tableview search for a method called getEmail
        tcIdEmployee.setCellValueFactory(new PropertyValueFactory<Employee, String>("id"));
    }

//    Lista de clientes
//    Lista de ordenes
//    Lista de productos
//    A�adir producto
//    Eliminar(Productos, clientes, empleados, ingredientes)
//    Modificar(Productos, clientes, empleados, ingredientes)
//    Deshabilitar()
<<<<<<< Updated upstream

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @FXML
    public void registerProduct(ActionEvent event)throws IOException{
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Informacion");
    	alert.setHeaderText(null);
    	if(!txtProductName.getText().equals("") && !txtProductType.getText().equals("") && !txtProductSyze.getText().equals("") && !txtProductPrice.getText().equals("") && !txtIngredientNameP.getText().equals("") && !txtQuantityProduct.getText().equals("")) {
    		int productSyze = Integer.parseInt(this.txtProductSyze.getText());
    		int productPrice = Integer.parseInt(this.txtProductPrice.getText());
    		int nIngredients = Integer.parseInt(this.txtQuantityProduct.getText());
    		for(int i = 0;i>(nIngredients-1);i++) {
    			registerAnIngredientToProduct(event);
    			if( i == nIngredients) {
    				product = new Product(txtProductName.getText(),txtProductType.getText(),productSyze,true,productPrice);
    				coffe.addProduct(product);
    			}else {
    				alert.setContentText("La cantidad de ingredientes escritos no coincide con la cantidad de ingredientes indicados anteriormente");
    				alert.showAndWait();
    			}
    			txtIngredientNameP.setText("");
    		}	
    	}//End if
    	else {
    		ifTextIsEmpty(event);
    	}
    	txtProductName.setText("");txtProductType.setText("");txtProductSyze.setText("");txtProductPrice.setText("");txtIngredientNameP.setText("");
    	alert.setContentText("Producto registrado exitosamente");
    	alert.showAndWait();
    }
    
    @FXML
    public void registerAnIngredientToProduct(ActionEvent event)throws IOException{
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Informacion");
    	alert.setHeaderText(null);
    	Ingredient ingredientName = coffe.searchIngredient(this.txtIngredientNameP.getText());
    	if(ingredientName!=null) {
    		product.addIngredient(ingredientName);
    	}else {
    		alert.setContentText("El ingrediente no se encuentra registrado en el restaurante");
    		alert.showAndWait();
    	}
    }

    
    @FXML
    public void registerOrder(ActionEvent event)throws IOException{
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Informacion");
    	alert.setHeaderText(null);
    	if(!txtQuantityProductsInOrder.getText().equals("") && !txtNameProductsOrder.getText().equals("") && !txtaObservationsOrder.getText().equals("")) {
    		int nProducts = Integer.parseInt(this.txtQuantityProductsInOrder.getText());
    		for(int i = 0;i>(nProducts-1);i++) {
    			registerAnProductInOrder(event);
    			if( i == nProducts) {
    				order = new Order(1,txtaObservationsOrder.getText());
    				coffe.addOrder(order);
    			}else {
    				alert.setContentText("La cantidad de productos escritos no coincide con la cantidad de productos indicados anteriormente");
    				alert.showAndWait();
    			}
    			txtNameProductsOrder.setText("");
    		}	
    	}//End if
    	else {
    		ifTextIsEmpty(event);
    	}
    	txtQuantityProductsInOrder.setText("");txtNameProductsOrder.setText("");txtaObservationsOrder.setText("");
    	alert.setContentText("Orden registrada exitosamente");
    	alert.showAndWait();
    }
    
    @FXML
    public void registerAnProductInOrder(ActionEvent event)throws IOException{
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Informacion");
    	alert.setHeaderText(null);
    		Product productName = coffe.searchProduct(this.txtNameProductsOrder.getText());
    		if(productName!=null) {
    			order.addProduct(productName);
    		}else {
    			alert.setContentText("El producto no se encuentra registrado en el restaurante");
    			alert.showAndWait();
    		}
    }
    
    @FXML
    public void loadAddAnOrder(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddAnOrder.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadAddClient(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddClient.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadAddEmployee(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddEmployee.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadAddIngredient(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddIngredient.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadAddProduct(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProduct.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadInitialMenu(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InitialMenu.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadListClients(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListClients.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadListEmployee(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListEmployee.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadListOrders(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListOrders.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadLoginScreen(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginScreen.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadMainPanel(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainPanel.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadMenuOrder(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MenuOrder.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadPersonalAdmin(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PersonalAdmin.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadPrAndIng(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PrAndIng.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadShowIngredient(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ShowIngredient.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void loadShowProduct(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ShowProduct.fxml"));
		
		fxmlLoader.setController(this);    	
		Parent add = fxmlLoader.load();
    	
		mainPanel.getChildren().clear();
    	mainPanel.setTop(add);
    	Stage st = (Stage)
    	add.getScene().getWindow();
		st.setHeight(575);
		st.setWidth(372);
    }
    
    @FXML
    public void ifTextIsEmpty(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informacion");
        alert.setHeaderText(null);
        alert.setContentText("Porfavor, verifique que los campos no esten vacios");
    	alert.showAndWait();
    }
    
=======
    public void initializeTableViewClients() {
        ObservableList<Client> observableList;
        observableList = FXCollections.observableArrayList(coffe.getClients());

        tableClients.setItems(observableList);
        tableClientsNumber.setCellValueFactory(new PropertyValueFactory<Client, Integer>("N°"));//the tableview 
        tableClientsName.setCellValueFactory(new PropertyValueFactory<Client, String>("Nombre")); //the tableview search for a method called getName
        tableLastNameClients.setCellValueFactory(new PropertyValueFactory<Client, String>("apellido")); //the tableview search for a method called getLastName
        tableAddressClient.setCellValueFactory(new PropertyValueFactory<Client, String>("Dirección"));//the tableview search for a method called getDirection
        tablePhoneClient.setCellValueFactory(new PropertyValueFactory<Client, String>("Teléfono"));//the tableview search for a method called getPhone
    }

    public void initializeTableViewOrders() {
        ObservableList<Order> observableList;
        observableList = FXCollections.observableArrayList(coffe.g);

    }

>>>>>>> Stashed changes
}
