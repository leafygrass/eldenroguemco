package ccprog3.mco;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX Application entry point.
 */
public class Driver extends Application {

    /**
     * The main scene of the application.
     */
    private static Scene gameStart;

    /**
     * Starts the JavaFX application.
     *
     * @param stage The primary stage of the application.
     * @throws IOException If an error occurs while loading the FXML file.
     */
    @Override
    public void start(Stage stage) throws IOException {
        gameStart = new Scene(loadFXML("TitleScreen"), 1280, 720);
        stage.setScene(gameStart);
        stage.show();
    }

    /**
     * Sets the root FXML file for the scene.
     *
     * @param fxml The name of the FXML file.
     * @throws IOException If an error occurs while loading the FXML file.
     */
    public static void setRoot(String fxml) throws IOException {
        gameStart.setRoot(loadFXML(fxml));
    }

    /**
     * Loads an FXML file and returns its root element.
     *
     * @param fxml The name of the FXML file to load.
     * @return The root element of the loaded FXML file.
     * @throws IOException If an error occurs while loading the FXML file.
     */
    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * The main method of the application.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        launch();
    }

}