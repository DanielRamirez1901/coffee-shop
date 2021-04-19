
package ui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Coffe;

/**
 *
*@author DanielRamirez<br>
*@author AmilcarRodriguez<br>
*/
public class Main extends Application{
	
	private LoginScreenController loginScreenController;//The controller class is defined in this attribute
	private Coffe coffe;//This attribute contains the relationship with the main class of the model
	
	/**
     * Main class construct method<br>
     * <b>pre:</b><br>
     * <b>post:</b><br>
     */
	public Main() {
		coffe = new Coffe();
		loginScreenController = new LoginScreenController(coffe);
	}//End Main method
	
//***************************************************************************************************************************

	public static void main(String[] args) {
		launch(args);
	}
	
	/**
     * This method allows executing the corresponding fxml in addition to establishing the controller class<br>
     * <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param primaryStage is a Stage in which we will add all the objects of our graphical interface<br>
     */
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainPanel.fxml"));

		fxmlLoader.setController(loginScreenController);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Casa dorada");
		primaryStage.show();
	}//End start method
}//End Main
