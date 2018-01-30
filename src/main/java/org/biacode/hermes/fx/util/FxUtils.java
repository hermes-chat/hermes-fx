package org.biacode.hermes.fx.util;

import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Created by Arthur Asatryan.
 * Date: 1/31/18
 * Time: 2:15 AM
 */
public class FxUtils {

    private static final SceneLoader SCENE_LOADER = new SceneLoader();

    private FxUtils() {
    }

    public static void swapScene(final String fxmlFilePath) {
        final Parent root = SCENE_LOADER.loadScene(fxmlFilePath)
                .orElseThrow(() -> new IllegalArgumentException("Invalid fxml file passed to scene loader."));
        Globals.getPrimaryStage().setScene(new Scene(root));
    }
}
