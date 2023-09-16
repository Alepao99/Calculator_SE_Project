package it.unisa.se.team02.ButtonAction;

import it.unisa.se.team02.Alert.ShowInformation;
import javafx.scene.control.Alert;

/**
 *
 * @author Team02
 */
public class Sign implements Creation {

    @Override
    public String execute(String currentNumber) {
        if ((currentNumber.length() == 0) || ((currentNumber.length() > 1) && (currentNumber.lastIndexOf(",") == currentNumber.length() - 1))) {
            return "-";
        }else {
            ShowInformation info = new ShowInformation(Alert.AlertType.WARNING, "Possible insertion error",
                    "Please consider this insert example", "x\n-x\nx,x\n-x,x\nx,-x\n-x,-x");
            info.showAlert();
            return null;
        }
    }

}
