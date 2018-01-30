package org.biacode.hermes.fx.fxml;

import io.netty.channel.Channel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * Created by Arthur Asatryan.
 * Date: 1/30/18
 * Time: 12:41 AM
 */
public class FxmlApp extends Application {

    public static Channel CHANNEL;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        final Parent root = FXMLLoader.load(Objects.requireNonNull(
                getClass()
                        .getClassLoader()
                        .getResource("mainView.fxml")
        ));
        primaryStage.setTitle("HermesChat");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
//        try {
//            CHANNEL = getClientChannel()
//                    .orElseThrow(() -> new IllegalArgumentException("can not connect to the websocket server"));
//        } catch (final Exception e) {
//            e.printStackTrace();
//        }
        launch(args);
    }
}
