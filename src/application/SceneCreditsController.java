package application;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SceneCreditsController implements Initializable {
	@FXML
	Label lblUser;
	@FXML
	Parent root;
	@FXML
	Stage stage;
	@FXML
	Scene scene;
	@FXML
	FXMLLoader loader;
	@FXML
	Button btnSalir;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void SwitchScene(ActionEvent event) throws IOException{
		cerrarVentana(event);		
	}
	
	public static void cerrarVentana(ActionEvent e) {
		Node source = (Node) e.getSource();     
		Stage stage = (Stage) source.getScene().getWindow();    
		stage.close();                          
		}

}
