package it.unisa.se.team02.Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
import it.unisa.se.team02.ObservableStack.ObservableStack;
import it.unisa.se.team02.ComplexNumber.ComplexNumber;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    private TextField inputText;
    @FXML
    private TextField outputText;
    @FXML
    private ListView<ComplexNumber> mainList;

    ObservableStack<ComplexNumber> stack;
    private String currentNumber = "";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stack = new ObservableStack<>();
        mainList.setItems(stack);
    }

    /**
     *
     * This method captures the action of the user's click on number 0 and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addZero(ActionEvent event) {
        addNumber("0");
    }

    /**
     *
     * This method captures the action of the user's click on number 1 and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addOne(ActionEvent event) {
        addNumber("1");
    }

    /**
     *
     * This method captures the action of the user's click on number 2 and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addTwo(ActionEvent event) {
        addNumber("2");
    }

    /**
     *
     * This method captures the action of the user's click on number 3 and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addThree(ActionEvent event) {
        addNumber("3");
    }

    /**
     *
     * This method captures the action of the user's click on number 4 and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addFour(ActionEvent event) {
        addNumber("4");
    }

    /**
     *
     * This method captures the action of the user's click on number 5 and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addFive(ActionEvent event) {
        addNumber("5");
    }

    /**
     *
     * This method captures the action of the user's click on number 6 and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addSix(ActionEvent event) {
        addNumber("6");
    }

    /**
     *
     * This method captures the action of the user's click on number 7 and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addSeven(ActionEvent event) {
        addNumber("7");
    }

    /**
     *
     * This method captures the action of the user's click on number 8 and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addEight(ActionEvent event) {
        addNumber("8");
    }

    /**
     *
     * This method captures the action of the user's click on number 9 and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addNine(ActionEvent event) {
        addNumber("9");
    }

    /**
     *
     * This method captures the action of the user's click on number , and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addVirgola(ActionEvent event) {
        addNumber(",");
    }

    /**
     *
     * This method captures the action of the user's click on number 0 and calls
     * the addNumber method
     *
     * @see addNumber
     */
    @FXML
    private void addMeno(ActionEvent event) {
        addNumber("-");
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
    public void setResult(ComplexNumber complex) {
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
        ComplexNumber complex1 = stack.pop();
        ComplexNumber complex2 = stack.pop();
        stack.add(0, complex1.add(complex2));
        setResult(stack.top());
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
        ComplexNumber complex1 = stack.pop();
        ComplexNumber complex2 = stack.pop();
        stack.add(0, complex1.subtract(complex2));
        setResult(stack.top());
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
        ComplexNumber complex1 = stack.pop();
        ComplexNumber complex2 = stack.pop();
        stack.add(0, complex1.multiply(complex2));
        setResult(stack.top());
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
        ComplexNumber complex1 = stack.pop();
        ComplexNumber complex2 = stack.pop();
        stack.add(0, complex1.divide(complex2));
        setResult(stack.top());
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
        ComplexNumber complex = stack.pop();
        List<ComplexNumber> list = complex.sqrt();
        String s = "";
        for (ComplexNumber value : list) {
            s += value.toString() + "; ";
            stack.add(0, value);
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
        ComplexNumber complex = stack.pop();
        ComplexNumber complex1 = complex.invertSign();
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
        ComplexNumber complex;
        if (currentNumber.contains(",")) {
            float real = Float.parseFloat(currentNumber.split(",")[0]);
            float img = Float.parseFloat(currentNumber.split(",")[1]);
            complex = new ComplexNumber(real, img);
        } else {
            float real = Float.parseFloat(currentNumber);
            complex = new ComplexNumber(real, 0);
        }
        stack.add(0, complex);
        refresh();
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
}
