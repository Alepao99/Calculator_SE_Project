package it.unisa.se.team02.Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
import it.unisa.se.team02.Alert.ShowInformation;
import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.ComplexNumber.CartesianComplex;
import it.unisa.se.team02.ComplexNumber.*;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * This class allows you to interact with the application interface by capturing
 * user actions
 *
 * @version n.n (gg-mm-aaaa)
 * @author Team02
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Label inputText;
    @FXML
    private Label outputText;
    @FXML
    private ListView<CartesianComplex> mainList;

    ObservableStack<CartesianComplex> stack;
    private String currentNumber = "";
    private ShowInformation info;

    @FXML
    private Label outputSign;
    @FXML
    private Button z;
    @FXML
    private Button m;
    @FXML
    private Button y;
    @FXML
    private Button x;
    @FXML
    private Button w;
    @FXML
    private Button l;
    @FXML
    private Button k;
    @FXML
    private Button j;
    @FXML
    private Button v;
    @FXML
    private Button i;
    @FXML
    private Button u;
    @FXML
    private Button h;
    @FXML
    private Button t;
    @FXML
    private Button g;
    @FXML
    private Button s;
    @FXML
    private Button r;
    @FXML
    private Button f;
    @FXML
    private Button e;
    @FXML
    private Button q;
    @FXML
    private Button d;
    @FXML
    private Button p;
    @FXML
    private Button o;
    @FXML
    private Button n;
    @FXML
    private Button c;
    @FXML
    private Button b;
    @FXML
    private Button a;
    @FXML
    private Button four;
    @FXML
    private Button clear;
    @FXML
    private Button nine;
    @FXML
    private Button eight;
    @FXML
    private Button drop;
    @FXML
    private Button greater;
    @FXML
    private Button minor;
    @FXML
    private Button sumVar;
    @FXML
    private Button seven;
    @FXML
    private Button over;
    @FXML
    private Button dup;
    @FXML
    private Button swap;
    @FXML
    private Button comma;
    @FXML
    private Button zero;
    @FXML
    private Button sign;
    @FXML
    private Button three;
    @FXML
    private Button two;
    @FXML
    private Button one;
    @FXML
    private Button six;
    @FXML
    private Button five;
    @FXML
    private Button subVar;
    @FXML
    private Button dot;
    @FXML
    private ListView<?> variableList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stack = new ObservableStack<>();
        mainList.setItems(stack);
    }

    /**
     * This method allows you to enter the complex number by clicking on the
     * button
     *
     * @param event
     */
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Button source = (Button) event.getSource();
        if (source == comma) {
            addComma();
            return;
        }
        if (source == sign) {
            addLess();
            return;
        }
        if (source == dot) {
            addChar(".");
            return;
        }
        if (source == zero) {
            addChar("0");
            return;
        }
        if (source == one) {
            addChar("1");
            return;
        }
        if (source == two) {
            addChar("2");
            return;
        }
        if (source == three) {
            addChar("3");
            return;
        }
        if (source == four) {
            addChar("4");
            return;
        }
        if (source == five) {
            addChar("5");
            return;
        }
        if (source == six) {
            addChar("6");
            return;
        }
        if (source == seven) {
            addChar("7");
            return;
        }
        if (source == eight) {
            addChar("8");
            return;
        }
        if (source == nine) {
            addChar("9");
            return;
        }
    }

    @FXML
    private void deleteOperationSign(ActionEvent event) {
    }

    @FXML
    private void handleVariablesAction(ActionEvent event) {
    }

    @FXML
    private void handleManipulationCommand(ActionEvent event) {
        Button source = (Button) event.getSource();
        if (source == swap) {
            if (stack.size() < 2) {
                info = new ShowInformation(Alert.AlertType.ERROR, "Error", "Swap", "The swap operation requires two complex numbers");
                info.showAlert();
            } else {
                stack.swap();
                return;
            }
        }
        if (source == drop) {
            if (stack.size() < 1) {
                info = new ShowInformation(Alert.AlertType.ERROR, "Error", "Drop", "The drop operation requires two complex numbers");
                info.showAlert();
            } else {
                stack.drop();
                return;
            }
        }
    }

    /**
     * This method performs the addition operation between the two complex
     * numbers at the top of the stack and updates the top of the stack with the
     * result of the operation
     */
    @FXML
    private void add(ActionEvent event) {
        if (stack.size() < 2) {
            info = new ShowInformation(Alert.AlertType.ERROR, "Error", "Addition", "The addition operation requires two complex numbers");
            info.showAlert();
        } else {
            CartesianComplex[] complex = {stack.pop(), stack.pop()};
            stack.push(complex[0].add(complex[1]));
            setResult(stack.peek());
        }
    }

    /**
     *
     * This method performs the subtraction operation between the two complex
     * numbers at the top of the stack and updates the top of the stack with the
     * result of the operation
     *
     */
    @FXML
    private void sub(ActionEvent event) {
        if (stack.size() < 2) {
            info = new ShowInformation(Alert.AlertType.ERROR, "Error", "Subtraction", "The subtraction operation requires two complex numbers");
            info.showAlert();
        } else {
            CartesianComplex[] complex = {stack.pop(), stack.pop()};
            stack.push(complex[0].subtract(complex[1]));
            setResult(stack.peek());
        }
    }

    /**
     * This method performs the multiplication operation between the two complex
     * numbers at the top of the stack and updates the top of the stack with the
     * result of the operation
     */
    @FXML
    private void multiplication(ActionEvent event) {
        if (stack.size() < 2) {
            info = new ShowInformation(Alert.AlertType.ERROR, "Error", "Moltiplication", "The moltiplication operation requires two complex numbers");
            info.showAlert();
        } else {
            CartesianComplex[] complex = {stack.pop(), stack.pop()};
            stack.push(complex[0].multiply(complex[1]));
            setResult(stack.peek());
        }
    }

    /**
     * This method performs the division operation between the two complex
     * numbers at the top of the stack and updates the top of the stack with the
     * result of the operation
     */
    @FXML
    private void division(ActionEvent event) {
        if (stack.size() < 2) {
            info = new ShowInformation(Alert.AlertType.ERROR, "Error", "Division", "The division operation requires two complex numbers");
            info.showAlert();
        } else {
            CartesianComplex[] complex = {stack.pop(), stack.pop()};
            stack.push(complex[0].divide(complex[1]));
            setResult(stack.peek());
        }
    }

    /**
     * This method performs the sqrt operation with a complex number and updates
     * the top of the stack with the result of the operation
     */
    @FXML
    private void sqrt(ActionEvent event) {
        if (stack.size() < 1) {
            info = new ShowInformation(Alert.AlertType.ERROR, "Error", "Square root", "The square root operation requires one complex numbers");
            info.showAlert();
        } else {
            CartesianComplex complex = stack.pop();
            TrigonometricComplex trigcomplex = (TrigonometricComplex) ComplexFactory.createComplex(ComplexType.TRIGONOMETRIC, complex.getReal(), complex.getImg());
            List<CartesianComplex> list = trigcomplex.sqrt();
            String s = "";
            for (CartesianComplex value : list) {
                s += value.toString() + "; ";
                stack.push(value);
            }
            outputText.setText(s);
        }
    }

    /**
     * This method inverts the signs of the real and imaginary part of the
     * complex number
     */
    @FXML
    private void inverterSign(ActionEvent event) {
        if (stack.size() < 1) {
            info = new ShowInformation(Alert.AlertType.ERROR, "Error", "Inverter Sign", "The inverter sign operation requires one complex numbers");
            info.showAlert();
        } else {
            CartesianComplex complex = stack.pop().invertSign();
            stack.push(complex);
            outputText.setText(complex.toString());
        }
    }

    /**
     * The push method creates a ComplexNumber starting from the string inserted
     * in input via the interface, stored in the variable "currentNumber". It
     * then adds the new ComplexNumber to the Stack and calls the refresh ()
     * method. Return Void.
     */
    @FXML
    private void push(ActionEvent event) {
        if (checkInput(currentNumber)) {
            Complex complex = currentNumber.contains(",")
                    ? ComplexFactory.createComplex(ComplexType.CARTESIAN, Double.valueOf(currentNumber.split(",")[0]), Double.valueOf(currentNumber.split(",")[1]))
                    : ComplexFactory.createComplex(ComplexType.CARTESIAN, Double.valueOf(currentNumber), Double.valueOf("0"));
            stack.push((CartesianComplex) complex);
            refresh(); //formatto l'inputText
        } else {
            info = new ShowInformation(Alert.AlertType.ERROR, "Insertion error",
                    "Please consider this insert example", "x\n-x\nx,x\n-x,x\nx,-x\n-x,-x");
            info.showAlert();
        }

    }

    /**
     * This method allows the deletion of a character or number from the
     * inpuText, updating the current number
     */
    @FXML
    private void delete(ActionEvent event) {
        currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
        updateTextField();
    }

    /**
     * This method allows to understand if the entered text is correct
     *
     * @param s String
     * @return a boolean type
     */
    private boolean checkInput(String s) {
        return s.contains(",") && s.chars().filter(ch -> ch == ',').count() == 1 ? s.matches("-?[0-9]*.?[0-9]+,{1}-?[0-9]*.?[0-9]+") : s.matches("-?[0-9]*.?[0-9]+");
    }

    /**
     * This method concatenates the correct number and updates the input text
     *
     * @param character number or character that is captured by the user
     */
    public void addChar(String character) {
        currentNumber += character;
        updateTextField();
    }

    /**
     * The refresh method initializes the variable "currentNumber" and calls the
     * updateTextField() method. Return Void.
     *
     * @see updateTextField
     */
    private void refresh() {
        currentNumber = "";
        updateTextField();
    }

    /**
     * The updateTextField method sets the content of the variable
     * "currentNumber" in the input area of ​​the interface. Return Void.
     */
    public void updateTextField() {
        inputText.setText(currentNumber);
    }

    /**
     * This method updates the output text with the result of an operation
     *
     * @param complex this parameter contains the result of the operation and is
     * a complex number
     */
    public void setResult(CartesianComplex complex) {
        outputText.setText(complex.toString());
    }

    /**
     *
     * This method close the application
     *
     */
    @FXML
    private void quitApplication(ActionEvent event) {
        Platform.exit();
    }

    /**
     * This method allows me to insert comma to separate the real part and the
     * imaginary part when entering the complex number
     */
    private void addComma() {
        if (currentNumber.length() == 0) {
            //Insert alert class fow show problems
        } else if (currentNumber.lastIndexOf(",") == currentNumber.length() - 1) {
            currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
            updateTextField();
        } else {
            addChar(",");
        }
    }

    /**
     * This method allows you to enter the minus in order to have negative
     * numbers
     */
    private void addLess() {
        if (currentNumber.length() == 0) {
            addChar("-");
        } else if (currentNumber.lastIndexOf("-") == currentNumber.length() - 1) {
            currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
            updateTextField();
        } else {
            addChar("-");
        }
    }
}
