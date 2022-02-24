/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package proyectoheroe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class ProyectoHeroe extends Application {
    
    @Override
    
    public void start(Stage primaryStage){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/FXMLLoginController.fxml"));
            Parent root = loader.load();
            Object FXMLLoginController = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(ProyectoHeroe.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  }
        /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        launch(args);
    }
}