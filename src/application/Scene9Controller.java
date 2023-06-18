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
	
	//Validacion inicial del codigo ejecutado por el usuario, si esta correctamente creado
	public void ValidarCodigoGeneral2(String texto1, String texto2, String texto3) {
		Utilities utilidades = new Utilities();
		String result = "";
		if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfA") && lblPosicion.getText().equals("Inicial"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),135,"Y",false);EstablecerNuevaPosicion("pfA");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfB") && lblPosicion.getText().equals("pfA"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfB");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfH") && lblPosicion.getText().equals("pfB"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"Y",false);EstablecerNuevaPosicion("pfH");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfC") && lblPosicion.getText().equals("pfB"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-45,"Y",false);EstablecerNuevaPosicion("pfC");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfD") && lblPosicion.getText().equals("pfC"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfD");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfH") && lblPosicion.getText().equals("pfC"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),100,"Y",false);EstablecerNuevaPosicion("pfH");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfB") && lblPosicion.getText().equals("pfC"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"Y",false);EstablecerNuevaPosicion("pfB");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfC") && lblPosicion.getText().equals("pfH"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-200,"Y",false);EstablecerNuevaPosicion("pfC");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfE") && lblPosicion.getText().equals("pfD"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-45,"Y",false);EstablecerNuevaPosicion("pfE");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfF") && lblPosicion.getText().equals("pfE"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pfF");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfI") && lblPosicion.getText().equals("pfH"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfI");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfG") && lblPosicion.getText().equals("pfH"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pfG");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfJ") && lblPosicion.getText().equals("pfG"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"Y",false);EstablecerNuevaPosicion("pfJ");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfI") && lblPosicion.getText().equals("pfG"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),100,"X",false);EstablecerNuevaPosicion("pfI");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfK") && lblPosicion.getText().equals("pfJ"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfK");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfO") && lblPosicion.getText().equals("pfK"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),45,"Y",false);EstablecerNuevaPosicion("pfO");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfK") && lblPosicion.getText().equals("pfO"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"Y",false);EstablecerNuevaPosicion("pfK");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfJ") && lblPosicion.getText().equals("pfK"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pfJ");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfN") && lblPosicion.getText().equals("pfO"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pfN");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfP") && lblPosicion.getText().equals("pfN"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),200,"X",false);EstablecerNuevaPosicion("pfP");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfO") && lblPosicion.getText().equals("pfP"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pfO");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfN") && lblPosicion.getText().equals("pfP"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-100,"X",false);EstablecerNuevaPosicion("pfN");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfG") && lblPosicion.getText().equals("pfJ"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-45,"Y",false);EstablecerNuevaPosicion("pfG");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfH") && lblPosicion.getText().equals("pfG"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfH");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfI") && lblPosicion.getText().equals("pfH"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfI");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfW") && lblPosicion.getText().equals("pfI"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"Y",false);EstablecerNuevaPosicion("pfW");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfL") && lblPosicion.getText().equals("pfW"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),100,"Y",false);EstablecerNuevaPosicion("pfL");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfL") && lblPosicion.getText().equals("pfI"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"Y",false);EstablecerNuevaPosicion("pfL");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfX") && lblPosicion.getText().equals("pfW"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfX");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfM") && lblPosicion.getText().equals("pfL"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfM");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfL") && lblPosicion.getText().equals("pfM"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pfL");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfI") && lblPosicion.getText().equals("pfL"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"Y",false);EstablecerNuevaPosicion("pfI");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfQ") && lblPosicion.getText().equals("pfM"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"Y",false);EstablecerNuevaPosicion("pfQ");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfS") && lblPosicion.getText().equals("pfQ"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),95,"X",false);EstablecerNuevaPosicion("pfS");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfQ") && lblPosicion.getText().equals("pfS"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-200,"Y",false);EstablecerNuevaPosicion("pfQ");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfM") && lblPosicion.getText().equals("pfQ"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"Y",false);EstablecerNuevaPosicion("pfM");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfT") && lblPosicion.getText().equals("pfS"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"Y",false);EstablecerNuevaPosicion("pfT");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfS") && lblPosicion.getText().equals("pfT"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"Y",false);EstablecerNuevaPosicion("pfS");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfU") && lblPosicion.getText().equals("pfT"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),45,"X",false);EstablecerNuevaPosicion("pfU");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfT") && lblPosicion.getText().equals("pfU"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pfT");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfV") && lblPosicion.getText().equals("pfU"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"Y",false);EstablecerNuevaPosicion("pfV");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfU") && lblPosicion.getText().equals("pfV"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"Y",false);EstablecerNuevaPosicion("pfU");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfW") && lblPosicion.getText().equals("pfX"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pfW");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfY") && lblPosicion.getText().equals("pfX"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-45,"Y",false);EstablecerNuevaPosicion("pfY");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfZ") && lblPosicion.getText().equals("pfY"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfZ");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfY") && lblPosicion.getText().equals("pfZ"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pfY");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pgC") && lblPosicion.getText().equals("pfZ"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pgC");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfZ") && lblPosicion.getText().equals("pgC"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pfZ");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfY") && lblPosicion.getText().equals("pgC"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-200,"X",false);EstablecerNuevaPosicion("pfY");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pgC") && lblPosicion.getText().equals("pfY"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),95,"X",false);EstablecerNuevaPosicion("pgC");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pgD") && lblPosicion.getText().equals("pgC"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-45,"Y",false);EstablecerNuevaPosicion("pgD");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pgF") && lblPosicion.getText().equals("pgD"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-100,"X",false);EstablecerNuevaPosicion("pgF");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pgD") && lblPosicion.getText().equals("pgF"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),100,"X",false);EstablecerNuevaPosicion("pgD");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pgC") && lblPosicion.getText().equals("pgD"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"Y",false);EstablecerNuevaPosicion("pgC");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pgE") && lblPosicion.getText().equals("pgC"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),100,"Y",false);EstablecerNuevaPosicion("pgE");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pgC") && lblPosicion.getText().equals("pgE"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-200,"Y",false);EstablecerNuevaPosicion("pgC");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pgH") && lblPosicion.getText().equals("pgE"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),45,"X",false);EstablecerNuevaPosicion("pgH");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pgI") && lblPosicion.getText().equals("pgH"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-140,"Y",false);EstablecerNuevaPosicion("pgI");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pgJ") && lblPosicion.getText().equals("pgI"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pgJ");Scoring(2000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfR") && lblPosicion.getText().equals("pfZ"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),100,"Y",false);EstablecerNuevaPosicion("pfR");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfZ") && lblPosicion.getText().equals("pfR"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-100,"Y",false);EstablecerNuevaPosicion("pfZ");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pgB") && lblPosicion.getText().equals("pfR"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"Y",false);EstablecerNuevaPosicion("pgB");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfR") && lblPosicion.getText().equals("pgB"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"Y",false);EstablecerNuevaPosicion("pfR");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pgA") && lblPosicion.getText().equals("pfR"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pgA");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfR") && lblPosicion.getText().equals("pgA"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfR");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfE") && lblPosicion.getText().equals("pfF"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfE");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfD") && lblPosicion.getText().equals("pfE"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),45,"Y",false);EstablecerNuevaPosicion("pfD");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfC") && lblPosicion.getText().equals("pfD"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-50,"X",false);EstablecerNuevaPosicion("pfC");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfP") && lblPosicion.getText().equals("pfO"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfP");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("straight") && texto3.equals("pfO") && lblPosicion.getText().equals("pfN"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),50,"X",false);EstablecerNuevaPosicion("pfO");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("forward") && texto3.equals("pfQ") && lblPosicion.getText().equals("pfS"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-95,"X",false);EstablecerNuevaPosicion("pfQ");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfW") && lblPosicion.getText().equals("pfJ"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),100,"Y",false);EstablecerNuevaPosicion("pfW");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfW") && lblPosicion.getText().equals("pfL"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-100,"Y",false);EstablecerNuevaPosicion("pfW");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pfX") && lblPosicion.getText().equals("pfY"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),45,"Y",false);EstablecerNuevaPosicion("pfX");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pgE") && lblPosicion.getText().equals("pgD"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),100,"Y",false);EstablecerNuevaPosicion("pgE");Scoring(1000); }
		else if( (texto1.equals("mov") && texto2.trim().equals("left") && texto3.equals("pfZ") && lblPosicion.getText().equals("pgB"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),-140,"Y",false);EstablecerNuevaPosicion("pfZ");Scoring(0); }
		else if( (texto1.equals("mov") && texto2.trim().equals("right") && texto3.equals("pgB") && lblPosicion.getText().equals("pfZ"))) { utilidades.TraslacionImagen(myImage,Duration.millis(2000),140,"Y",false);EstablecerNuevaPosicion("pgB");Scoring(0); }
		else
		{
			Scoring(-100);
			result = "Ha ocurrido un error en tu codigo. Por favor revisa";
		}
		if(result.equals("")) {
			result = "Codigo ejecutado correctamente !!!";
		}
		txtCodigo.setText("");
		txtCodigo2.setText("");
		txtCodigo3.setText("");
		
		if(lblPosicion.getText().equals("pgJ")) {
			lblMensaje.setText("Has terminado correctamente las ejecuciones de codigo !!!");
			btnContinuar.setDisable(false);
		}
		else {
			lblMensaje.setText(result);
		}
	}
	
	//Metodo para generar el puntaje de la solución de codigo
		public void Scoring(Integer scoreGenerado) {
			Integer scoreActual = Integer.valueOf(lblScore.getText());
			lblScore.setText(String.valueOf(scoreActual + scoreGenerado));
		}
	
		public void SwitchScene(ActionEvent event)throws IOException{
			root = FXMLLoader.load(getClass().getResource("SceneCredits.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	
	//Metodo general de validacion del codigo ejecutado por el usuario
	public void ValidarCodigo(ActionEvent event) throws IOException{
		ValidarCodigoGeneral2(txtCodigo.getText(),txtCodigo2.getText(),txtCodigo3.getText());
	}
}
