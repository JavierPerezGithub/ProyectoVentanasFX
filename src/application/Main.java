package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;

/**
 * The main class
 * @author Javier Pérez
 * @version 1-2017
 * @since 24-11-2017
 * @see SampleController
 */
public class Main extends Application {
	
	/** The image. */
	Image image;
	
	/**
	 * @param primaryStage the primary stage
	 * metodStart(Stage primaryStage)
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,640,480);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Image image = new Image("imagenes/Batman.png");
			scene.setCursor(new ImageCursor(image));
			Font.loadFont(getClass().getResourceAsStream("Pacifico-Regular.ttf"),20);
			Font.loadFont(getClass().getResourceAsStream("Vacations"),20);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
