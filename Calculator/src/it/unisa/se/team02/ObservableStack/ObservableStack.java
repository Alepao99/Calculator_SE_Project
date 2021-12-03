/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.ObservableStack;

import java.util.Iterator;
import java.util.Stack;
import javafx.collections.ObservableListBase;

/**
 * The class implements the calculator's "memory" concept using a Stack.
 * 
 * @author Team02
 * 
 */
public class ObservableStack<E> extends ObservableListBase<E> {

    private final Stack<E> stack;

    /**
     * 
     * The class constructor creates an observable LinkedList.
     * 
    */
    public ObservableStack() {
        stack = new Stack<>();
    }
    
    /**
     * 
     * The push method puts an object within the stack
     * 
     * @return 
     * Return True if the entry is successful, False otherwise.
    */
    public boolean push(E e) {
        beginChange();
        try {
            stack.push(e);
            nextAdd(stack.size() - 1, stack.size());
            return true;
        } finally {
            endChange();
        }
    }

    /**
     * 
     * The peek method returns the first element in the stack but without removing it.
     * 
     * @return 
     * Return an Object.
    */
    public E peek(){
        return stack.peek();
        
    }

    /**
     * 
     * The pop method returns the first element in the stack and remove it.
     * 
     * @return 
     * Return an Object.
    */
    public E pop()  {
        beginChange();
        try {
            E e = stack.pop();
            nextRemove(stack.size() - 1, e);
            return e;
        } finally {
            endChange();
        }
    }

    @Override
    public E get(int index) {
        Iterator<E> iterator = stack.iterator();
        for (int i = 0; i < index; i++) {
            iterator.next();
        }
        return iterator.next();
    }

    @Override
    public int size() {
        return stack.size();
    }
    
    /**
     * 
     * The swap method reverses the last two objects on the stack.
     * 
    */
    public void swap() {
        E e1 = pop();
        E e2 = pop();
        push(e1);
        push(e2);
    }
}
