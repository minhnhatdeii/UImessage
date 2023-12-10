package test.messenger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent mess = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Messenger.fxml")));
        Scene scene = new Scene(mess);
        stage.setTitle("Messenger");
        stage.setScene(scene);
        stage.show();
    }
}
