package application;


import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Utilities {
	
	//Constructor de propósito general
	public Utilities() {
		
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
}
