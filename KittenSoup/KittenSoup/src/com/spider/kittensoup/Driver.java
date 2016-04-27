package com.spider.kittensoup;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/*
 * @author Daniye S. Bartell
 * @version 4/25/2016
 */
public class Driver extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		try {
			AnchorPane root =(AnchorPane) FXMLLoader.load(Driver.class.getResource("SoupGUI.fxml"));
			Scene scene = new Scene(root,640,480);
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException
	{
		launch(args);
	}
}
