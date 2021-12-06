/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.VariablesActions;

import java.util.LinkedList;
import java.util.List;
import javafx.scene.control.Button;

/**
 *
 * @author Francesco
 */
public class Menu {
    List<Azione> list = new LinkedList<>();
    public void setCommand(Button botton, Operation op){
        list.add(new Azione(botton,op));
    }
    
    public boolean isEmpty(){
        return list.isEmpty() ? true : false;
    }
    
    public Azione takeAction(){
        return list.remove(0);
    }
    
    public void removeAction(){
        list.remove(list.size()-1);
    }
}
