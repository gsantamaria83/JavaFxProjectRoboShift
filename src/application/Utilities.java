package application;

import java.io.IOException;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Utilities {
	//Inicializacion de variables
	private String texto;
	private Parent root;
	//Constructor para validación de mensajes
	public Utilities(String textoEntrada) {
		texto = textoEntrada;
	}
	
	//Constructor de propósito general
	public Utilities() {
		
	}
	
	//Método para realizar la validacion del codigo generado por el usuario
	public String ValidarCodigoGeneral() {
		String result = "";
		String[] textoSeparado = texto.split(";");
		if(textoSeparado.length == 3) {
			result = texto + ";" +  "Error: Codigo no tiene la cantidad correcta de comandos";
			return result;
		}
		if(textoSeparado[0] != "mov") {
			result = texto + ";" +  "Error: Verifica que la primera instruccion empieza con mov";
			return result;
		}
		if(textoSeparado[1] != "right" | textoSeparado[1] != "left" | textoSeparado[1] != "straight" | textoSeparado[1] != "forward" ) {
			result = texto + ";" +  "Error: Verifica la direccion del robot. Has escrito " + textoSeparado[1];
			return result;
		}
		if(textoSeparado[2].trim() != "pfa") {
			result = texto + ";" +   "Error: Verifica la posicion de movimiento del robot. Has escrito " + textoSeparado[2];
			return result;
		}
		return result;
	}
	
	public String ValidarCodigoGeneral2(String texto1, String texto2, String texto3) {
		String result = "";
		if(texto1 == "" && texto2 == "" && texto3 == "") {
			result = "Error: Codigo no tiene la cantidad correcta de comandos";
			return result;
		}
		if(texto1.trim() != "mov") {
			result = "Error: Verifica que la primera instruccion empieza con mov";
			return result;
		}
		if(texto2 != "right" ) {
			result = "Error: Verifica la direccion del robot. Has escrito " + texto2;
			return result;
		}
		if(texto3 != "pfa") {
			result = "Error: Verifica la posicion de movimiento del robot. Has escrito " + texto3;
			return result;
		}
		return result;
	}
	
	public String ValidarCodigoPorExtension(String textoCodigo,String textoInstruccion) {
		String[] validacionCodigo = textoCodigo.split(" ");
		String[] validador = textoInstruccion.split(";");
		String mensaje = "";
		
		if(validacionCodigo[1] == validador[0]) {
			mensaje = "Verifica el desplazamiento en tu codigo para la posicion";
		}
		
		if(validacionCodigo[2] == validador[1]) {
			mensaje = "Verifica la posicion a la que te estas desplazando";
		}
		
		return mensaje;
	}
	
	//Método para realizar los movimientos del robot y su distancia
	public void TraslacionImagen(ImageView image,Duration duration, double setY, String tipoTraslacion, boolean setAutoReverse) {
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(image);
		translate.setDuration(duration);
		translate.setCycleCount(1);
		
		if(tipoTraslacion == "X") {
			translate.setByX(setY);
		}
		else {
			translate.setByY(setY);
		}
		
		translate.setAutoReverse(setAutoReverse);
		translate.play();
	}
	
	public void SwitchScene(ActionEvent event,String archivoFxml) throws IOException {
		root = FXMLLoader.load(getClass().getResource(archivoFxml));
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
