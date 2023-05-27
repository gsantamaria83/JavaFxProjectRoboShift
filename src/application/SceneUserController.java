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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class SceneUserController implements Initializable {
	@FXML
	private TextField txtUser;
	@FXML
	FXMLLoader loader;
	@FXML
	Stage stage;
	@FXML
	Scene scene;
	@FXML
	Parent root;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void SwitchScene(ActionEvent event)throws IOException{
		String user = txtUser.getText();
		loader = new FXMLLoader(getClass().getResource("SceneHistory.fxml"));
		root = loader.load();
		SceneHistoryController scene5Controller = loader.getController();
		scene5Controller.lblUser.setText(user);
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	

}
