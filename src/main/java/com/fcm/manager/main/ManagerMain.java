package com.fcm.manager.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;

public class ManagerMain extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root = FXMLLoader.load (getClass().getClassLoader().getResource("com/fcm/ope/javafx/fxml/dieno2.fxml"));		    
		Scene scene = new Scene(root);
//		stage.getIcons().add(new Image(getClass().getClassLoader().getResourceAsStream("com/fcm/ope/javafx/sources/logoblanco2.jpg")));
        stage.setTitle("Manager -FCM Computación Mexicana S.AS");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.setResizable(true);
        stage.show();

	}
	
	public static void main (String []args){
		Application.launch(args);
	}
	
}