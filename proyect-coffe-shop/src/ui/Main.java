
package ui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Employee;

/**
 *
 * @author amilc
 */
public class Main extends Application{
	
	private LoginScreenController loginScreenController;
	private Employee employee;

	public Main() {
	}
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginScreen.fxml"));

		fxmlLoader.setController(loginScreenController);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Casa dorada");
		primaryStage.show();
	}

    
}
