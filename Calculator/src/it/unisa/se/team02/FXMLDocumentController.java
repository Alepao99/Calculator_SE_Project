package it.unisa.se.team02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
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
    private void addOne(ActionEvent event) {
    }

    @FXML
    private void addSeven(ActionEvent event) {
    }

    @FXML
    private void addEight(ActionEvent event) {
    }

    @FXML
    private void addNine(ActionEvent event) {
    }

    @FXML
    private void addSix(ActionEvent event) {
    }

    @FXML
    private void addTwo(ActionEvent event) {
    }

    @FXML
    private void addThree(ActionEvent event) {
    }

    @FXML
    private void addFour(ActionEvent event) {
    }

    @FXML
    private void addFive(ActionEvent event) {
    }

    @FXML
    private void Add(ActionEvent event) {
    }

    @FXML
    private void Sub(ActionEvent event) {
    }

    @FXML
    private void Multiplication(ActionEvent event) {
    }

    @FXML
    private void Division(ActionEvent event) {
    }

    @FXML
    private void addZero(ActionEvent event) {
    }

    @FXML
    private void addVirgola(ActionEvent event) {
    }

    @FXML
    private void addMeno(ActionEvent event) {
    }

    @FXML
    private void Push(ActionEvent event) {
        ComplexNumber complex;
        if(currentNumber.contains(",")){
            float real = Float.parseFloat(currentNumber.split(",")[0]);
            float img = Float.parseFloat(currentNumber.split(",")[1]);
            complex = new ComplexNumber(real, img);
        }else{
            float real = Float.parseFloat(currentNumber);
            complex = new ComplexNumber(real, 0);
        }
        stack.add(0,complex); 
        refresh(); //formatto l'inputText
    }
    
    private void refresh() {
        currentNumber = "";
        updateTextField();
    }
    
    public void updateTextField() {
        inputText.setText(currentNumber);
    }

    @FXML
    private void Delete(ActionEvent event) {
    }

    @FXML
    private void Sqrt(ActionEvent event) {
    }

    @FXML
    private void InverterSign(ActionEvent event) {
    }

    @FXML
    private void quitApplication(ActionEvent event) {
    }
    
}
