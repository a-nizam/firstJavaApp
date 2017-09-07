package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class SampleController {

    public void send(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Привет!!!");
        alert.showAndWait();
        System.out.print("Привет!\r\n");
    }
}
