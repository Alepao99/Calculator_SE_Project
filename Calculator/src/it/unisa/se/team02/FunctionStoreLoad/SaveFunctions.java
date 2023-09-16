package it.unisa.se.team02.FunctionStoreLoad;

import it.unisa.se.team02.Operation.UserFunction;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

/**
 *
 * @author Team02
 */
public class SaveFunctions implements Strategy {

    @Override
    public void doOperation(ObservableList<UserFunction> functionK, AnchorPane rootPane) {
        FileChooser fc = new FileChooser();
        fc.setTitle("save Functions");
        File file = fc.showSaveDialog(rootPane.getScene().getWindow());
        try ( ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            out.writeObject(new ArrayList<>(functionK));
        } catch (IOException ex) {
            Logger.getLogger(SaveFunctions.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
