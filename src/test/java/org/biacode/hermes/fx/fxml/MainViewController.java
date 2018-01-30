package org.biacode.hermes.fx.fxml;

/**
 * Created by Arthur Asatryan.
 * Date: 1/30/18
 * Time: 1:45 AM
 */
public class MainViewController {

//    public TextArea connectionResult;
//    public TextField email;
//
//    public void handleLogin(final ActionEvent actionEvent) {
//        System.out.println("The email is: " + email.getText());
//        System.out.println(CHANNEL);
//        CHANNEL.writeAndFlush(new TextWebSocketFrame(
//                "{\"command\": \"account/create\", \"email\": \"" + email.getText() + "\"}"
//        ));
//        connectionResult.setText("Account created. Channel: " + CHANNEL);
//    }


    public void loginButtonClicked() {
        System.out.println("User logged in...");
    }

}
