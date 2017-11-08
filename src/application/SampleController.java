package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class SampleController {
	Stage primaryStage;

	@FXML
	private Button btnSalida;

	@FXML
	void cerrar(MouseEvent event) {
		System.exit(0);
	}
//ESTO ES UNA PRUEBA 
	@FXML
	void emergente(MouseEvent event) {

		try {
			abreVentana();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private void abreVentana() throws IOException {
		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Sample2.fxml"));
			AnchorPane root1 = (AnchorPane) fxmlLoader.load();

			Stage stage = new Stage();
			Window stagePrincipal = null;
			stage.initOwner(stagePrincipal);
			Scene scene = new Scene(root1);

			Image image = new Image("imagenes/Batman.png");
			scene.setCursor(new ImageCursor(image));

			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {

		}
	}

	@FXML
	void cerrarEmergente(MouseEvent event) {

		Stage thisStage = (Stage) btnSalida.getScene().getWindow();
		thisStage.close();
	}
}
