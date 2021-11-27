package it.unisa.se.team02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
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
 *
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

    @FXML
    private void addZero(ActionEvent event) {
        addNumber("0");
    }

    @FXML
    private void addOne(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    private void addTwo(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    private void addThree(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    private void addFour(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    private void addFive(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    private void addSix(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    private void addSeven(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    private void addEight(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    private void addNine(ActionEvent event) {
        addNumber("9");
    }

    @FXML
    private void addVirgola(ActionEvent event) {
        addNumber(",");
    }

    @FXML
    private void addMeno(ActionEvent event) {
        addNumber("-");
    }

    public void addNumber(String number) {
        currentNumber += number;
        updateTextField();
    }

    private void refresh() {
        currentNumber = "";
        updateTextField();
    }

    public void updateTextField() {
        inputText.setText(currentNumber);
    }

    public void setResult(ComplexNumber complex) {
        outputText.setText(complex.toString());
    }

    @FXML
    private void quitApplication(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void add(ActionEvent event) {
        ComplexNumber complex1 = stack.pop();
        ComplexNumber complex2 = stack.pop();
        stack.add(0, complex1.add(complex2));
        setResult(stack.top());
    }

    @FXML
    private void sub(ActionEvent event) {
        ComplexNumber complex1 = stack.pop();
        ComplexNumber complex2 = stack.pop();
        stack.add(0, complex1.subtract(complex2));
        setResult(stack.top());
    }

    @FXML
    private void multiplication(ActionEvent event) {
        ComplexNumber complex1 = stack.pop();
        ComplexNumber complex2 = stack.pop();
        stack.add(0, complex1.multiply(complex2));
        setResult(stack.top());
    }

    @FXML
    private void division(ActionEvent event) {
        ComplexNumber complex1 = stack.pop();
        ComplexNumber complex2 = stack.pop();
        stack.add(0, complex1.divide(complex2));
        setResult(stack.top());
    }

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
        refresh(); //formatto l'inputText
    }

    @FXML
    private void delete(ActionEvent event) {
        String s = currentNumber.substring(0, currentNumber.length() - 1);
        currentNumber = s;
        updateTextField();
    }

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

    @FXML
    private void inverterSign(ActionEvent event) {
        ComplexNumber complex = stack.pop();
        ComplexNumber complex1 = complex.invertSign();
        stack.add(0, complex1);
        outputText.setText(complex1.toString());
    }
}
