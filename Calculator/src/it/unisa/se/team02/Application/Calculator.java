package it.unisa.se.team02.Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Team02
 */
public class Calculator extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));

        Scene scene = new Scene(root);
        stage.setResizable(true);
        stage.setTitle("Calculator Complex");
        stage.getIcons().add(new Image(getClass().getResource("/it/unisa/se/team02/StyleCalculator/CalculatorIcon.png").toExternalForm()));
        scene.getStylesheets().add("/it/unisa/se/team02/StyleCalculator/ApplicationStyle.css");
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
