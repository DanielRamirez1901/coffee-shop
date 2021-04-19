
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
	
	private LoginScreenController loginScreenController;
	private Coffe coffe;

	public Main() {
		coffe = new Coffe();
		loginScreenController = new LoginScreenController(coffe);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainPanel.fxml"));

		fxmlLoader.setController(loginScreenController);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Casa dorada");
		primaryStage.show();
	}

    
}
