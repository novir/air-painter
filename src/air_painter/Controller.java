package air_painter;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label introMessage;

    public void printIntroInfo(ActionEvent actionEvent) {
        introMessage.setText("Start !");
    }
}
