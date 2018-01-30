package org.biacode.hermes.fx.fxml;

import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static org.biacode.hermes.fx.fxml.FxmlApp.CHANNEL;

/**
 * Created by Arthur Asatryan.
 * Date: 1/30/18
 * Time: 1:45 AM
 */
public class MainView {

    public TextArea connectionResult;
    public TextField email;

    public void handleLogin(final ActionEvent actionEvent) {
        System.out.println("The email is: " + email.getText());
        System.out.println(CHANNEL);
        CHANNEL.writeAndFlush(new TextWebSocketFrame(
                "{\"command\": \"account/create\", \"email\": \"" + email.getText() + "\"}"
        ));
        connectionResult.setText("Account created. Channel: " + CHANNEL);
    }
}
