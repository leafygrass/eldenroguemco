package ccprog3.mco;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class Driver extends Application {

    private static Scene gameStart;

    @Override
    public void start(Stage stage) throws IOException {
        gameStart = new Scene(loadFXML("TitleScreen"), 1280, 720);
        stage.setScene(gameStart);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        gameStart.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}