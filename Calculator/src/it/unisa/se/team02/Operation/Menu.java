/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.Operation;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Team02
 */
public class Menu {

    List<Azione> list = new LinkedList<>();

    public void setCommand(String operator, Operation op) {
        list.add(new Azione(operator, op));
    }

    public void setCommand(String operator) {
        list.add(new Azione(operator));
    }

    public boolean isEmpty() {
        return list.isEmpty() ? true : false;
    }

    public Azione takeAction() {
        return list.remove(0);
    }

    public void removeAction() {
        list.remove(list.size() - 1);
    }
}
