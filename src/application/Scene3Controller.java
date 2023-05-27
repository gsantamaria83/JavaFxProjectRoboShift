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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Scene3Controller implements Initializable {
	//Inicializacion de variables a utilizar desde el archivo FXML
	//Inicializacion de variables a utilizar desde el archivo FXML
	@FXML
	Parent root;
	@FXML
	FXMLLoader loader;
	@FXML
	Stage stage;
	@FXML
	Scene scene;
	@FXML
	TextField txtCodigo;
	@FXML
	TextField txtCodigo2;
	@FXML
	TextField txtCodigo3;
	@FXML
	Label lblMensaje;
	@FXML
	ImageView myImage;
	@FXML
	Button btnContinuar;
	@FXML
	Label lblScore;
	@FXML
	Label lblUser;
	
	//Metodo de inicializacion del controlador para el archivo FXML
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		btnContinuar.setDisable(true);
	}
	
	//Validacion posterior del codigo ejecutado por el usuario, si esta correctamente creado
	public String ValidarLineasCodigo(String textoCodigo1,String textoCodigo2, String textoCodigo3) {
		String validacionCodigo2 = txtCodigo2.getText();
		String validacionCodigo3 = txtCodigo3.getText();
		String mensaje = "";
		
		if(validacionCodigo2 == "straight") {
			mensaje = "Verifica el desplazamiento en tu codigo para la posicion";
			Scoring(-100);
		}
		
		if(validacionCodigo3 == "pfA") {
			mensaje = "Verifica la posicion a la que te estas desplazando";
			Scoring(-100);
		}
		
		return mensaje;
	}
	//Validacion inicial del codigo ejecutado por el usuario, si esta correctamente creado
	public String ValidarCodigoGeneral2(String texto1, String texto2, String texto3) {
		String result = "";
		if(texto1 == "" && texto2 == "" && texto3 == "") {
			result = "Error: Codigo no tiene la cantidad correcta de comandos";
			Scoring(-100);
			return result;
		}
		if(!texto1.trim().equals("mov") ) {
			result = "Error: Verifica que la primera instruccion empieza con mov. Escribiste " + texto1;
			Scoring(-100);
			return result;
		}
		if( !texto2.trim().equals("forward")) {
			result = "Error: Verifica la direccion del robot. Has escrito " + texto2;
			Scoring(-100);
			return result;
		}
		if(!texto3.trim().equals("pfA")) {
			result = "Error: Verifica la posicion de movimiento del robot. Has escrito " + texto3;
			Scoring(-100);
			return result;
		}
		return result;
	}
	
	//Metodo para generar el puntaje de la solución de codigo
		public void Scoring(Integer scoreGenerado) {
			Integer scoreActual = Integer.valueOf(lblScore.getText());
			lblScore.setText(String.valueOf(scoreActual + scoreGenerado));
		}
	
		public void SwitchScene(ActionEvent event)throws IOException{
			String score = lblScore.getText();
			String user = lblScore.getText();
			loader = new FXMLLoader(getClass().getResource("Scene4.fxml"));
			root = loader.load();
			Scene4Controller scene4Controller = loader.getController();
			scene4Controller.lblScore.setText(score);
			scene4Controller.lblUser.setText(user);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	
	//Metodo general de validacion del codigo ejecutado por el usuario
	public void ValidarCodigo(ActionEvent event) throws IOException{
		Utilities utilidades = new Utilities();	
		String mensaje = ValidarCodigoGeneral2(txtCodigo.getText(),txtCodigo2.getText(),txtCodigo3.getText());
		if(mensaje.trim() != "") {
			lblMensaje.setText(mensaje);
			txtCodigo.setText("");
			txtCodigo2.setText("");
			txtCodigo3.setText("");
		}
		else {
			mensaje = ValidarLineasCodigo(txtCodigo.getText(),txtCodigo2.getText(),txtCodigo3.getText());
			if(mensaje.trim() != "") {
				lblMensaje.setText(mensaje);
				txtCodigo.setText("");
				txtCodigo2.setText("");
				txtCodigo3.setText("");
			}
			else {
				utilidades.TraslacionImagen(myImage,Duration.millis(2000),-330,"X",false);
				lblMensaje.setText("Codigo ejecutado correctamente !!!");
				Scoring(1000);
				txtCodigo.setText("");
				txtCodigo2.setText("");
				txtCodigo3.setText("");
				btnContinuar.setDisable(false);
			}
			
		}
	}
}
