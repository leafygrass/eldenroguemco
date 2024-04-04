package ccprog3.mco;

import java.io.IOException;
import javafx.fxml.FXML;

public class TitleScreenController {

    @FXML
    private void switchToCharacterCreation() throws IOException {
        Driver.setRoot("CharacterCreation");
    }

    @FXML
    public void exitGame() {
        System.exit(0);
    }
    
    
}
