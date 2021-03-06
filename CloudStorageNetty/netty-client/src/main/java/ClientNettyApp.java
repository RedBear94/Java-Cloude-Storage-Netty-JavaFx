import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientNettyApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
        primaryStage.setTitle("Client Storage");
        primaryStage.setScene(new Scene(root, 1280, 840));
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        NettyController.stop();
    }
}
