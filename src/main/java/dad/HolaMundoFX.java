package dad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HolaMundoFX extends Application {
    
    public void start(Stage primaryStage) throws Exception {
        Label saludoLabel = new Label();
        saludoLabel.setText("Aquí saldrá el salduo");
        saludoLabel.setLayoutX(20);
        saludoLabel.setLayoutY(20);

        Button saludarButton = new Button();
        saludarButton.setText("Saludar");
        saludarButton.setLayoutX(20);
        saludarButton.setLayoutY(80);
        saludarButton.setOnAction(e -> saludoLabel.setText("¡Hola Mundo!"));

        Pane rootPanel = new Pane();
        rootPanel.getChildren().addAll(saludoLabel, saludarButton);

        Scene scene = new Scene(rootPanel, 320, 200);
        
        primaryStage.setTitle("Hola mundo en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
