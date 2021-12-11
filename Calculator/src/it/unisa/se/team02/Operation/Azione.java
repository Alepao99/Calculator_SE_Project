package it.unisa.se.team02.Operation;

/**
 *
 * @author Team02
 */
public class Azione {
    private String op;
    private Operation command;

    public Azione(String op, Operation command) {
        this.op = op;
        this.command = command;
    }

    public Azione(String op) {
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public Operation getCommand() {
        return command;
    }

    public void setCommand(Operation command) {
        this.command = command;
    }
    
}
