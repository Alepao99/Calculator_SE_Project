/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.FunctionStoreLoad;

import it.unisa.se.team02.Operation.UserFunction;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

/**
 *
 * @author Francesco
 */
public class LoadFunctions implements Strategy {

    @Override
    public void doOperation(ObservableList<UserFunction> functionK, AnchorPane rootPane) {
   
     FileChooser fc = new FileChooser();
        fc.setTitle("Load Functions");
        File file = fc.showOpenDialog(rootPane.getScene().getWindow());
        try ( ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            functionK.addAll((ArrayList) in.readObject());
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LoadFunctions.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
    

