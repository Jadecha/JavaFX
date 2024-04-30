package senati.pe.proyectojavafx;

import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnIngresar;

    @FXML
    private AnchorPane anchorCancel;

    @FXML
    private PasswordField pfClave;

    @FXML
    private TextField tfUsuario;

    @FXML
    protected void onAceptarClick(){
        String usuario = this.tfUsuario.getText();
        String clave = pfClave.getText();
        /*Alert alert =new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Inicio de seción");
        alert.setContentText("Datos Incorrectos ,Aceso denegado");*/

        if(usuario.trim().equals("Jade")&& clave.equals("123456")) {
           mensaje("Bienvenido al sistema", Alert.AlertType.INFORMATION,"Bienvenido");
            /* alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Bienvenido al sistema");*/
        }else{
            mensaje("acceso denegado", Alert.AlertType.ERROR,"ERROR");
        }

        //alert.showAndWait();
    }

    public void mensaje(String contenido, Alert.AlertType alertType,String title){
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(contenido);
        alert.show();
    };
}
