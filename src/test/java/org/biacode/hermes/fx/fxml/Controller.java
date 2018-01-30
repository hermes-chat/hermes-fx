package org.biacode.hermes.fx.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Arthur Asatryan.
 * Date: 1/30/18
 * Time: 1:00 AM
 */
public class Controller implements Initializable {

    public Label label1;
    public Button button;

    @Override
    public void initialize(final URL location, final ResourceBundle resources) {
        System.out.println("Loading user data...");
    }

    public void handleButtonClicked(final ActionEvent actionEvent) {
        System.out.println("Button has been clicked");
    }
}
