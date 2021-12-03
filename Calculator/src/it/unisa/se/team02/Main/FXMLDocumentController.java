package it.unisa.se.team02.Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
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
import javafx.scene.control.TextField;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stack = new ObservableStack<>();
        mainList.setItems(stack);
    }

    /**
     *
     * This method concatenates the correct number and updates the input text
     *
     * @param character number or character that is captured by the user
     * 
     *
     */
    public void addNumber(String character) {
        currentNumber += character;
        updateTextField();
    }

    /**
     * 
     * The refresh method initializes the variable "currentNumber" and calls the updateTextField() method. Return Void.
     * 
     * @see updateTextField
    */
    private void refresh() {
        currentNumber = "";
        updateTextField();
    }

    /**
     * 
     * The updateTextField method sets the content of the variable "currentNumber" in the input area of ​​the interface. Return Void.
     * 
    */
    public void updateTextField() {
        inputText.setText(currentNumber);
    }

    /**
     *
     * This method updates the output text with the result of an operation
     *
     * @param complex this parameter contains the result of the operation and is
     * a complex number
     *
     *
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
     *
     * This method performs the addition operation between the two complex
     * numbers at the top of the stack and updates the top of the stack with the
     * result of the operation
     *
     */
    @FXML
    private void add(ActionEvent event) {
        CartesianComplex complex1 = stack.pop();
        CartesianComplex complex2 = stack.pop();
        stack.add(0, complex1.add(complex2));
        setResult(stack.peek());
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
        CartesianComplex complex1 = stack.pop();
        CartesianComplex complex2 = stack.pop();
        stack.add(0, complex1.subtract(complex2));
        setResult(stack.peek());
    }

    /**
     *
     * This method performs the multiplication operation between the two complex
     * numbers at the top of the stack and updates the top of the stack with the
     * result of the operation
     *
     */
    @FXML
    private void multiplication(ActionEvent event) {
        CartesianComplex complex1 = stack.pop();
        CartesianComplex complex2 = stack.pop();
        stack.add(0, complex1.multiply(complex2));
        setResult(stack.peek());
    }

    /**
     *
     *
     * This method performs the division operation between the two complex
     * numbers at the top of the stack and updates the top of the stack with the
     * result of the operation
     *
     */
    @FXML
    private void division(ActionEvent event) {
        CartesianComplex complex1 = stack.pop();
        CartesianComplex complex2 = stack.pop();
        stack.add(0, complex1.divide(complex2));
        setResult(stack.peek());
    }

    /**
     *
     *
     * This method performs the sqrt operation with a complex number and updates
     * the top of the stack with the result of the operation
     *
     */
    @FXML
    private void sqrt(ActionEvent event) {
        CartesianComplex complex = stack.pop();
        TrigonometricComplex trigcomplex = (TrigonometricComplex) ComplexFactory.createComplex(ComplexType.TRIGONOMETRIC, complex.getReal(), complex.getImg());
        List<CartesianComplex> list = trigcomplex.sqrt();
        String s = "";
        for (CartesianComplex value : list) {
            s += value.toString() + "; ";
            //stack.push(value);
        }
        outputText.setText(s);
    }

    /**
     *
     * This method inverts the signs of the real and imaginary part of the
     * complex number
     *
     */
    @FXML
    private void inverterSign(ActionEvent event) {
        CartesianComplex complex = stack.pop();
        CartesianComplex complex1 = complex.invertSign();
        stack.add(0, complex1);
        outputText.setText(complex1.toString());
    }

   /**
    * 
    * The push method creates a ComplexNumber starting from the string inserted in input via the interface,
    * stored in the variable "currentNumber". It then adds the new ComplexNumber to the Stack and calls the refresh () method.
    * Return Void.
    * 
    */
    @FXML
    private void push(ActionEvent event) {
        Complex complex = currentNumber.contains(",")
        ? ComplexFactory.createComplex(ComplexType.CARTESIAN, Double.valueOf(currentNumber.split(",")[0]), Double.valueOf(currentNumber.split(",")[1]))
        : ComplexFactory.createComplex(ComplexType.CARTESIAN, Double.valueOf(currentNumber), Double.valueOf("0"));
        stack.push((CartesianComplex) complex);
        refresh(); //formatto l'inputText
        
    }

    /**
     *
     * This method allows the deletion of a character and / or number from the
     * inpuText, updating the current number
     */
    @FXML
    private void delete(ActionEvent event) {
        String s = currentNumber.substring(0, currentNumber.length() - 1);
        currentNumber = s;
        updateTextField();
    }

    @FXML
    private void deleteOperationSign(ActionEvent event) {
    }

    @FXML
    private void handleVariablesAction(ActionEvent event) {
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }

    @FXML
    private void handleManipulationCommand(ActionEvent event) {//fare bottoni ed eliminare le vecchie
    }
}
