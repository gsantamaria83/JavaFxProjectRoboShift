package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SceneController implements Initializable {
	@FXML
	private ImageView myImage;
	private Parent root;
	private Stage stage;
	private Scene scene;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//RotateTransition rotate = new RotateTransition();
		//rotate.setNode(myImage);
		//rotate.setDuration(Duration.seconds(5));
		//rotate.setCycleCount(RotateTransition.INDEFINITE);
		///rotate.setAutoReverse(false);
		//rotate.play();
		
		//TranslateTransition translate = new TranslateTransition();
		//translate.setNode(myImage);
		//translate.setDuration(Duration.millis(2000));
		//translate.setCycleCount(TranslateTransition.INDEFINITE);
		//translate.setByX(700);
		//translate.setAutoReverse(false);
		//translate.play();
		
		Duration duracion = Duration.millis(2000);
		double setYImage = 780;
		TraslacionImagen(myImage,duracion,setYImage,false);
	}
	
	public void TraslacionLabel(Label label,Duration duration, int setY, boolean setAutoReverse) {
		label.setRotate(45);
		label.setRotate(45);
		label.setRotate(45);
		label.setRotate(45);
	}
	
	public void TraslacionImagen(ImageView image,Duration duration, double setY, boolean setAutoReverse) {
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(image);
		translate.setDuration(duration);
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setByX(setY);
		translate.setAutoReverse(setAutoReverse);
		translate.play();
	}
	
	public void IniciarJuego(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SceneUser.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
