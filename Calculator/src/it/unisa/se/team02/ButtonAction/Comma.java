/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.ButtonAction;

import it.unisa.se.team02.Alert.ShowInformation;
import javafx.scene.control.Alert;

/**
 *
 * @author aless
 */
public class Comma implements Creation {

    @Override
    public String execute(String currentNumber) {
        if (currentNumber.length() == 0) {
            ShowInformation info = new ShowInformation(Alert.AlertType.WARNING, "Possible insertion error",
                    "Please consider this insert example", "x\n-x\nx,x\n-x,x\nx,-x\n-x,-x");
            info.showAlert();
        } else {
            return ",";
        }
        return null;
    }

}
