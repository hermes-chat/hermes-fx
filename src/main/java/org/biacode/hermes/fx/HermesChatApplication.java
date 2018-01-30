package org.biacode.hermes.fx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.biacode.hermes.fx.util.FxUtils;
import org.biacode.hermes.fx.util.Globals;

/**
 * Created by Arthur Asatryan.
 * Date: 1/31/18
 * Time: 2:01 AM
 */
public class HermesChatApplication extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {
        Globals.setPrimaryStage(primaryStage);
        FxUtils.swapScene("scenes/login.fxml");
        primaryStage.setTitle("HermesChat");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
