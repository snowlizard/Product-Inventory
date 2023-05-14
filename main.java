import java.net.URL;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        URL url = getClass().getResource("Views/mainWindow.fxml");
        Parent root = FXMLLoader.load(url);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}