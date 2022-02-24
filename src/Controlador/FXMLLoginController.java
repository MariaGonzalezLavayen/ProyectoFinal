/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Controlador;

import Dao.LoginDao;
import Dao.LoginDaoImpl;
import Modelo.Login;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Usuario
 */
public class FXMLLoginController implements Initializable {

    @FXML
    private Button btnIniciarSeccion;

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private Label Usuario;

    @FXML
    private Label contraseña;

    @FXML
    void Iniciar(ActionEvent event) {
        LoginDao logindao = new LoginDaoImpl();
        Login login = logindao.read(this.txtUsuario.getText());
        
        if (login != null){
            this.txtUsuario.setText(login.getUsuario());
            this.txtContraseña.setText(login.getContraseña());
//            this.cboRegion.getSelectionModel().getSelectedItem();
//            this.cboRegion.selectionModelProperty()
    
        }
        else{
             Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setContentText("No existe el codigo del pais" + this.txtUsuario.getText()+ "en la base de datos");
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


