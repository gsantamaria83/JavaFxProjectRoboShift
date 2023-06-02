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

public class Scene9Controller implements Initializable {
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
	Label lblPosicion;
	@FXML
	Label lblUser;
	
	//Metodo de inicializacion del controlador para el archivo FXML
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		btnContinuar.setDisable(true);
		EstablecerNuevaPosicion("Inicial");
	}
	
	public void EstablecerNuevaPosicion(String texto) {
		lblPosicion.setText(texto);
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
		if( (!texto2.trim().equals("right") && lblPosicion.getText().equals("Inicial"))|(!texto2.trim().equals("straight") && lblPosicion.getText().equals("pfA"))| (!texto2.trim().equals("left") && lblPosicion.getText().equals("pfB")) ) {
			result = "Error: Verifica la direccion del robot. Has escrito " + texto2;
			Scoring(-100);
			return result;
		}
		if( (!texto2.trim().equals("straight") && lblPosicion.getText().equals("pfC"))|(!texto2.trim().equals("right") && lblPosicion.getText().equals("pfD"))| (!texto2.trim().equals("straight") && lblPosicion.getText().equals("pfE")) ) {
			result = "Error: Verifica la direccion del robot. Has escrito " + texto2;
			Scoring(-100);
			return result;
		}
		if( (!texto2.trim().equals("right") && lblPosicion.getText().equals("pfF"))|(!texto2.trim().equals("forward") && lblPosicion.getText().equals("pfG"))| (!texto2.trim().equals("right") && lblPosicion.getText().equals("pfH")) ) {
			result = "Error: Verifica la direccion del robot. Has escrito " + texto2;
			Scoring(-100);
			return result;
		}
		if( (!texto2.trim().equals("straight") && lblPosicion.getText().equals("pfI"))) {
			result = "Error: Verifica la direccion del robot. Has escrito " + texto2;
			Scoring(-100);
			return result;
		}
		if((!texto3.trim().equals("pfA") && lblPosicion.getText().equals("Inicial")) | (!texto3.trim().equals("pfB") && lblPosicion.getText().equals("pfA")) | (!texto3.trim().equals("pfC") && lblPosicion.getText().equals("pfB")) ) {
			result = "Error: Verifica la posicion de movimiento del robot. Has escrito " + texto3;
			Scoring(-100);
			return result;
		}
		if((!texto3.trim().equals("pfC") && lblPosicion.getText().equals("pfB")) | (!texto3.trim().equals("pfD") && lblPosicion.getText().equals("pfC")) | (!texto3.trim().equals("pfE") && lblPosicion.getText().equals("pfD")) ) {
			result = "Error: Verifica la posicion de movimiento del robot. Has escrito " + texto3;
			Scoring(-100);
			return result;
		}
		if((!texto3.trim().equals("pfF") && lblPosicion.getText().equals("pfE")) | (!texto3.trim().equals("pfG") && lblPosicion.getText().equals("pfF")) | (!texto3.trim().equals("pfH") && lblPosicion.getText().equals("pfG")) ) {
			result = "Error: Verifica la posicion de movimiento del robot. Has escrito " + texto3;
			Scoring(-100);
			return result;
		}
		if((!texto3.trim().equals("pfI") && lblPosicion.getText().equals("pfH")) | (!texto3.trim().equals("pfJ") && lblPosicion.getText().equals("pfI"))) {
			result = "Error: Verifica la posicion de movimiento del robot. Has escrito " + texto3;
			Scoring(-100);
			return result;
		}
		if(lblPosicion.getText().equals("Inicial") && !texto3.trim().equals("pfA")) {
			result = "Error: No puedes pasar de la posicion " + lblPosicion.getText() + "hacia la posicion " + texto3;
			Scoring(-100);
			return result;
		}
		if(lblPosicion.getText().equals("pfA") && !texto3.trim().equals("pfB")) {
			result = "Error: No puedes pasar de la posicion " + lblPosicion.getText() + "hacia la posicion " + texto3;
			Scoring(-100);
			return result;
		}
		if(lblPosicion.getText().equals("pfB") && !texto3.trim().equals("pfC")) {
			result = "Error: No puedes pasar de la posicion " + lblPosicion.getText() + "hacia la posicion " + texto3;
			Scoring(-100);
			return result;
		}
		if(lblPosicion.getText().equals("pfC") && !texto3.trim().equals("pfD")) {
			result = "Error: No puedes pasar de la posicion " + lblPosicion.getText() + "hacia la posicion " + texto3;
			Scoring(-100);
			return result;
		}
		if(lblPosicion.getText().equals("pfD") && !texto3.trim().equals("pfE")) {
			result = "Error: No puedes pasar de la posicion " + lblPosicion.getText() + "hacia la posicion " + texto3;
			Scoring(-100);
			return result;
		}
		if(lblPosicion.getText().equals("pfE") && !texto3.trim().equals("pfF")) {
			result = "Error: No puedes pasar de la posicion " + lblPosicion.getText() + "hacia la posicion " + texto3;
			Scoring(-100);
			return result;
		}
		if(lblPosicion.getText().equals("pfF") && !texto3.trim().equals("pfG")) {
			result = "Error: No puedes pasar de la posicion " + lblPosicion.getText() + "hacia la posicion " + texto3;
			Scoring(-100);
			return result;
		}
		if(lblPosicion.getText().equals("pfG") && !texto3.trim().equals("pfH")) {
			result = "Error: No puedes pasar de la posicion " + lblPosicion.getText() + "hacia la posicion " + texto3;
			Scoring(-100);
			return result;
		}
		if(lblPosicion.getText().equals("pfH") && !texto3.trim().equals("pfI")) {
			result = "Error: No puedes pasar de la posicion " + lblPosicion.getText() + "hacia la posicion " + texto3;
			Scoring(-100);
			return result;
		}
		if(lblPosicion.getText().equals("pfI") && !texto3.trim().equals("pfJ")) {
			result = "Error: No puedes pasar de la posicion " + lblPosicion.getText() + "hacia la posicion " + texto3;
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
			String user = lblUser.getText();
			loader = new FXMLLoader(getClass().getResource("Scene7.fxml"));
			root = loader.load();
			Scene9Controller scene6Controller = loader.getController();
			scene6Controller.lblScore.setText(score);
			scene6Controller.lblUser.setText(user);
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
				
				lblMensaje.setText("Codigo ejecutado correctamente !!!");
				if(lblPosicion.getText().equals("Inicial")) {
					EstablecerNuevaPosicion("pfA");
					utilidades.TraslacionImagen(myImage,Duration.millis(2000),148,"Y",false);
					Scoring(1000);
				}
				else if(lblPosicion.getText().equals("pfA")) {
					utilidades.TraslacionImagen(myImage,Duration.millis(2000),100,"X",false);
					EstablecerNuevaPosicion("pfB");
					Scoring(1000);
				}
				else if(lblPosicion.getText().equals("pfB")) {
					utilidades.TraslacionImagen(myImage,Duration.millis(2000),-200,"Y",false);
					EstablecerNuevaPosicion("pfC");
					Scoring(1000);
				}
				else if(lblPosicion.getText().equals("pfC")) {
					utilidades.TraslacionImagen(myImage,Duration.millis(2000),100,"X",false);
					EstablecerNuevaPosicion("pfD");
					Scoring(1000);
				}
				else if(lblPosicion.getText().equals("pfD")) {
					utilidades.TraslacionImagen(myImage,Duration.millis(2000),70,"Y",false);
					EstablecerNuevaPosicion("pfE");
					Scoring(1000);
				}
				else if(lblPosicion.getText().equals("pfE")) {
					utilidades.TraslacionImagen(myImage,Duration.millis(2000),150,"X",false);
					EstablecerNuevaPosicion("pfF");
					Scoring(1000);
				}
				else if(lblPosicion.getText().equals("pfF")) {
					utilidades.TraslacionImagen(myImage,Duration.millis(2000),70,"Y",false);
					EstablecerNuevaPosicion("pfG");
					Scoring(1000);
				}
				else if(lblPosicion.getText().equals("pfG")) {
					utilidades.TraslacionImagen(myImage,Duration.millis(2000),-160,"X",false);
					EstablecerNuevaPosicion("pfH");
					Scoring(1000);
				}
				else if(lblPosicion.getText().equals("pfH")) {
					utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"Y",false);
					EstablecerNuevaPosicion("pfI");
					Scoring(1000);
				}
				else if(lblPosicion.getText().equals("pfI")) {
					utilidades.TraslacionImagen(myImage,Duration.millis(2000),200,"X",false);
					EstablecerNuevaPosicion("pfJ");
					Scoring(1000);
					btnContinuar.setDisable(false);
				}
				txtCodigo.setText("");
				txtCodigo2.setText("");
				txtCodigo3.setText("");
			}
			
		}
	}
}
