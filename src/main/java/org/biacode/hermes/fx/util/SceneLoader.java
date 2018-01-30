package org.biacode.hermes.fx.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by Arthur Asatryan.
 * Date: 1/31/18
 * Time: 2:20 AM
 */
public class SceneLoader {
    public Optional<Parent> loadScene(final String fxmlFilePath) {
        try {
            return Optional.of(FXMLLoader.load(Objects.requireNonNull(getClass()
                    .getClassLoader()
                    .getResource(fxmlFilePath)
            )));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
