package ccprog3.mco.Controllers;

import java.io.IOException;

import ccprog3.mco.Driver;
import javafx.fxml.FXML;

public class TitleScreenController {

    @FXML
    private void switchToCharacterCreation() throws IOException {
        Driver.setRoot("CharacterCreation");
    }

    @FXML
    private void exitGame() {
        System.exit(0);
    }


}
