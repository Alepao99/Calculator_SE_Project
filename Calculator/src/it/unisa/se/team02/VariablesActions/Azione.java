/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.se.team02.VariablesActions;

import javafx.scene.control.Button;

/**
 *
 * @author Francesco
 */
public class Azione {
    private Button op;
    private Operation command;

    public Azione(Button op, Operation command) {
        this.op = op;
        this.command = command;
    }

    public Button getOp() {
        return op;
    }

    public void setOp(Button op) {
        this.op = op;
    }

    public Operation getCommand() {
        return command;
    }

    public void setCommand(Operation command) {
        this.command = command;
    }
    
}
