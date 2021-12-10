package it.unisa.se.team02.Alert;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author Team02
 */
public class ShowInformation {

    private AlertType type;
    private String title;
    private String header;
    private String content;

    public ShowInformation(AlertType type, String title, String header, String content) {
        this.type = type;
        this.title = title;
        this.header = header;
        this.content = content;
    }
    
    /**
     * 
     * The showAlert method displays a window with an alert type, title, header and contest
     * 
    */
    public void showAlert() {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
