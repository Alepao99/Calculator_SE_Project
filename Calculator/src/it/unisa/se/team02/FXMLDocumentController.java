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
 * @author aless
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField inputText;
    @FXML
    private TextField outputText;
    @FXML
    private ListView<?> mainList;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
