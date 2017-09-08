package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    public TextField tfName;

    @FXML
    public void send(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, tfName.getText());
        alert.showAndWait();
        System.out.print("Привет!\r\n");
    }
}
