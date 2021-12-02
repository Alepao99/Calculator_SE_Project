/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.ObservableStack;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * The class implements the calculator's "memory" concept using an observable LinkedList.
 * 
 * @author Team02
 * 
 */
public class ObservableStack<ComplexNumber> extends SimpleListProperty<ComplexNumber> {

    private final LinkedList<ComplexNumber> stack;

    /**
     * 
     * The class constructor creates an observable LinkedList.
     * 
    */
    public ObservableStack() {
        this.stack = new LinkedList<>();
        this.set(FXCollections.observableList(this.stack));
    }

    /**
     * 
     * The top method returns the first element in the stack but without removing it.
     * 
     * @return 
     * Return a ComplexNumber.
    */
    public ComplexNumber top() throws NoSuchElementException {
        ComplexNumber temp = stack.peekFirst();
        return temp;
    }

    /**
     * 
     * The pop method returns the first element in the stack and remove it.
     * 
     * @return 
     * Return a ComplexNumber.
    */
    public ComplexNumber pop() throws NoSuchElementException {
        ComplexNumber temp = stack.removeFirst();
        return temp;

    }
}
