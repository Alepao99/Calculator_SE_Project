/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author aless
 * @param <ComplexNumber>
 */
public class ObservableStack<ComplexNumber> extends SimpleListProperty<ComplexNumber> {

    private final LinkedList<ComplexNumber> stack;

    public ObservableStack() {
        this.stack = new LinkedList<>();
        this.set(FXCollections.observableList(this.stack));
    }

    public ComplexNumber top() throws NoSuchElementException {
        ComplexNumber temp = stack.peekFirst();
        return temp;
    }

    /**
     * @return the item at the top of the stack granted that the stack is not
     * empty
     * @throws NoSuchElementException if the stack is empty
     */
    public ComplexNumber pop() throws NoSuchElementException {
        ComplexNumber temp = stack.removeFirst();
        return temp;

    }
}
