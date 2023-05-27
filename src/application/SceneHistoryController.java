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
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SceneHistoryController implements Initializable {
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void SwitchScene(ActionEvent event) throws IOException{
		String user = lblUser.getText();
		loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
		root = loader.load();
		Scene2Controller sceneController = loader.getController();
		sceneController.lblUser.setText(user);
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}

}
