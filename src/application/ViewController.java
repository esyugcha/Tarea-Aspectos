package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ViewController {
	@FXML
	Button red = new Button();
	@FXML
	Button green = new Button();
	@FXML
	Button blue  = new Button();
	@FXML
	Pane panel = new Pane();
	
	public void cambiarR() {
		panel.setStyle("-fx-background-color:red;");
	}
	
	public void cambiarG() {
		panel.setStyle("-fx-background-color:green;");
	}
	
	public void cambiarB() {
		panel.setStyle("-fx-background-color:blue;");
	}
	
	public void detectarR() {
		cambiarR();
	}
	
	public void detectarG() {
		cambiarG();
	}
	
	public void detectarB() {
		cambiarB();
	}
}